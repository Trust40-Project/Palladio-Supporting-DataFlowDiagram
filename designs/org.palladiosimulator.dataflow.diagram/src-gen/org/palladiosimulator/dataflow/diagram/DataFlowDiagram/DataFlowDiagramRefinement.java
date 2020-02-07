/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram;

import de.uka.ipd.sdq.identifier.Identifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRefinedProcess <em>Refined Process</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRefiningDiagram <em>Refining Diagram</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getProvidingProcesses <em>Providing Processes</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRequiringProcesses <em>Requiring Processes</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getDataFlowDiagramRefinement()
 * @model
 * @generated
 */
public interface DataFlowDiagramRefinement extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Refined Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Process</em>' reference.
	 * @see #setRefinedProcess(org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process)
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getDataFlowDiagramRefinement_RefinedProcess()
	 * @model required="true"
	 * @generated
	 */
	org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process getRefinedProcess();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRefinedProcess <em>Refined Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Process</em>' reference.
	 * @see #getRefinedProcess()
	 * @generated
	 */
	void setRefinedProcess(org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process value);

	/**
	 * Returns the value of the '<em><b>Refining Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refining Diagram</em>' containment reference.
	 * @see #setRefiningDiagram(DataFlowDiagram)
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getDataFlowDiagramRefinement_RefiningDiagram()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataFlowDiagram getRefiningDiagram();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement#getRefiningDiagram <em>Refining Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refining Diagram</em>' containment reference.
	 * @see #getRefiningDiagram()
	 * @generated
	 */
	void setRefiningDiagram(DataFlowDiagram value);

	/**
	 * Returns the value of the '<em><b>Providing Processes</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providing Processes</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getDataFlowDiagramRefinement_ProvidingProcesses()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.refinedProcess.providingProcesses'"
	 * @generated
	 */
	EList<Node> getProvidingProcesses();

	/**
	 * Returns the value of the '<em><b>Requiring Processes</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiring Processes</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getDataFlowDiagramRefinement_RequiringProcesses()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.refinedProcess.requiringProcesses'"
	 * @generated
	 */
	EList<Node> getRequiringProcesses();

} // DataFlowDiagramRefinement
