/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Component;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.RefiningReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl#getEquals <em>Equals</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl#getRefinedBy <em>Refined By</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.impl.DataFlowDiagramImpl#getRefines <em>Refines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowDiagramImpl extends IdentifierImpl implements DataFlowDiagram {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getEquals() <em>Equals</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquals()
	 * @generated
	 * @ordered
	 */
	protected Component equals;
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;
	/**
	 * The cached value of the '{@link #getRefinedBy() <em>Refined By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlowDiagram> refinedBy;
	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected RefiningReference refines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getEquals() {
		if (equals != null && equals.eIsProxy()) {
			InternalEObject oldEquals = (InternalEObject)equals;
			equals = (Component)eResolveProxy(oldEquals);
			if (equals != oldEquals) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EQUALS, oldEquals, equals));
			}
		}
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetEquals() {
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquals(Component newEquals) {
		Component oldEquals = equals;
		equals = newEquals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EQUALS, oldEquals, equals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlowDiagram> getRefinedBy() {
		if (refinedBy == null) {
			refinedBy = new EObjectResolvingEList<DataFlowDiagram>(DataFlowDiagram.class, this, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINED_BY);
		}
		return refinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefiningReference getRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefines(RefiningReference newRefines, NotificationChain msgs) {
		RefiningReference oldRefines = refines;
		refines = newRefines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINES, oldRefines, newRefines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefines(RefiningReference newRefines) {
		if (newRefines != refines) {
			NotificationChain msgs = null;
			if (refines != null)
				msgs = ((InternalEObject)refines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINES, null, msgs);
			if (newRefines != null)
				msgs = ((InternalEObject)newRefines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINES, null, msgs);
			msgs = basicSetRefines(newRefines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINES, newRefines, newRefines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINES:
				return basicSetRefines(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NAME:
				return getName();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EQUALS:
				if (resolve) return getEquals();
				return basicGetEquals();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__COMPONENTS:
				return getComponents();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
				return getRefinedBy();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINES:
				return getRefines();
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EQUALS:
				setEquals((Component)newValue);
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
				getRefinedBy().clear();
				getRefinedBy().addAll((Collection<? extends DataFlowDiagram>)newValue);
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINES:
				setRefines((RefiningReference)newValue);
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EQUALS:
				setEquals((Component)null);
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__COMPONENTS:
				getComponents().clear();
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
				getRefinedBy().clear();
				return;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINES:
				setRefines((RefiningReference)null);
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
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EQUALS:
				return equals != null;
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__COMPONENTS:
				return components != null && !components.isEmpty();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
				return refinedBy != null && !refinedBy.isEmpty();
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINES:
				return refines != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Component.class) {
			switch (derivedFeatureID) {
				case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NAME: return DataFlowDiagramPackage.COMPONENT__NAME;
				case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EQUALS: return DataFlowDiagramPackage.COMPONENT__EQUALS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Component.class) {
			switch (baseFeatureID) {
				case DataFlowDiagramPackage.COMPONENT__NAME: return DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NAME;
				case DataFlowDiagramPackage.COMPONENT__EQUALS: return DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EQUALS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataFlowDiagramImpl