/**
 */
package boxes.impl;

import boxes.BoxesPackage;
import boxes.Connection;
import boxes.Port;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link boxes.impl.ConnectionImpl#getIntPorts <em>Int Ports</em>}</li>
 *   <li>{@link boxes.impl.ConnectionImpl#getExtPorts <em>Ext Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getIntPorts() <em>Int Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> intPorts;

	/**
	 * The cached value of the '{@link #getExtPorts() <em>Ext Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> extPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoxesPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getIntPorts() {
		if (intPorts == null) {
			intPorts = new EObjectResolvingEList<Port>(Port.class, this, BoxesPackage.CONNECTION__INT_PORTS);
		}
		return intPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getExtPorts() {
		if (extPorts == null) {
			extPorts = new EObjectResolvingEList<Port>(Port.class, this, BoxesPackage.CONNECTION__EXT_PORTS);
		}
		return extPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BoxesPackage.CONNECTION__INT_PORTS:
				return getIntPorts();
			case BoxesPackage.CONNECTION__EXT_PORTS:
				return getExtPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BoxesPackage.CONNECTION__INT_PORTS:
				getIntPorts().clear();
				getIntPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case BoxesPackage.CONNECTION__EXT_PORTS:
				getExtPorts().clear();
				getExtPorts().addAll((Collection<? extends Port>)newValue);
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
			case BoxesPackage.CONNECTION__INT_PORTS:
				getIntPorts().clear();
				return;
			case BoxesPackage.CONNECTION__EXT_PORTS:
				getExtPorts().clear();
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
			case BoxesPackage.CONNECTION__INT_PORTS:
				return intPorts != null && !intPorts.isEmpty();
			case BoxesPackage.CONNECTION__EXT_PORTS:
				return extPorts != null && !extPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
