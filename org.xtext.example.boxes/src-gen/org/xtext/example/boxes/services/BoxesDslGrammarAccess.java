/*
 * generated by Xtext
 */
package org.xtext.example.boxes.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class BoxesDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class BoxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Box");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBoxAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBoxKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPortsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cPortsAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cPortsPortParserRuleCall_4_2_0 = (RuleCall)cPortsAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cPortsAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cPortsPortParserRuleCall_4_3_1_0 = (RuleCall)cPortsAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cBoxInstancesKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cBoxInstancesAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cBoxInstancesBoxInstanceParserRuleCall_5_2_0 = (RuleCall)cBoxInstancesAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cBoxInstancesAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cBoxInstancesBoxInstanceParserRuleCall_5_3_1_0 = (RuleCall)cBoxInstancesAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cConnectionsKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cConnectionsAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cConnectionsConnectionParserRuleCall_6_2_0 = (RuleCall)cConnectionsAssignment_6_2.eContents().get(0);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final Keyword cCommaKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Assignment cConnectionsAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final RuleCall cConnectionsConnectionParserRuleCall_6_3_1_0 = (RuleCall)cConnectionsAssignment_6_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_4 = (Keyword)cGroup_6.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Box:
		//	{Box} "Box" name=EString "{" ("ports" "{" ports+=Port ("," ports+=Port)* "}")? ("boxInstances" "{"
		//	boxInstances+=BoxInstance ("," boxInstances+=BoxInstance)* "}")? ("connections" "{" connections+=Connection (","
		//	connections+=Connection)* "}")? "}";
		@Override public ParserRule getRule() { return rule; }

		//{Box} "Box" name=EString "{" ("ports" "{" ports+=Port ("," ports+=Port)* "}")? ("boxInstances" "{"
		//boxInstances+=BoxInstance ("," boxInstances+=BoxInstance)* "}")? ("connections" "{" connections+=Connection (","
		//connections+=Connection)* "}")? "}"
		public Group getGroup() { return cGroup; }

		//{Box}
		public Action getBoxAction_0() { return cBoxAction_0; }

		//"Box"
		public Keyword getBoxKeyword_1() { return cBoxKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("ports" "{" ports+=Port ("," ports+=Port)* "}")?
		public Group getGroup_4() { return cGroup_4; }

		//"ports"
		public Keyword getPortsKeyword_4_0() { return cPortsKeyword_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//ports+=Port
		public Assignment getPortsAssignment_4_2() { return cPortsAssignment_4_2; }

		//Port
		public RuleCall getPortsPortParserRuleCall_4_2_0() { return cPortsPortParserRuleCall_4_2_0; }

		//("," ports+=Port)*
		public Group getGroup_4_3() { return cGroup_4_3; }

		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }

		//ports+=Port
		public Assignment getPortsAssignment_4_3_1() { return cPortsAssignment_4_3_1; }

		//Port
		public RuleCall getPortsPortParserRuleCall_4_3_1_0() { return cPortsPortParserRuleCall_4_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }

		//("boxInstances" "{" boxInstances+=BoxInstance ("," boxInstances+=BoxInstance)* "}")?
		public Group getGroup_5() { return cGroup_5; }

		//"boxInstances"
		public Keyword getBoxInstancesKeyword_5_0() { return cBoxInstancesKeyword_5_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }

		//boxInstances+=BoxInstance
		public Assignment getBoxInstancesAssignment_5_2() { return cBoxInstancesAssignment_5_2; }

		//BoxInstance
		public RuleCall getBoxInstancesBoxInstanceParserRuleCall_5_2_0() { return cBoxInstancesBoxInstanceParserRuleCall_5_2_0; }

		//("," boxInstances+=BoxInstance)*
		public Group getGroup_5_3() { return cGroup_5_3; }

		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }

		//boxInstances+=BoxInstance
		public Assignment getBoxInstancesAssignment_5_3_1() { return cBoxInstancesAssignment_5_3_1; }

		//BoxInstance
		public RuleCall getBoxInstancesBoxInstanceParserRuleCall_5_3_1_0() { return cBoxInstancesBoxInstanceParserRuleCall_5_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }

		//("connections" "{" connections+=Connection ("," connections+=Connection)* "}")?
		public Group getGroup_6() { return cGroup_6; }

		//"connections"
		public Keyword getConnectionsKeyword_6_0() { return cConnectionsKeyword_6_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }

		//connections+=Connection
		public Assignment getConnectionsAssignment_6_2() { return cConnectionsAssignment_6_2; }

		//Connection
		public RuleCall getConnectionsConnectionParserRuleCall_6_2_0() { return cConnectionsConnectionParserRuleCall_6_2_0; }

		//("," connections+=Connection)*
		public Group getGroup_6_3() { return cGroup_6_3; }

		//","
		public Keyword getCommaKeyword_6_3_0() { return cCommaKeyword_6_3_0; }

		//connections+=Connection
		public Assignment getConnectionsAssignment_6_3_1() { return cConnectionsAssignment_6_3_1; }

		//Connection
		public RuleCall getConnectionsConnectionParserRuleCall_6_3_1_0() { return cConnectionsConnectionParserRuleCall_6_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6_4() { return cRightCurlyBracketKeyword_6_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class PortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Port");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPortAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPortKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Port:
		//	{Port} "Port" name=EString;
		@Override public ParserRule getRule() { return rule; }

		//{Port} "Port" name=EString
		public Group getGroup() { return cGroup; }

		//{Port}
		public Action getPortAction_0() { return cPortAction_0; }

		//"Port"
		public Keyword getPortKeyword_1() { return cPortKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}

	public class ConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Connection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIntPortsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIntPortsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cIntPortsPortCrossReference_4_0 = (CrossReference)cIntPortsAssignment_4.eContents().get(0);
		private final RuleCall cIntPortsPortQualifiedNameParserRuleCall_4_0_1 = (RuleCall)cIntPortsPortCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cIntPortsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cIntPortsPortCrossReference_5_1_0 = (CrossReference)cIntPortsAssignment_5_1.eContents().get(0);
		private final RuleCall cIntPortsPortQualifiedNameParserRuleCall_5_1_0_1 = (RuleCall)cIntPortsPortCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cExtPortsKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cExtPortsAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final CrossReference cExtPortsPortCrossReference_7_2_0 = (CrossReference)cExtPortsAssignment_7_2.eContents().get(0);
		private final RuleCall cExtPortsPortQualifiedNameParserRuleCall_7_2_0_1 = (RuleCall)cExtPortsPortCrossReference_7_2_0.eContents().get(1);
		private final Group cGroup_7_3 = (Group)cGroup_7.eContents().get(3);
		private final Keyword cCommaKeyword_7_3_0 = (Keyword)cGroup_7_3.eContents().get(0);
		private final Assignment cExtPortsAssignment_7_3_1 = (Assignment)cGroup_7_3.eContents().get(1);
		private final CrossReference cExtPortsPortCrossReference_7_3_1_0 = (CrossReference)cExtPortsAssignment_7_3_1.eContents().get(0);
		private final RuleCall cExtPortsPortQualifiedNameParserRuleCall_7_3_1_0_1 = (RuleCall)cExtPortsPortCrossReference_7_3_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_7_4 = (Keyword)cGroup_7.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Connection:
		//	"Connection" "{" "intPorts" "(" intPorts+=[Port|QualifiedName] ("," intPorts+=[Port|QualifiedName])* ")" ("extPorts"
		//	"(" extPorts+=[Port|QualifiedName] ("," extPorts+=[Port|QualifiedName])* ")")? "}";
		@Override public ParserRule getRule() { return rule; }

		//"Connection" "{" "intPorts" "(" intPorts+=[Port|QualifiedName] ("," intPorts+=[Port|QualifiedName])* ")" ("extPorts" "("
		//extPorts+=[Port|QualifiedName] ("," extPorts+=[Port|QualifiedName])* ")")? "}"
		public Group getGroup() { return cGroup; }

		//"Connection"
		public Keyword getConnectionKeyword_0() { return cConnectionKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//"intPorts"
		public Keyword getIntPortsKeyword_2() { return cIntPortsKeyword_2; }

		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }

		//intPorts+=[Port|QualifiedName]
		public Assignment getIntPortsAssignment_4() { return cIntPortsAssignment_4; }

		//[Port|QualifiedName]
		public CrossReference getIntPortsPortCrossReference_4_0() { return cIntPortsPortCrossReference_4_0; }

		//QualifiedName
		public RuleCall getIntPortsPortQualifiedNameParserRuleCall_4_0_1() { return cIntPortsPortQualifiedNameParserRuleCall_4_0_1; }

		//("," intPorts+=[Port|QualifiedName])*
		public Group getGroup_5() { return cGroup_5; }

		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }

		//intPorts+=[Port|QualifiedName]
		public Assignment getIntPortsAssignment_5_1() { return cIntPortsAssignment_5_1; }

		//[Port|QualifiedName]
		public CrossReference getIntPortsPortCrossReference_5_1_0() { return cIntPortsPortCrossReference_5_1_0; }

		//QualifiedName
		public RuleCall getIntPortsPortQualifiedNameParserRuleCall_5_1_0_1() { return cIntPortsPortQualifiedNameParserRuleCall_5_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }

		//("extPorts" "(" extPorts+=[Port|QualifiedName] ("," extPorts+=[Port|QualifiedName])* ")")?
		public Group getGroup_7() { return cGroup_7; }

		//"extPorts"
		public Keyword getExtPortsKeyword_7_0() { return cExtPortsKeyword_7_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_7_1() { return cLeftParenthesisKeyword_7_1; }

		//extPorts+=[Port|QualifiedName]
		public Assignment getExtPortsAssignment_7_2() { return cExtPortsAssignment_7_2; }

		//[Port|QualifiedName]
		public CrossReference getExtPortsPortCrossReference_7_2_0() { return cExtPortsPortCrossReference_7_2_0; }

		//QualifiedName
		public RuleCall getExtPortsPortQualifiedNameParserRuleCall_7_2_0_1() { return cExtPortsPortQualifiedNameParserRuleCall_7_2_0_1; }

		//("," extPorts+=[Port|QualifiedName])*
		public Group getGroup_7_3() { return cGroup_7_3; }

		//","
		public Keyword getCommaKeyword_7_3_0() { return cCommaKeyword_7_3_0; }

		//extPorts+=[Port|QualifiedName]
		public Assignment getExtPortsAssignment_7_3_1() { return cExtPortsAssignment_7_3_1; }

		//[Port|QualifiedName]
		public CrossReference getExtPortsPortCrossReference_7_3_1_0() { return cExtPortsPortCrossReference_7_3_1_0; }

		//QualifiedName
		public RuleCall getExtPortsPortQualifiedNameParserRuleCall_7_3_1_0_1() { return cExtPortsPortQualifiedNameParserRuleCall_7_3_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_7_4() { return cRightParenthesisKeyword_7_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class BoxInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BoxInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBoxInstanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBoxRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBoxRefAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cBoxRefBoxCrossReference_3_0 = (CrossReference)cBoxRefAssignment_3.eContents().get(0);
		private final RuleCall cBoxRefBoxQualifiedNameParserRuleCall_3_0_1 = (RuleCall)cBoxRefBoxCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cInstanceNameKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cInstanceNameAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cInstanceNameEStringParserRuleCall_4_1_0 = (RuleCall)cInstanceNameAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//BoxInstance:
		//	"BoxInstance" "{" "boxRef" boxRef=[Box|QualifiedName] ("instanceName" instanceName=EString)? "}";
		@Override public ParserRule getRule() { return rule; }

		//"BoxInstance" "{" "boxRef" boxRef=[Box|QualifiedName] ("instanceName" instanceName=EString)? "}"
		public Group getGroup() { return cGroup; }

		//"BoxInstance"
		public Keyword getBoxInstanceKeyword_0() { return cBoxInstanceKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//"boxRef"
		public Keyword getBoxRefKeyword_2() { return cBoxRefKeyword_2; }

		//boxRef=[Box|QualifiedName]
		public Assignment getBoxRefAssignment_3() { return cBoxRefAssignment_3; }

		//[Box|QualifiedName]
		public CrossReference getBoxRefBoxCrossReference_3_0() { return cBoxRefBoxCrossReference_3_0; }

		//QualifiedName
		public RuleCall getBoxRefBoxQualifiedNameParserRuleCall_3_0_1() { return cBoxRefBoxQualifiedNameParserRuleCall_3_0_1; }

		//("instanceName" instanceName=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//"instanceName"
		public Keyword getInstanceNameKeyword_4_0() { return cInstanceNameKeyword_4_0; }

		//instanceName=EString
		public Assignment getInstanceNameAssignment_4_1() { return cInstanceNameAssignment_4_1; }

		//EString
		public RuleCall getInstanceNameEStringParserRuleCall_4_1_0() { return cInstanceNameEStringParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		@Override public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final BoxElements pBox;
	private final EStringElements pEString;
	private final PortElements pPort;
	private final ConnectionElements pConnection;
	private final BoxInstanceElements pBoxInstance;
	private final QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BoxesDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pBox = new BoxElements();
		this.pEString = new EStringElements();
		this.pPort = new PortElements();
		this.pConnection = new ConnectionElements();
		this.pBoxInstance = new BoxInstanceElements();
		this.pQualifiedName = new QualifiedNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.boxes.BoxesDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Box:
	//	{Box} "Box" name=EString "{" ("ports" "{" ports+=Port ("," ports+=Port)* "}")? ("boxInstances" "{"
	//	boxInstances+=BoxInstance ("," boxInstances+=BoxInstance)* "}")? ("connections" "{" connections+=Connection (","
	//	connections+=Connection)* "}")? "}";
	public BoxElements getBoxAccess() {
		return pBox;
	}
	
	public ParserRule getBoxRule() {
		return getBoxAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//Port:
	//	{Port} "Port" name=EString;
	public PortElements getPortAccess() {
		return pPort;
	}
	
	public ParserRule getPortRule() {
		return getPortAccess().getRule();
	}

	//Connection:
	//	"Connection" "{" "intPorts" "(" intPorts+=[Port|QualifiedName] ("," intPorts+=[Port|QualifiedName])* ")" ("extPorts"
	//	"(" extPorts+=[Port|QualifiedName] ("," extPorts+=[Port|QualifiedName])* ")")? "}";
	public ConnectionElements getConnectionAccess() {
		return pConnection;
	}
	
	public ParserRule getConnectionRule() {
		return getConnectionAccess().getRule();
	}

	//BoxInstance:
	//	"BoxInstance" "{" "boxRef" boxRef=[Box|QualifiedName] ("instanceName" instanceName=EString)? "}";
	public BoxInstanceElements getBoxInstanceAccess() {
		return pBoxInstance;
	}
	
	public ParserRule getBoxInstanceRule() {
		return getBoxInstanceAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}