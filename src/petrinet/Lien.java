/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Lien#getPredecesseur <em>Predecesseur</em>}</li>
 *   <li>{@link petrinet.Lien#getSuccesseur <em>Successeur</em>}</li>
 *   <li>{@link petrinet.Lien#isIs_read_arc <em>Is read arc</em>}</li>
 *   <li>{@link petrinet.Lien#getPoids <em>Poids</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getLien()
 * @model
 * @generated
 */
public interface Lien extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Predecesseur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecesseur</em>' reference.
	 * @see #setPredecesseur(Zone)
	 * @see petrinet.PetrinetPackage#getLien_Predecesseur()
	 * @model required="true"
	 * @generated
	 */
	Zone getPredecesseur();

	/**
	 * Sets the value of the '{@link petrinet.Lien#getPredecesseur <em>Predecesseur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecesseur</em>' reference.
	 * @see #getPredecesseur()
	 * @generated
	 */
	void setPredecesseur(Zone value);

	/**
	 * Returns the value of the '<em><b>Successeur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successeur</em>' reference.
	 * @see #setSuccesseur(Zone)
	 * @see petrinet.PetrinetPackage#getLien_Successeur()
	 * @model required="true"
	 * @generated
	 */
	Zone getSuccesseur();

	/**
	 * Sets the value of the '{@link petrinet.Lien#getSuccesseur <em>Successeur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successeur</em>' reference.
	 * @see #getSuccesseur()
	 * @generated
	 */
	void setSuccesseur(Zone value);

	/**
	 * Returns the value of the '<em><b>Is read arc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is read arc</em>' attribute.
	 * @see #setIs_read_arc(boolean)
	 * @see petrinet.PetrinetPackage#getLien_Is_read_arc()
	 * @model required="true"
	 * @generated
	 */
	boolean isIs_read_arc();

	/**
	 * Sets the value of the '{@link petrinet.Lien#isIs_read_arc <em>Is read arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is read arc</em>' attribute.
	 * @see #isIs_read_arc()
	 * @generated
	 */
	void setIs_read_arc(boolean value);

	/**
	 * Returns the value of the '<em><b>Poids</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids</em>' attribute.
	 * @see #setPoids(int)
	 * @see petrinet.PetrinetPackage#getLien_Poids()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getPoids();

	/**
	 * Sets the value of the '{@link petrinet.Lien#getPoids <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids</em>' attribute.
	 * @see #getPoids()
	 * @generated
	 */
	void setPoids(int value);

} // Lien
