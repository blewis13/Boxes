/*
 * generated by Xtext
 */
package org.xtext.example.boxes.serializer;

import boxes.Box;
import boxes.BoxInstance;
import boxes.BoxesPackage;
import boxes.Connection;
import boxes.Port;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.boxes.services.BoxesDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractBoxesDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BoxesDslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BoxesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BoxesPackage.BOX:
				sequence_Box(context, (Box) semanticObject); 
				return; 
			case BoxesPackage.BOX_INSTANCE:
				sequence_BoxInstance(context, (BoxInstance) semanticObject); 
				return; 
			case BoxesPackage.CONNECTION:
				sequence_Connection(context, (Connection) semanticObject); 
				return; 
			case BoxesPackage.PORT:
				sequence_Port(context, (Port) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (boxRef=[Box|QualifiedName] instanceName=EString?)
	 */
	protected void sequence_BoxInstance(EObject context, BoxInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (ports+=Port ports+=Port*)? 
	 *         (boxInstances+=BoxInstance boxInstances+=BoxInstance*)? 
	 *         (connections+=Connection connections+=Connection*)?
	 *     )
	 */
	protected void sequence_Box(EObject context, Box semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (intPorts+=[Port|QualifiedName] intPorts+=[Port|QualifiedName]* (extPorts+=[Port|QualifiedName] extPorts+=[Port|QualifiedName]*)?)
	 */
	protected void sequence_Connection(EObject context, Connection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Port(EObject context, Port semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BoxesPackage.Literals.PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BoxesPackage.Literals.PORT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPortAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
}