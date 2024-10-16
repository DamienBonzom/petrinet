/**
 */
package petrinet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see petrinet.PetrinetFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petrinet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetPackage eINSTANCE = petrinet.impl.PetrinetPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinet.impl.PetriImpl <em>Petri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet.impl.PetriImpl
	 * @see petrinet.impl.PetrinetPackageImpl#getPetri()
	 * @generated
	 */
	int PETRI = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI__NOM = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Petri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Petri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinet.impl.PetriElementImpl <em>Petri Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet.impl.PetriElementImpl
	 * @see petrinet.impl.PetrinetPackageImpl#getPetriElement()
	 * @generated
	 */
	int PETRI_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Petri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_ELEMENT__PETRI = 0;

	/**
	 * The number of structural features of the '<em>Petri Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Petri Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinet.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet.impl.ZoneImpl
	 * @see petrinet.impl.PetrinetPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 5;

	/**
	 * The feature id for the '<em><b>Petri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__PETRI = PETRI_ELEMENT__PETRI;

	/**
	 * The feature id for the '<em><b>Predecesseurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__PREDECESSEURS = PETRI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successeurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__SUCCESSEURS = PETRI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nom zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NOM_ZONE = PETRI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = PETRI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = PETRI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet.impl.PlaceImpl
	 * @see petrinet.impl.PetrinetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

	/**
	 * The feature id for the '<em><b>Petri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PETRI = ZONE__PETRI;

	/**
	 * The feature id for the '<em><b>Predecesseurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PREDECESSEURS = ZONE__PREDECESSEURS;

	/**
	 * The feature id for the '<em><b>Successeurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__SUCCESSEURS = ZONE__SUCCESSEURS;

	/**
	 * The feature id for the '<em><b>Nom zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NOM_ZONE = ZONE__NOM_ZONE;

	/**
	 * The feature id for the '<em><b>Nbr jetons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NBR_JETONS = ZONE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = ZONE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = ZONE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet.impl.TransitionImpl
	 * @see petrinet.impl.PetrinetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Petri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PETRI = ZONE__PETRI;

	/**
	 * The feature id for the '<em><b>Predecesseurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PREDECESSEURS = ZONE__PREDECESSEURS;

	/**
	 * The feature id for the '<em><b>Successeurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SUCCESSEURS = ZONE__SUCCESSEURS;

	/**
	 * The feature id for the '<em><b>Nom zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NOM_ZONE = ZONE__NOM_ZONE;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = ZONE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = ZONE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petrinet.impl.LienImpl <em>Lien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinet.impl.LienImpl
	 * @see petrinet.impl.PetrinetPackageImpl#getLien()
	 * @generated
	 */
	int LIEN = 4;

	/**
	 * The feature id for the '<em><b>Petri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__PETRI = PETRI_ELEMENT__PETRI;

	/**
	 * The feature id for the '<em><b>Predecesseur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__PREDECESSEUR = PETRI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successeur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__SUCCESSEUR = PETRI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is read arc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__IS_READ_ARC = PETRI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Poids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__POIDS = PETRI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_FEATURE_COUNT = PETRI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_OPERATION_COUNT = PETRI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link petrinet.Petri <em>Petri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri</em>'.
	 * @see petrinet.Petri
	 * @generated
	 */
	EClass getPetri();

	/**
	 * Returns the meta object for the attribute '{@link petrinet.Petri#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see petrinet.Petri#getNom()
	 * @see #getPetri()
	 * @generated
	 */
	EAttribute getPetri_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinet.Petri#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see petrinet.Petri#getElements()
	 * @see #getPetri()
	 * @generated
	 */
	EReference getPetri_Elements();

	/**
	 * Returns the meta object for class '{@link petrinet.PetriElement <em>Petri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Element</em>'.
	 * @see petrinet.PetriElement
	 * @generated
	 */
	EClass getPetriElement();

	/**
	 * Returns the meta object for the reference '{@link petrinet.PetriElement#getPetri <em>Petri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Petri</em>'.
	 * @see petrinet.PetriElement#getPetri()
	 * @see #getPetriElement()
	 * @generated
	 */
	EReference getPetriElement_Petri();

	/**
	 * Returns the meta object for class '{@link petrinet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see petrinet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link petrinet.Place#getNbr_jetons <em>Nbr jetons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbr jetons</em>'.
	 * @see petrinet.Place#getNbr_jetons()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Nbr_jetons();

	/**
	 * Returns the meta object for class '{@link petrinet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see petrinet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for class '{@link petrinet.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien</em>'.
	 * @see petrinet.Lien
	 * @generated
	 */
	EClass getLien();

	/**
	 * Returns the meta object for the reference '{@link petrinet.Lien#getPredecesseur <em>Predecesseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecesseur</em>'.
	 * @see petrinet.Lien#getPredecesseur()
	 * @see #getLien()
	 * @generated
	 */
	EReference getLien_Predecesseur();

	/**
	 * Returns the meta object for the reference '{@link petrinet.Lien#getSuccesseur <em>Successeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successeur</em>'.
	 * @see petrinet.Lien#getSuccesseur()
	 * @see #getLien()
	 * @generated
	 */
	EReference getLien_Successeur();

	/**
	 * Returns the meta object for the attribute '{@link petrinet.Lien#isIs_read_arc <em>Is read arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is read arc</em>'.
	 * @see petrinet.Lien#isIs_read_arc()
	 * @see #getLien()
	 * @generated
	 */
	EAttribute getLien_Is_read_arc();

	/**
	 * Returns the meta object for the attribute '{@link petrinet.Lien#getPoids <em>Poids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poids</em>'.
	 * @see petrinet.Lien#getPoids()
	 * @see #getLien()
	 * @generated
	 */
	EAttribute getLien_Poids();

	/**
	 * Returns the meta object for class '{@link petrinet.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see petrinet.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the reference list '{@link petrinet.Zone#getPredecesseurs <em>Predecesseurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecesseurs</em>'.
	 * @see petrinet.Zone#getPredecesseurs()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Predecesseurs();

	/**
	 * Returns the meta object for the reference list '{@link petrinet.Zone#getSuccesseurs <em>Successeurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successeurs</em>'.
	 * @see petrinet.Zone#getSuccesseurs()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Successeurs();

	/**
	 * Returns the meta object for the attribute '{@link petrinet.Zone#getNom_zone <em>Nom zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom zone</em>'.
	 * @see petrinet.Zone#getNom_zone()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_Nom_zone();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetFactory getPetrinetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link petrinet.impl.PetriImpl <em>Petri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet.impl.PetriImpl
		 * @see petrinet.impl.PetrinetPackageImpl#getPetri()
		 * @generated
		 */
		EClass PETRI = eINSTANCE.getPetri();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI__NOM = eINSTANCE.getPetri_Nom();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI__ELEMENTS = eINSTANCE.getPetri_Elements();

		/**
		 * The meta object literal for the '{@link petrinet.impl.PetriElementImpl <em>Petri Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet.impl.PetriElementImpl
		 * @see petrinet.impl.PetrinetPackageImpl#getPetriElement()
		 * @generated
		 */
		EClass PETRI_ELEMENT = eINSTANCE.getPetriElement();

		/**
		 * The meta object literal for the '<em><b>Petri</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_ELEMENT__PETRI = eINSTANCE.getPetriElement_Petri();

		/**
		 * The meta object literal for the '{@link petrinet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet.impl.PlaceImpl
		 * @see petrinet.impl.PetrinetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Nbr jetons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NBR_JETONS = eINSTANCE.getPlace_Nbr_jetons();

		/**
		 * The meta object literal for the '{@link petrinet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet.impl.TransitionImpl
		 * @see petrinet.impl.PetrinetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link petrinet.impl.LienImpl <em>Lien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet.impl.LienImpl
		 * @see petrinet.impl.PetrinetPackageImpl#getLien()
		 * @generated
		 */
		EClass LIEN = eINSTANCE.getLien();

		/**
		 * The meta object literal for the '<em><b>Predecesseur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN__PREDECESSEUR = eINSTANCE.getLien_Predecesseur();

		/**
		 * The meta object literal for the '<em><b>Successeur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN__SUCCESSEUR = eINSTANCE.getLien_Successeur();

		/**
		 * The meta object literal for the '<em><b>Is read arc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEN__IS_READ_ARC = eINSTANCE.getLien_Is_read_arc();

		/**
		 * The meta object literal for the '<em><b>Poids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEN__POIDS = eINSTANCE.getLien_Poids();

		/**
		 * The meta object literal for the '{@link petrinet.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinet.impl.ZoneImpl
		 * @see petrinet.impl.PetrinetPackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Predecesseurs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__PREDECESSEURS = eINSTANCE.getZone_Predecesseurs();

		/**
		 * The meta object literal for the '<em><b>Successeurs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__SUCCESSEURS = eINSTANCE.getZone_Successeurs();

		/**
		 * The meta object literal for the '<em><b>Nom zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__NOM_ZONE = eINSTANCE.getZone_Nom_zone();

	}

} //PetrinetPackage
