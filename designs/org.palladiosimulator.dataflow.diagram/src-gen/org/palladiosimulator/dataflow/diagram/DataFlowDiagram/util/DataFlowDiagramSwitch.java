/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.util;

import de.uka.ipd.sdq.identifier.Identifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Component;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.EdgeRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Entity;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.ExternalActor;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.NamedElement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Store;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage
 * @generated
 */
public class DataFlowDiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataFlowDiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowDiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = DataFlowDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM: {
				DataFlowDiagram dataFlowDiagram = (DataFlowDiagram)theEObject;
				T result = caseDataFlowDiagram(dataFlowDiagram);
				if (result == null) result = caseIdentifier(dataFlowDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataFlowDiagramPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseEntity(component);
				if (result == null) result = caseIdentifier(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataFlowDiagramPackage.EXTERNAL_ACTOR: {
				ExternalActor externalActor = (ExternalActor)theEObject;
				T result = caseExternalActor(externalActor);
				if (result == null) result = caseNode(externalActor);
				if (result == null) result = caseComponent(externalActor);
				if (result == null) result = caseEntity(externalActor);
				if (result == null) result = caseIdentifier(externalActor);
				if (result == null) result = caseNamedElement(externalActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataFlowDiagramPackage.STORE: {
				Store store = (Store)theEObject;
				T result = caseStore(store);
				if (result == null) result = caseNode(store);
				if (result == null) result = caseComponent(store);
				if (result == null) result = caseEntity(store);
				if (result == null) result = caseIdentifier(store);
				if (result == null) result = caseNamedElement(store);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataFlowDiagramPackage.PROCESS: {
				org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process process = (org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseNode(process);
				if (result == null) result = caseComponent(process);
				if (result == null) result = caseEntity(process);
				if (result == null) result = caseIdentifier(process);
				if (result == null) result = caseNamedElement(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM_REFINEMENT: {
				DataFlowDiagramRefinement dataFlowDiagramRefinement = (DataFlowDiagramRefinement)theEObject;
				T result = caseDataFlowDiagramRefinement(dataFlowDiagramRefinement);
				if (result == null) result = caseIdentifier(dataFlowDiagramRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataFlowDiagramPackage.DATA_FLOW: {
				DataFlow dataFlow = (DataFlow)theEObject;
				T result = caseDataFlow(dataFlow);
				if (result == null) result = caseEdge(dataFlow);
				if (result == null) result = caseComponent(dataFlow);
				if (result == null) result = caseEntity(dataFlow);
				if (result == null) result = caseIdentifier(dataFlow);
				if (result == null) result = caseNamedElement(dataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataFlowDiagramPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseEntity(data);
				if (result == null) result = caseIdentifier(data);
				if (result == null) result = caseNamedElement(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataFlowDiagramPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseComponent(edge);
				if (result == null) result = caseEntity(edge);
				if (result == null) result = caseIdentifier(edge);
				if (result == null) result = caseNamedElement(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataFlowDiagramPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseComponent(node);
				if (result == null) result = caseEntity(node);
				if (result == null) result = caseIdentifier(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataFlowDiagramPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataFlowDiagramPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseIdentifier(entity);
				if (result == null) result = caseNamedElement(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataFlowDiagramPackage.EDGE_REFINEMENT: {
				EdgeRefinement edgeRefinement = (EdgeRefinement)theEObject;
				T result = caseEdgeRefinement(edgeRefinement);
				if (result == null) result = caseIdentifier(edgeRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlowDiagram(DataFlowDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalActor(ExternalActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStore(Store object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlowDiagramRefinement(DataFlowDiagramRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeRefinement(EdgeRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIdentifier(Identifier object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DataFlowDiagramSwitch
