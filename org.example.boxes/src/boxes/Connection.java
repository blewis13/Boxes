/**
 */
package boxes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link boxes.Connection#getIntPorts <em>Int Ports</em>}</li>
 *   <li>{@link boxes.Connection#getExtPorts <em>Ext Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see boxes.BoxesPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Int Ports</b></em>' reference list.
	 * The list contents are of type {@link boxes.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Ports</em>' reference list.
	 * @see boxes.BoxesPackage#getConnection_IntPorts()
	 * @model required="true"
	 * @generated
	 */
	EList<Port> getIntPorts();

	/**
	 * Returns the value of the '<em><b>Ext Ports</b></em>' reference list.
	 * The list contents are of type {@link boxes.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Ports</em>' reference list.
	 * @see boxes.BoxesPackage#getConnection_ExtPorts()
	 * @model
	 * @generated
	 */
	EList<Port> getExtPorts();

} // Connection
