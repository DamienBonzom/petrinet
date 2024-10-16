package petrinet.validation;

import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import petrinet.Lien;
import petrinet.PetriElement;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.Transition;
import petrinet.Zone;
import petrinet.util.PetrinetSwitch;


/**
 * Réalise la validation d'un EObject issu de PetriNet (en théorie, d'un réseau).
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement (cf. caseProcess typiquement).
 * 
 * La classe Switch exige un paramètre de généricité (et gère une partie de la visite à
 * base de comparaison à null). Ici le paramètre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @author Groupe M-01
 * @version 0.1
 */
public class PetriNetValidator extends PetrinetSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public PetriNetValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est un Petri.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean casePetri(petrinet.Petri object) {
		// Contraintes sur Petri
		//  Le nom du réseau doit respecter les conventions Java.
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom du réseau ne respecte pas les conventions Java");
		
		// Visite
		for (PetriElement pe : object.getElements()) {
			this.doSwitch(pe);
		}
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un PetriElement (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean casePetriElement(PetriElement object) {
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un Lien.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseLien(Lien object) {
		// Contraintes sur Liens
		//  Un lien ne peut pas lier une zone à elle-même
		this.result.recordIfFailed(
				!object.getPredecesseur().equals(object.getSuccesseur()), 
				object,
				"Le lien relie la zone " + object.getPredecesseur().getNom_zone() + " à elle-même");
		
		// 	Un lien ne peut pas lier deux zones de même type
		this.result.recordIfFailed(
				!(object.getPredecesseur().getClass() == object.getSuccesseur().getClass()),
				object,
				"Un lien ne peut pas lier deux zones de même type" );

		//  Il ne peut pas y avoir deux liens entre les mêmes zones
		this.result.recordIfFailed(
				object.getPredecesseur().getSuccesseurs().stream().allMatch(l -> (l.equals(object)) || l.getSuccesseur() != object.getSuccesseur()), 
				object, 
				"Il y a deux liens ou plus entre" + object.getPredecesseur().getNom_zone() + " et" + object.getSuccesseur().getNom_zone() + ".");
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Zone.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseZone(Zone object) {
		// Contraintes sur Zone
		// 	Le nom de la zone doit respecter les conventions Java
		this.result.recordIfFailed(
				object.getNom_zone() != null || object.getNom_zone().matches(IDENT_REGEX), 
				object, 
				"Le nom de la zone ne respecte pas les conventions Java");
		
		// 	Deux zones ne doivent pas avoir le même nom
		this.result.recordIfFailed(
				object.getPetri().getElements().stream()
					.filter(p -> p.eClass().getClassifierID() == PetrinetPackage.ZONE)
					.allMatch(pe -> (pe.equals(object) || !((Zone) pe).getNom_zone().contains(object.getNom_zone()))),
				object, 
				"Le nom de la zone (" + object.getNom_zone() + ") n'est pas unique");
	
		return null;
	}

	@Override
	public Boolean casePlace(Place object ) {
		// Contraintes sur Places
		// 	Une place doit compter un nombre positif ou nul de jetons
		this.result.recordIfFailed(
				object.getNbr_jetons() >= 0, 
				object, 
				"Une place doit compter un nombre positif ou nul de jetons");
		return null;
	}
	
	@Override
	public Boolean caseTransition(Transition object) {
		return null;
	}
	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}
