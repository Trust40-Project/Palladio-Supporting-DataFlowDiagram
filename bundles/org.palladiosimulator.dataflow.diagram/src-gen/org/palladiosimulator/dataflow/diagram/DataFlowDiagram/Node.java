/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node#getRequiringNodes <em>Requiring Nodes</em>}</li>
 *   <li>{@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node#getProvidingNodes <em>Providing Nodes</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends Component {
	/**
	 * Returns the value of the '<em><b>Requiring Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiring Nodes</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getNode_RequiringNodes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.oclAsType(ecore::EObject).eContainer().oclAsType(DataFlowDiagram).edges-&gt;select(e | e.source = self).target-&gt;asOrderedSet()'"
	 * @generated
	 */
	EList<Node> getRequiringNodes();

	/**
	 * Returns the value of the '<em><b>Providing Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providing Nodes</em>' reference list.
	 * @see org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage#getNode_ProvidingNodes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.oclAsType(ecore::EObject).eContainer().oclAsType(DataFlowDiagram).edges-&gt;select(e | e.target = self).source-&gt;asOrderedSet()'"
	 * @generated
	 */
	EList<Node> getProvidingNodes();

} // Node