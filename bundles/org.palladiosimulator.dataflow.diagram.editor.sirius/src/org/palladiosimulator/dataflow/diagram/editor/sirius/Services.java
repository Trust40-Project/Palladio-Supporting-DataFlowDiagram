package org.palladiosimulator.dataflow.diagram.editor.sirius;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Data;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlow;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagram;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramFactory;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.DataFlowDiagramRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Edge;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.EdgeRefinement;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.ExternalActor;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Node;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Process;
import org.palladiosimulator.dataflow.diagram.DataFlowDiagram.Store;
import org.palladiosimulator.dataflow.diagram.editor.sirius.util.ComparisonUtil;
import org.palladiosimulator.dataflow.diagram.editor.sirius.util.DFDErrorMessageUtil;
import org.palladiosimulator.dataflow.diagram.editor.sirius.util.DFDModificationUtil;
import org.palladiosimulator.dataflow.diagram.editor.sirius.util.DFDRefinementUtil;
import org.palladiosimulator.dataflow.diagram.editor.sirius.util.DFDTypeUtil;
import org.palladiosimulator.dataflow.diagram.editor.sirius.util.DFDValidationUtil;
import org.palladiosimulator.dataflow.diagram.editor.sirius.util.Tuple;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.CompositeDataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataType;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.Entry;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

/**
 * The services class used by VSM.
 */
public class Services {

	public EObject navigateUp(EObject self, EObject dfd) {
		return dfd.eContainer().eContainer();
	}

	public EObject navigateDown(EObject self, EObject element) {
		return DFDRefinementUtil.getRefinement(element).getRefiningDiagram();

	}

	public List<EObject> listDataTypes(EObject self) {
		Session session = SessionManager.INSTANCE.getSession(self);
		return DFDTypeUtil.getDataTypes(session);
	}

	public boolean isRefined(EObject self) {
		return DFDRefinementUtil.isRefined(self);
	}

	public boolean isNotRefined(EObject self, EObject element) {
		return !DFDRefinementUtil.isRefined(element);
	}

	public boolean needsRefDialog(EObject self, EObject source, EObject target) {
		return DFDRefinementUtil.needsRef(source, target) && !getAllRefinements(self, source, target).isEmpty(); // <->
																													// if
																													// cross-dfd;
	}

	public boolean needsRef(EObject self, EObject source, EObject target) {
		return DFDRefinementUtil.needsRef(source, target) && getAllRefinements(self, source, target).isEmpty();
	}

	public void addNewRefinedDF(EObject self, EObject source, EObject target) {

		DFDRefinementUtil.addNewRefinedDF(self, source, target);

	}

	public void refineDF(EObject self, DataFlow df, DataFlowDiagram dfd) {
		DFDRefinementUtil.refineDF(self, df, dfd);
	}

	public void refineProcess(EObject newDFD, EObject p, DataFlowDiagram oldDFD, DataFlowDiagramRefinement ref) {
		DFDModificationUtil.refineProcess(newDFD, p, oldDFD, ref);
	}

	public void createLeveledDFD(List<DataFlow> inc, List<DataFlow> out, Process p, DataFlowDiagram oldDFD,
			DataFlowDiagram newDFD, DataFlowDiagramRefinement ref) {

		DFDModificationUtil.createLeveledDFD(inc, out, p, oldDFD, newDFD, ref);

	}

	public void loadResources(EObject self) {
		ResourceDialog r = new ResourceDialog(Display.getCurrent().getActiveShell(), "Load Data Dictionary",
				SWT.SINGLE);
		r.open();
		r.setBlockOnOpen(true);
		Session session = SessionManager.INSTANCE.getSession(self);
		for (URI uri : r.getURIs()) {
			if (!DFDTypeUtil.uriAlreadyLoaded(uri, session))
				session.addSemanticResource(uri, new NullProgressMonitor());

		}

	}

	public boolean isValidData(EObject self) {
		Data data = (Data) self;
		return data.getName() != null && !data.getName().isBlank() && data.getType() != null;

	}

	public boolean isValidData(EObject self, EObject entry) {
		Data data = (Data) entry;
		return data.getName() != null && !data.getName().isBlank() && data.getType() != null;

	}

	public List<EdgeRefinement> getAllRefinements(EObject self, EObject source, EObject target) {
		return DFDRefinementUtil.getAllRefinements(self, source, target);

	}

	public boolean canCreateDF(EObject self) {
		return DFDRefinementUtil.getCurrentRefinement() != null;
	}

	public void stopDFCreation(EObject self) {
		DFDRefinementUtil.setCurrentRefinement(null);
	}

	public void setRef(EObject self, EdgeRefinement er) {
		DFDRefinementUtil.setCurrentRefinement(er);
	}

	public void addRefiningDF(EObject self, EObject source, EObject target) {
		DFDModificationUtil.createDF(self, source, target, true);

	}

	public void addDF(EObject self, EObject source, EObject target) {
		DFDModificationUtil.createDF(self, source, target, false);
	}

	public boolean canConnect(EObject self, EObject source, EObject target) {
		if (!DFDRefinementUtil.isRefinedDFD(self.eContainer())) {
			return true;
		}

		if (!DFDModificationUtil.isBorderNode((Node) source) && !DFDModificationUtil.isBorderNode((Node) target)) {
			return true;
		}

		return !(DFDModificationUtil.isBorderNode((Node) source) && DFDModificationUtil.isBorderNode((Node) target))
				&& !getAllRefinements(self, source, target).isEmpty();

	}

	public boolean inputOutputIsConsistent(EObject self) {
		return DFDValidationUtil.inputOutputIsConsistent(self);
	}

	public void deleteNode(EObject self) {
		DFDModificationUtil.deleteNode(self);
	}

	public void deleteEdge(EObject self) {
		DFDModificationUtil.deleteEdge(self);

	}

	public String getErrorMessage(EObject self) {
		return DFDErrorMessageUtil.getErrorMessage(self);
	}

}