/**
 */
package petrinet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinet.Lien;
import petrinet.PetrinetPackage;
import petrinet.Zone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lien</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.LienImpl#getPredecesseur <em>Predecesseur</em>}</li>
 *   <li>{@link petrinet.impl.LienImpl#getSuccesseur <em>Successeur</em>}</li>
 *   <li>{@link petrinet.impl.LienImpl#isIs_read_arc <em>Is read arc</em>}</li>
 *   <li>{@link petrinet.impl.LienImpl#getPoids <em>Poids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienImpl extends PetriElementImpl implements Lien {
	/**
	 * The cached value of the '{@link #getPredecesseur() <em>Predecesseur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecesseur()
	 * @generated
	 * @ordered
	 */
	protected Zone predecesseur;

	/**
	 * The cached value of the '{@link #getSuccesseur() <em>Successeur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccesseur()
	 * @generated
	 * @ordered
	 */
	protected Zone successeur;

	/**
	 * The default value of the '{@link #isIs_read_arc() <em>Is read arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_read_arc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ARC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_read_arc() <em>Is read arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_read_arc()
	 * @generated
	 * @ordered
	 */
	protected boolean is_read_arc = IS_READ_ARC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoids() <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected static final int POIDS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPoids() <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected int poids = POIDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.LIEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zone getPredecesseur() {
		if (predecesseur != null && predecesseur.eIsProxy()) {
			InternalEObject oldPredecesseur = (InternalEObject)predecesseur;
			predecesseur = (Zone)eResolveProxy(oldPredecesseur);
			if (predecesseur != oldPredecesseur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.LIEN__PREDECESSEUR, oldPredecesseur, predecesseur));
			}
		}
		return predecesseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone basicGetPredecesseur() {
		return predecesseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredecesseur(Zone newPredecesseur) {
		Zone oldPredecesseur = predecesseur;
		predecesseur = newPredecesseur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.LIEN__PREDECESSEUR, oldPredecesseur, predecesseur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zone getSuccesseur() {
		if (successeur != null && successeur.eIsProxy()) {
			InternalEObject oldSuccesseur = (InternalEObject)successeur;
			successeur = (Zone)eResolveProxy(oldSuccesseur);
			if (successeur != oldSuccesseur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.LIEN__SUCCESSEUR, oldSuccesseur, successeur));
			}
		}
		return successeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone basicGetSuccesseur() {
		return successeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccesseur(Zone newSuccesseur) {
		Zone oldSuccesseur = successeur;
		successeur = newSuccesseur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.LIEN__SUCCESSEUR, oldSuccesseur, successeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_read_arc() {
		return is_read_arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_read_arc(boolean newIs_read_arc) {
		boolean oldIs_read_arc = is_read_arc;
		is_read_arc = newIs_read_arc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.LIEN__IS_READ_ARC, oldIs_read_arc, is_read_arc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPoids() {
		return poids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoids(int newPoids) {
		int oldPoids = poids;
		poids = newPoids;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.LIEN__POIDS, oldPoids, poids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetPackage.LIEN__PREDECESSEUR:
				if (resolve) return getPredecesseur();
				return basicGetPredecesseur();
			case PetrinetPackage.LIEN__SUCCESSEUR:
				if (resolve) return getSuccesseur();
				return basicGetSuccesseur();
			case PetrinetPackage.LIEN__IS_READ_ARC:
				return isIs_read_arc();
			case PetrinetPackage.LIEN__POIDS:
				return getPoids();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.LIEN__PREDECESSEUR:
				setPredecesseur((Zone)newValue);
				return;
			case PetrinetPackage.LIEN__SUCCESSEUR:
				setSuccesseur((Zone)newValue);
				return;
			case PetrinetPackage.LIEN__IS_READ_ARC:
				setIs_read_arc((Boolean)newValue);
				return;
			case PetrinetPackage.LIEN__POIDS:
				setPoids((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetrinetPackage.LIEN__PREDECESSEUR:
				setPredecesseur((Zone)null);
				return;
			case PetrinetPackage.LIEN__SUCCESSEUR:
				setSuccesseur((Zone)null);
				return;
			case PetrinetPackage.LIEN__IS_READ_ARC:
				setIs_read_arc(IS_READ_ARC_EDEFAULT);
				return;
			case PetrinetPackage.LIEN__POIDS:
				setPoids(POIDS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetrinetPackage.LIEN__PREDECESSEUR:
				return predecesseur != null;
			case PetrinetPackage.LIEN__SUCCESSEUR:
				return successeur != null;
			case PetrinetPackage.LIEN__IS_READ_ARC:
				return is_read_arc != IS_READ_ARC_EDEFAULT;
			case PetrinetPackage.LIEN__POIDS:
				return poids != POIDS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (is_read_arc: ");
		result.append(is_read_arc);
		result.append(", poids: ");
		result.append(poids);
		result.append(')');
		return result.toString();
	}

} //LienImpl
