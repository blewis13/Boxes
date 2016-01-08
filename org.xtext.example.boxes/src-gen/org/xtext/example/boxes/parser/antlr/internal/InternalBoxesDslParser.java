package org.xtext.example.boxes.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.boxes.services.BoxesDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoxesDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Box'", "'{'", "'ports'", "','", "'}'", "'boxInstances'", "'Port'", "'Connection'", "'intPorts'", "'('", "')'", "'extPorts'", "'BoxInstance'", "'boxRef'", "'instanceName'", "'connections'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBoxesDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBoxesDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBoxesDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g"; }



     	private BoxesDslGrammarAccess grammarAccess;
     	
        public InternalBoxesDslParser(TokenStream input, BoxesDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Box";	
       	}
       	
       	@Override
       	protected BoxesDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBox"
    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:67:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:68:2: (iv_ruleBox= ruleBox EOF )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:69:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBox_in_entryRuleBox75);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBox85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:76:1: ruleBox returns [EObject current=null] : ( () otherlv_1= 'Box' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ports' otherlv_5= '{' ( (lv_ports_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_ports_8_0= rulePort ) ) )* otherlv_9= '}' )? (otherlv_10= 'boxInstances' otherlv_11= '{' ( (lv_boxInstances_12_0= ruleBoxInstance ) ) (otherlv_13= ',' ( (lv_boxInstances_14_0= ruleBoxInstance ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ports_6_0 = null;

        EObject lv_ports_8_0 = null;

        EObject lv_boxInstances_12_0 = null;

        EObject lv_boxInstances_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:79:28: ( ( () otherlv_1= 'Box' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ports' otherlv_5= '{' ( (lv_ports_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_ports_8_0= rulePort ) ) )* otherlv_9= '}' )? (otherlv_10= 'boxInstances' otherlv_11= '{' ( (lv_boxInstances_12_0= ruleBoxInstance ) ) (otherlv_13= ',' ( (lv_boxInstances_14_0= ruleBoxInstance ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:80:1: ( () otherlv_1= 'Box' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ports' otherlv_5= '{' ( (lv_ports_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_ports_8_0= rulePort ) ) )* otherlv_9= '}' )? (otherlv_10= 'boxInstances' otherlv_11= '{' ( (lv_boxInstances_12_0= ruleBoxInstance ) ) (otherlv_13= ',' ( (lv_boxInstances_14_0= ruleBoxInstance ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:80:1: ( () otherlv_1= 'Box' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ports' otherlv_5= '{' ( (lv_ports_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_ports_8_0= rulePort ) ) )* otherlv_9= '}' )? (otherlv_10= 'boxInstances' otherlv_11= '{' ( (lv_boxInstances_12_0= ruleBoxInstance ) ) (otherlv_13= ',' ( (lv_boxInstances_14_0= ruleBoxInstance ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:80:2: () otherlv_1= 'Box' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ports' otherlv_5= '{' ( (lv_ports_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_ports_8_0= rulePort ) ) )* otherlv_9= '}' )? (otherlv_10= 'boxInstances' otherlv_11= '{' ( (lv_boxInstances_12_0= ruleBoxInstance ) ) (otherlv_13= ',' ( (lv_boxInstances_14_0= ruleBoxInstance ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:80:2: ()
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoxAccess().getBoxAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleBox131); 

                	newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
                
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:90:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:91:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:91:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:92:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBoxAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBox152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBoxRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBox164); 

                	newLeafNode(otherlv_3, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:112:1: (otherlv_4= 'ports' otherlv_5= '{' ( (lv_ports_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_ports_8_0= rulePort ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:112:3: otherlv_4= 'ports' otherlv_5= '{' ( (lv_ports_6_0= rulePort ) ) (otherlv_7= ',' ( (lv_ports_8_0= rulePort ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBox177); 

                        	newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getPortsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBox189); 

                        	newLeafNode(otherlv_5, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:120:1: ( (lv_ports_6_0= rulePort ) )
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:121:1: (lv_ports_6_0= rulePort )
                    {
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:121:1: (lv_ports_6_0= rulePort )
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:122:3: lv_ports_6_0= rulePort
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoxAccess().getPortsPortParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePort_in_ruleBox210);
                    lv_ports_6_0=rulePort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBoxRule());
                    	        }
                           		add(
                           			current, 
                           			"ports",
                            		lv_ports_6_0, 
                            		"Port");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:138:2: (otherlv_7= ',' ( (lv_ports_8_0= rulePort ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:138:4: otherlv_7= ',' ( (lv_ports_8_0= rulePort ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBox223); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getBoxAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:142:1: ( (lv_ports_8_0= rulePort ) )
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:143:1: (lv_ports_8_0= rulePort )
                    	    {
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:143:1: (lv_ports_8_0= rulePort )
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:144:3: lv_ports_8_0= rulePort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBoxAccess().getPortsPortParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePort_in_ruleBox244);
                    	    lv_ports_8_0=rulePort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBoxRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ports",
                    	            		lv_ports_8_0, 
                    	            		"Port");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBox258); 

                        	newLeafNode(otherlv_9, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:164:3: (otherlv_10= 'boxInstances' otherlv_11= '{' ( (lv_boxInstances_12_0= ruleBoxInstance ) ) (otherlv_13= ',' ( (lv_boxInstances_14_0= ruleBoxInstance ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:164:5: otherlv_10= 'boxInstances' otherlv_11= '{' ( (lv_boxInstances_12_0= ruleBoxInstance ) ) (otherlv_13= ',' ( (lv_boxInstances_14_0= ruleBoxInstance ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBox273); 

                        	newLeafNode(otherlv_10, grammarAccess.getBoxAccess().getBoxInstancesKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBox285); 

                        	newLeafNode(otherlv_11, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:172:1: ( (lv_boxInstances_12_0= ruleBoxInstance ) )
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:173:1: (lv_boxInstances_12_0= ruleBoxInstance )
                    {
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:173:1: (lv_boxInstances_12_0= ruleBoxInstance )
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:174:3: lv_boxInstances_12_0= ruleBoxInstance
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoxAccess().getBoxInstancesBoxInstanceParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBoxInstance_in_ruleBox306);
                    lv_boxInstances_12_0=ruleBoxInstance();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBoxRule());
                    	        }
                           		add(
                           			current, 
                           			"boxInstances",
                            		lv_boxInstances_12_0, 
                            		"BoxInstance");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:190:2: (otherlv_13= ',' ( (lv_boxInstances_14_0= ruleBoxInstance ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:190:4: otherlv_13= ',' ( (lv_boxInstances_14_0= ruleBoxInstance ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBox319); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getBoxAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:194:1: ( (lv_boxInstances_14_0= ruleBoxInstance ) )
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:195:1: (lv_boxInstances_14_0= ruleBoxInstance )
                    	    {
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:195:1: (lv_boxInstances_14_0= ruleBoxInstance )
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:196:3: lv_boxInstances_14_0= ruleBoxInstance
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBoxAccess().getBoxInstancesBoxInstanceParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBoxInstance_in_ruleBox340);
                    	    lv_boxInstances_14_0=ruleBoxInstance();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBoxRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"boxInstances",
                    	            		lv_boxInstances_14_0, 
                    	            		"BoxInstance");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBox354); 

                        	newLeafNode(otherlv_15, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBox368); 

                	newLeafNode(otherlv_16, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:228:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:229:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:230:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString405);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString416); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:237:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:240:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:241:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:241:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:241:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString456); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:249:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString482); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePort"
    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:264:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:265:2: (iv_rulePort= rulePort EOF )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:266:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePort_in_entryRulePort527);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePort537); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:273:1: rulePort returns [EObject current=null] : ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:276:28: ( ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:277:1: ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:277:1: ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:277:2: () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) )
            {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:277:2: ()
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:278:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPortAccess().getPortAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePort583); 

                	newLeafNode(otherlv_1, grammarAccess.getPortAccess().getPortKeyword_1());
                
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:287:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:288:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:288:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:289:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPortAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePort604);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPortRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleConnection"
    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:313:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:314:2: (iv_ruleConnection= ruleConnection EOF )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:315:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_entryRuleConnection640);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConnection650); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:322:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'Connection' otherlv_1= '{' otherlv_2= 'intPorts' otherlv_3= '(' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= ')' (otherlv_8= 'extPorts' otherlv_9= '(' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:325:28: ( (otherlv_0= 'Connection' otherlv_1= '{' otherlv_2= 'intPorts' otherlv_3= '(' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= ')' (otherlv_8= 'extPorts' otherlv_9= '(' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:326:1: (otherlv_0= 'Connection' otherlv_1= '{' otherlv_2= 'intPorts' otherlv_3= '(' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= ')' (otherlv_8= 'extPorts' otherlv_9= '(' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:326:1: (otherlv_0= 'Connection' otherlv_1= '{' otherlv_2= 'intPorts' otherlv_3= '(' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= ')' (otherlv_8= 'extPorts' otherlv_9= '(' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:326:3: otherlv_0= 'Connection' otherlv_1= '{' otherlv_2= 'intPorts' otherlv_3= '(' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* otherlv_7= ')' (otherlv_8= 'extPorts' otherlv_9= '(' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ')' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConnection687); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getConnectionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConnection699); 

                	newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConnection711); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getIntPortsKeyword_2());
                
            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleConnection723); 

                	newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:342:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:343:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:343:1: ( ruleQualifiedName )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:344:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectionAccess().getIntPortsPortCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleConnection746);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:357:2: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:357:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConnection759); 

            	        	newLeafNode(otherlv_5, grammarAccess.getConnectionAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:361:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:362:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:362:1: ( ruleQualifiedName )
            	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:363:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConnectionRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionAccess().getIntPortsPortCrossReference_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleConnection782);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConnection796); 

                	newLeafNode(otherlv_7, grammarAccess.getConnectionAccess().getRightParenthesisKeyword_6());
                
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:380:1: (otherlv_8= 'extPorts' otherlv_9= '(' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:380:3: otherlv_8= 'extPorts' otherlv_9= '(' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleConnection809); 

                        	newLeafNode(otherlv_8, grammarAccess.getConnectionAccess().getExtPortsKeyword_7_0());
                        
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleConnection821); 

                        	newLeafNode(otherlv_9, grammarAccess.getConnectionAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:388:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:389:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:389:1: ( ruleQualifiedName )
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:390:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnectionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getConnectionAccess().getExtPortsPortCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleConnection844);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:403:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:403:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConnection857); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getConnectionAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:407:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:408:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:408:1: ( ruleQualifiedName )
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:409:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getConnectionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getConnectionAccess().getExtPortsPortCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleConnection880);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConnection894); 

                        	newLeafNode(otherlv_13, grammarAccess.getConnectionAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConnection908); 

                	newLeafNode(otherlv_14, grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleBoxInstance"
    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:438:1: entryRuleBoxInstance returns [EObject current=null] : iv_ruleBoxInstance= ruleBoxInstance EOF ;
    public final EObject entryRuleBoxInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoxInstance = null;


        try {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:439:2: (iv_ruleBoxInstance= ruleBoxInstance EOF )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:440:2: iv_ruleBoxInstance= ruleBoxInstance EOF
            {
             newCompositeNode(grammarAccess.getBoxInstanceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoxInstance_in_entryRuleBoxInstance944);
            iv_ruleBoxInstance=ruleBoxInstance();

            state._fsp--;

             current =iv_ruleBoxInstance; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoxInstance954); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoxInstance"


    // $ANTLR start "ruleBoxInstance"
    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:447:1: ruleBoxInstance returns [EObject current=null] : (otherlv_0= 'BoxInstance' otherlv_1= '{' otherlv_2= 'boxRef' ( ( ruleQualifiedName ) ) (otherlv_4= 'instanceName' ( (lv_instanceName_5_0= ruleEString ) ) )? (otherlv_6= 'connections' otherlv_7= '{' ( (lv_connections_8_0= ruleConnection ) ) (otherlv_9= ',' ( (lv_connections_10_0= ruleConnection ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleBoxInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_instanceName_5_0 = null;

        EObject lv_connections_8_0 = null;

        EObject lv_connections_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:450:28: ( (otherlv_0= 'BoxInstance' otherlv_1= '{' otherlv_2= 'boxRef' ( ( ruleQualifiedName ) ) (otherlv_4= 'instanceName' ( (lv_instanceName_5_0= ruleEString ) ) )? (otherlv_6= 'connections' otherlv_7= '{' ( (lv_connections_8_0= ruleConnection ) ) (otherlv_9= ',' ( (lv_connections_10_0= ruleConnection ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:451:1: (otherlv_0= 'BoxInstance' otherlv_1= '{' otherlv_2= 'boxRef' ( ( ruleQualifiedName ) ) (otherlv_4= 'instanceName' ( (lv_instanceName_5_0= ruleEString ) ) )? (otherlv_6= 'connections' otherlv_7= '{' ( (lv_connections_8_0= ruleConnection ) ) (otherlv_9= ',' ( (lv_connections_10_0= ruleConnection ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:451:1: (otherlv_0= 'BoxInstance' otherlv_1= '{' otherlv_2= 'boxRef' ( ( ruleQualifiedName ) ) (otherlv_4= 'instanceName' ( (lv_instanceName_5_0= ruleEString ) ) )? (otherlv_6= 'connections' otherlv_7= '{' ( (lv_connections_8_0= ruleConnection ) ) (otherlv_9= ',' ( (lv_connections_10_0= ruleConnection ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:451:3: otherlv_0= 'BoxInstance' otherlv_1= '{' otherlv_2= 'boxRef' ( ( ruleQualifiedName ) ) (otherlv_4= 'instanceName' ( (lv_instanceName_5_0= ruleEString ) ) )? (otherlv_6= 'connections' otherlv_7= '{' ( (lv_connections_8_0= ruleConnection ) ) (otherlv_9= ',' ( (lv_connections_10_0= ruleConnection ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBoxInstance991); 

                	newLeafNode(otherlv_0, grammarAccess.getBoxInstanceAccess().getBoxInstanceKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBoxInstance1003); 

                	newLeafNode(otherlv_1, grammarAccess.getBoxInstanceAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBoxInstance1015); 

                	newLeafNode(otherlv_2, grammarAccess.getBoxInstanceAccess().getBoxRefKeyword_2());
                
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:463:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:464:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:464:1: ( ruleQualifiedName )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:465:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBoxInstanceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBoxInstanceAccess().getBoxRefBoxCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleBoxInstance1038);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:478:2: (otherlv_4= 'instanceName' ( (lv_instanceName_5_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:478:4: otherlv_4= 'instanceName' ( (lv_instanceName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBoxInstance1051); 

                        	newLeafNode(otherlv_4, grammarAccess.getBoxInstanceAccess().getInstanceNameKeyword_4_0());
                        
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:482:1: ( (lv_instanceName_5_0= ruleEString ) )
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:483:1: (lv_instanceName_5_0= ruleEString )
                    {
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:483:1: (lv_instanceName_5_0= ruleEString )
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:484:3: lv_instanceName_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoxInstanceAccess().getInstanceNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBoxInstance1072);
                    lv_instanceName_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBoxInstanceRule());
                    	        }
                           		set(
                           			current, 
                           			"instanceName",
                            		lv_instanceName_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:500:4: (otherlv_6= 'connections' otherlv_7= '{' ( (lv_connections_8_0= ruleConnection ) ) (otherlv_9= ',' ( (lv_connections_10_0= ruleConnection ) ) )* otherlv_11= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:500:6: otherlv_6= 'connections' otherlv_7= '{' ( (lv_connections_8_0= ruleConnection ) ) (otherlv_9= ',' ( (lv_connections_10_0= ruleConnection ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBoxInstance1087); 

                        	newLeafNode(otherlv_6, grammarAccess.getBoxInstanceAccess().getConnectionsKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBoxInstance1099); 

                        	newLeafNode(otherlv_7, grammarAccess.getBoxInstanceAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:508:1: ( (lv_connections_8_0= ruleConnection ) )
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:509:1: (lv_connections_8_0= ruleConnection )
                    {
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:509:1: (lv_connections_8_0= ruleConnection )
                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:510:3: lv_connections_8_0= ruleConnection
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoxInstanceAccess().getConnectionsConnectionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConnection_in_ruleBoxInstance1120);
                    lv_connections_8_0=ruleConnection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBoxInstanceRule());
                    	        }
                           		add(
                           			current, 
                           			"connections",
                            		lv_connections_8_0, 
                            		"Connection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:526:2: (otherlv_9= ',' ( (lv_connections_10_0= ruleConnection ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:526:4: otherlv_9= ',' ( (lv_connections_10_0= ruleConnection ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBoxInstance1133); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getBoxInstanceAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:530:1: ( (lv_connections_10_0= ruleConnection ) )
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:531:1: (lv_connections_10_0= ruleConnection )
                    	    {
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:531:1: (lv_connections_10_0= ruleConnection )
                    	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:532:3: lv_connections_10_0= ruleConnection
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBoxInstanceAccess().getConnectionsConnectionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConnection_in_ruleBoxInstance1154);
                    	    lv_connections_10_0=ruleConnection();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBoxInstanceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"connections",
                    	            		lv_connections_10_0, 
                    	            		"Connection");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBoxInstance1168); 

                        	newLeafNode(otherlv_11, grammarAccess.getBoxInstanceAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBoxInstance1182); 

                	newLeafNode(otherlv_12, grammarAccess.getBoxInstanceAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoxInstance"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:564:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:565:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:566:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1219);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName1230); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:573:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:576:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:577:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:577:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:577:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName1270); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:584:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.boxes/src-gen/org/xtext/example/boxes/parser/antlr/internal/InternalBoxesDsl.g:585:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleQualifiedName1289); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName1304); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleBox_in_entryRuleBox75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBox85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleBox131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBox152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBox164 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleBox177 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBox189 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rulePort_in_ruleBox210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBox223 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rulePort_in_ruleBox244 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBox258 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleBox273 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBox285 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleBoxInstance_in_ruleBox306 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBox319 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleBoxInstance_in_ruleBox340 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBox354 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBox368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString405 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePort_in_entryRulePort527 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePort537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rulePort583 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePort604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection640 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnection650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleConnection687 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConnection699 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleConnection711 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleConnection723 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConnection746 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_14_in_ruleConnection759 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConnection782 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_21_in_ruleConnection796 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_22_in_ruleConnection809 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleConnection821 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConnection844 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_14_in_ruleConnection857 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConnection880 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_21_in_ruleConnection894 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConnection908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoxInstance_in_entryRuleBoxInstance944 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoxInstance954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleBoxInstance991 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBoxInstance1003 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleBoxInstance1015 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBoxInstance1038 = new BitSet(new long[]{0x0000000006008000L});
        public static final BitSet FOLLOW_25_in_ruleBoxInstance1051 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBoxInstance1072 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleBoxInstance1087 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBoxInstance1099 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleConnection_in_ruleBoxInstance1120 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleBoxInstance1133 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleConnection_in_ruleBoxInstance1154 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleBoxInstance1168 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBoxInstance1182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1219 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1270 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleQualifiedName1289 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1304 = new BitSet(new long[]{0x0000000008000002L});
    }


}