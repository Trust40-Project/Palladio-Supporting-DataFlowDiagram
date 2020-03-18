/**
 */
package org.palladiosimulator.dataflow.diagram.DataFlowDiagram.provider;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramFactory;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFlowDiagramItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRefinedByPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Refined By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataFlowDiagram_refinedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataFlowDiagram_refinedBy_feature", "_UI_DataFlowDiagram_type"),
				 DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM__REFINED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM__REFINED_BY);
			childrenFeatures.add(DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM__NODES);
			childrenFeatures.add(DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM__EDGES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DataFlowDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataFlowDiagram"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataFlowDiagram)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_DataFlowDiagram_type") :
			getString("_UI_DataFlowDiagram_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DataFlowDiagram.class)) {
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__REFINED_BY:
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__NODES:
			case DataFlowDiagramPackage.DATA_FLOW_DIAGRAM__EDGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM__REFINED_BY,
				 DataFlowDiagramFactory.eINSTANCE.createDataFlowDiagramRefinement()));

		newChildDescriptors.add
			(createChildParameter
				(DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM__NODES,
				 DataFlowDiagramFactory.eINSTANCE.createExternalActor()));

		newChildDescriptors.add
			(createChildParameter
				(DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM__NODES,
				 DataFlowDiagramFactory.eINSTANCE.createStore()));

		newChildDescriptors.add
			(createChildParameter
				(DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM__NODES,
				 DataFlowDiagramFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(DataFlowDiagramPackage.Literals.DATA_FLOW_DIAGRAM__EDGES,
				 DataFlowDiagramFactory.eINSTANCE.createDataFlow()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}