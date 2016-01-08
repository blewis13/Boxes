/**
 */
package boxes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link boxes.BoxInstance#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link boxes.BoxInstance#getBoxRef <em>Box Ref</em>}</li>
 *   <li>{@link boxes.BoxInstance#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see boxes.BoxesPackage#getBoxInstance()
 * @model
 * @generated
 */
public interface BoxInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see boxes.BoxesPackage#getBoxInstance_InstanceName()
	 * @model
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link boxes.BoxInstance#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Box Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Ref</em>' reference.
	 * @see #setBoxRef(Box)
	 * @see boxes.BoxesPackage#getBoxInstance_BoxRef()
	 * @model required="true"
	 * @generated
	 */
	Box getBoxRef();

	/**
	 * Sets the value of the '{@link boxes.BoxInstance#getBoxRef <em>Box Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Ref</em>' reference.
	 * @see #getBoxRef()
	 * @generated
	 */
	void setBoxRef(Box value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link boxes.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see boxes.BoxesPackage#getBoxInstance_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // BoxInstance
