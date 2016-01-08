package org.xtext.example.boxes.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.boxes.services.BoxesDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoxesDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Box'", "'{'", "'}'", "'ports'", "','", "'boxInstances'", "'Port'", "'Connection'", "'intPorts'", "'('", "')'", "'extPorts'", "'BoxInstance'", "'boxRef'", "'instanceName'", "'connections'", "'.'"
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
    public String getGrammarFileName() { return "../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g"; }


     
     	private BoxesDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BoxesDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleBox"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:60:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:61:1: ( ruleBox EOF )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:62:1: ruleBox EOF
            {
             before(grammarAccess.getBoxRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBox_in_entryRuleBox61);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getBoxRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBox68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:69:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:73:2: ( ( ( rule__Box__Group__0 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:74:1: ( ( rule__Box__Group__0 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:74:1: ( ( rule__Box__Group__0 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:75:1: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:76:1: ( rule__Box__Group__0 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:76:2: rule__Box__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__0_in_ruleBox94);
            rule__Box__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:89:1: ( ruleEString EOF )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString121);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:104:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString154);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePort"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:116:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:117:1: ( rulePort EOF )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:118:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePort_in_entryRulePort181);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePort188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:125:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:129:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:130:1: ( ( rule__Port__Group__0 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:130:1: ( ( rule__Port__Group__0 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:131:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:132:1: ( rule__Port__Group__0 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:132:2: rule__Port__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Port__Group__0_in_rulePort214);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleConnection"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:144:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:145:1: ( ruleConnection EOF )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:146:1: ruleConnection EOF
            {
             before(grammarAccess.getConnectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_entryRuleConnection241);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConnectionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConnection248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:153:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:157:2: ( ( ( rule__Connection__Group__0 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:158:1: ( ( rule__Connection__Group__0 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:158:1: ( ( rule__Connection__Group__0 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:159:1: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:160:1: ( rule__Connection__Group__0 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:160:2: rule__Connection__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__0_in_ruleConnection274);
            rule__Connection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleBoxInstance"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:172:1: entryRuleBoxInstance : ruleBoxInstance EOF ;
    public final void entryRuleBoxInstance() throws RecognitionException {
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:173:1: ( ruleBoxInstance EOF )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:174:1: ruleBoxInstance EOF
            {
             before(grammarAccess.getBoxInstanceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoxInstance_in_entryRuleBoxInstance301);
            ruleBoxInstance();

            state._fsp--;

             after(grammarAccess.getBoxInstanceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoxInstance308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoxInstance"


    // $ANTLR start "ruleBoxInstance"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:181:1: ruleBoxInstance : ( ( rule__BoxInstance__Group__0 ) ) ;
    public final void ruleBoxInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:185:2: ( ( ( rule__BoxInstance__Group__0 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:186:1: ( ( rule__BoxInstance__Group__0 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:186:1: ( ( rule__BoxInstance__Group__0 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:187:1: ( rule__BoxInstance__Group__0 )
            {
             before(grammarAccess.getBoxInstanceAccess().getGroup()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:188:1: ( rule__BoxInstance__Group__0 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:188:2: rule__BoxInstance__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__0_in_ruleBoxInstance334);
            rule__BoxInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoxInstance"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:200:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:201:1: ( ruleQualifiedName EOF )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:202:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName361);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:209:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:213:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:214:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:214:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:215:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:216:1: ( rule__QualifiedName__Group__0 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:216:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName394);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:228:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:232:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:233:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:233:1: ( RULE_STRING )
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:234:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives430); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:239:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:239:6: ( RULE_ID )
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:240:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives447); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Box__Group__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:252:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:256:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:257:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__0__Impl_in_rule__Box__Group__0477);
            rule__Box__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__1_in_rule__Box__Group__0480);
            rule__Box__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0"


    // $ANTLR start "rule__Box__Group__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:264:1: rule__Box__Group__0__Impl : ( () ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:268:1: ( ( () ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:269:1: ( () )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:269:1: ( () )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:270:1: ()
            {
             before(grammarAccess.getBoxAccess().getBoxAction_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:271:1: ()
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:273:1: 
            {
            }

             after(grammarAccess.getBoxAccess().getBoxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0__Impl"


    // $ANTLR start "rule__Box__Group__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:283:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:287:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:288:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__1__Impl_in_rule__Box__Group__1538);
            rule__Box__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__2_in_rule__Box__Group__1541);
            rule__Box__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1"


    // $ANTLR start "rule__Box__Group__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:295:1: rule__Box__Group__1__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:299:1: ( ( 'Box' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:300:1: ( 'Box' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:300:1: ( 'Box' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:301:1: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Box__Group__1__Impl569); 
             after(grammarAccess.getBoxAccess().getBoxKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1__Impl"


    // $ANTLR start "rule__Box__Group__2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:314:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:318:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:319:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__2__Impl_in_rule__Box__Group__2600);
            rule__Box__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__3_in_rule__Box__Group__2603);
            rule__Box__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2"


    // $ANTLR start "rule__Box__Group__2__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:326:1: rule__Box__Group__2__Impl : ( ( rule__Box__NameAssignment_2 ) ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:330:1: ( ( ( rule__Box__NameAssignment_2 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:331:1: ( ( rule__Box__NameAssignment_2 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:331:1: ( ( rule__Box__NameAssignment_2 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:332:1: ( rule__Box__NameAssignment_2 )
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_2()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:333:1: ( rule__Box__NameAssignment_2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:333:2: rule__Box__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__NameAssignment_2_in_rule__Box__Group__2__Impl630);
            rule__Box__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2__Impl"


    // $ANTLR start "rule__Box__Group__3"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:343:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:347:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:348:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__3__Impl_in_rule__Box__Group__3660);
            rule__Box__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__4_in_rule__Box__Group__3663);
            rule__Box__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3"


    // $ANTLR start "rule__Box__Group__3__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:355:1: rule__Box__Group__3__Impl : ( '{' ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:359:1: ( ( '{' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:360:1: ( '{' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:360:1: ( '{' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:361:1: '{'
            {
             before(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Box__Group__3__Impl691); 
             after(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3__Impl"


    // $ANTLR start "rule__Box__Group__4"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:374:1: rule__Box__Group__4 : rule__Box__Group__4__Impl rule__Box__Group__5 ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:378:1: ( rule__Box__Group__4__Impl rule__Box__Group__5 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:379:2: rule__Box__Group__4__Impl rule__Box__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__4__Impl_in_rule__Box__Group__4722);
            rule__Box__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__5_in_rule__Box__Group__4725);
            rule__Box__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4"


    // $ANTLR start "rule__Box__Group__4__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:386:1: rule__Box__Group__4__Impl : ( ( rule__Box__Group_4__0 )? ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:390:1: ( ( ( rule__Box__Group_4__0 )? ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:391:1: ( ( rule__Box__Group_4__0 )? )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:391:1: ( ( rule__Box__Group_4__0 )? )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:392:1: ( rule__Box__Group_4__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_4()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:393:1: ( rule__Box__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:393:2: rule__Box__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__0_in_rule__Box__Group__4__Impl752);
                    rule__Box__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4__Impl"


    // $ANTLR start "rule__Box__Group__5"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:403:1: rule__Box__Group__5 : rule__Box__Group__5__Impl rule__Box__Group__6 ;
    public final void rule__Box__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:407:1: ( rule__Box__Group__5__Impl rule__Box__Group__6 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:408:2: rule__Box__Group__5__Impl rule__Box__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__5__Impl_in_rule__Box__Group__5783);
            rule__Box__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__6_in_rule__Box__Group__5786);
            rule__Box__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__5"


    // $ANTLR start "rule__Box__Group__5__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:415:1: rule__Box__Group__5__Impl : ( ( rule__Box__Group_5__0 )? ) ;
    public final void rule__Box__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:419:1: ( ( ( rule__Box__Group_5__0 )? ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:420:1: ( ( rule__Box__Group_5__0 )? )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:420:1: ( ( rule__Box__Group_5__0 )? )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:421:1: ( rule__Box__Group_5__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_5()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:422:1: ( rule__Box__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:422:2: rule__Box__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__0_in_rule__Box__Group__5__Impl813);
                    rule__Box__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__5__Impl"


    // $ANTLR start "rule__Box__Group__6"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:432:1: rule__Box__Group__6 : rule__Box__Group__6__Impl ;
    public final void rule__Box__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:436:1: ( rule__Box__Group__6__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:437:2: rule__Box__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__6__Impl_in_rule__Box__Group__6844);
            rule__Box__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__6"


    // $ANTLR start "rule__Box__Group__6__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:443:1: rule__Box__Group__6__Impl : ( '}' ) ;
    public final void rule__Box__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:447:1: ( ( '}' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:448:1: ( '}' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:448:1: ( '}' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:449:1: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Box__Group__6__Impl872); 
             after(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__6__Impl"


    // $ANTLR start "rule__Box__Group_4__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:476:1: rule__Box__Group_4__0 : rule__Box__Group_4__0__Impl rule__Box__Group_4__1 ;
    public final void rule__Box__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:480:1: ( rule__Box__Group_4__0__Impl rule__Box__Group_4__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:481:2: rule__Box__Group_4__0__Impl rule__Box__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__0__Impl_in_rule__Box__Group_4__0917);
            rule__Box__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__1_in_rule__Box__Group_4__0920);
            rule__Box__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__0"


    // $ANTLR start "rule__Box__Group_4__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:488:1: rule__Box__Group_4__0__Impl : ( 'ports' ) ;
    public final void rule__Box__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:492:1: ( ( 'ports' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:493:1: ( 'ports' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:493:1: ( 'ports' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:494:1: 'ports'
            {
             before(grammarAccess.getBoxAccess().getPortsKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Box__Group_4__0__Impl948); 
             after(grammarAccess.getBoxAccess().getPortsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__0__Impl"


    // $ANTLR start "rule__Box__Group_4__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:507:1: rule__Box__Group_4__1 : rule__Box__Group_4__1__Impl rule__Box__Group_4__2 ;
    public final void rule__Box__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:511:1: ( rule__Box__Group_4__1__Impl rule__Box__Group_4__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:512:2: rule__Box__Group_4__1__Impl rule__Box__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__1__Impl_in_rule__Box__Group_4__1979);
            rule__Box__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__2_in_rule__Box__Group_4__1982);
            rule__Box__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__1"


    // $ANTLR start "rule__Box__Group_4__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:519:1: rule__Box__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Box__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:523:1: ( ( '{' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:524:1: ( '{' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:524:1: ( '{' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:525:1: '{'
            {
             before(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Box__Group_4__1__Impl1010); 
             after(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__1__Impl"


    // $ANTLR start "rule__Box__Group_4__2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:538:1: rule__Box__Group_4__2 : rule__Box__Group_4__2__Impl rule__Box__Group_4__3 ;
    public final void rule__Box__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:542:1: ( rule__Box__Group_4__2__Impl rule__Box__Group_4__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:543:2: rule__Box__Group_4__2__Impl rule__Box__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__2__Impl_in_rule__Box__Group_4__21041);
            rule__Box__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__3_in_rule__Box__Group_4__21044);
            rule__Box__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__2"


    // $ANTLR start "rule__Box__Group_4__2__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:550:1: rule__Box__Group_4__2__Impl : ( ( rule__Box__PortsAssignment_4_2 ) ) ;
    public final void rule__Box__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:554:1: ( ( ( rule__Box__PortsAssignment_4_2 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:555:1: ( ( rule__Box__PortsAssignment_4_2 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:555:1: ( ( rule__Box__PortsAssignment_4_2 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:556:1: ( rule__Box__PortsAssignment_4_2 )
            {
             before(grammarAccess.getBoxAccess().getPortsAssignment_4_2()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:557:1: ( rule__Box__PortsAssignment_4_2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:557:2: rule__Box__PortsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__PortsAssignment_4_2_in_rule__Box__Group_4__2__Impl1071);
            rule__Box__PortsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getPortsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__2__Impl"


    // $ANTLR start "rule__Box__Group_4__3"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:567:1: rule__Box__Group_4__3 : rule__Box__Group_4__3__Impl rule__Box__Group_4__4 ;
    public final void rule__Box__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:571:1: ( rule__Box__Group_4__3__Impl rule__Box__Group_4__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:572:2: rule__Box__Group_4__3__Impl rule__Box__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__3__Impl_in_rule__Box__Group_4__31101);
            rule__Box__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__4_in_rule__Box__Group_4__31104);
            rule__Box__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__3"


    // $ANTLR start "rule__Box__Group_4__3__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:579:1: rule__Box__Group_4__3__Impl : ( ( rule__Box__Group_4_3__0 )* ) ;
    public final void rule__Box__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:583:1: ( ( ( rule__Box__Group_4_3__0 )* ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:584:1: ( ( rule__Box__Group_4_3__0 )* )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:584:1: ( ( rule__Box__Group_4_3__0 )* )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:585:1: ( rule__Box__Group_4_3__0 )*
            {
             before(grammarAccess.getBoxAccess().getGroup_4_3()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:586:1: ( rule__Box__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:586:2: rule__Box__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4_3__0_in_rule__Box__Group_4__3__Impl1131);
            	    rule__Box__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getBoxAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__3__Impl"


    // $ANTLR start "rule__Box__Group_4__4"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:596:1: rule__Box__Group_4__4 : rule__Box__Group_4__4__Impl ;
    public final void rule__Box__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:600:1: ( rule__Box__Group_4__4__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:601:2: rule__Box__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__4__Impl_in_rule__Box__Group_4__41162);
            rule__Box__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__4"


    // $ANTLR start "rule__Box__Group_4__4__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:607:1: rule__Box__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Box__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:611:1: ( ( '}' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:612:1: ( '}' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:612:1: ( '}' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:613:1: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Box__Group_4__4__Impl1190); 
             after(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4__4__Impl"


    // $ANTLR start "rule__Box__Group_4_3__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:636:1: rule__Box__Group_4_3__0 : rule__Box__Group_4_3__0__Impl rule__Box__Group_4_3__1 ;
    public final void rule__Box__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:640:1: ( rule__Box__Group_4_3__0__Impl rule__Box__Group_4_3__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:641:2: rule__Box__Group_4_3__0__Impl rule__Box__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4_3__0__Impl_in_rule__Box__Group_4_3__01231);
            rule__Box__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4_3__1_in_rule__Box__Group_4_3__01234);
            rule__Box__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4_3__0"


    // $ANTLR start "rule__Box__Group_4_3__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:648:1: rule__Box__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Box__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:652:1: ( ( ',' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:653:1: ( ',' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:653:1: ( ',' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:654:1: ','
            {
             before(grammarAccess.getBoxAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Box__Group_4_3__0__Impl1262); 
             after(grammarAccess.getBoxAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4_3__0__Impl"


    // $ANTLR start "rule__Box__Group_4_3__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:667:1: rule__Box__Group_4_3__1 : rule__Box__Group_4_3__1__Impl ;
    public final void rule__Box__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:671:1: ( rule__Box__Group_4_3__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:672:2: rule__Box__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4_3__1__Impl_in_rule__Box__Group_4_3__11293);
            rule__Box__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4_3__1"


    // $ANTLR start "rule__Box__Group_4_3__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:678:1: rule__Box__Group_4_3__1__Impl : ( ( rule__Box__PortsAssignment_4_3_1 ) ) ;
    public final void rule__Box__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:682:1: ( ( ( rule__Box__PortsAssignment_4_3_1 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:683:1: ( ( rule__Box__PortsAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:683:1: ( ( rule__Box__PortsAssignment_4_3_1 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:684:1: ( rule__Box__PortsAssignment_4_3_1 )
            {
             before(grammarAccess.getBoxAccess().getPortsAssignment_4_3_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:685:1: ( rule__Box__PortsAssignment_4_3_1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:685:2: rule__Box__PortsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__PortsAssignment_4_3_1_in_rule__Box__Group_4_3__1__Impl1320);
            rule__Box__PortsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getPortsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_4_3__1__Impl"


    // $ANTLR start "rule__Box__Group_5__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:699:1: rule__Box__Group_5__0 : rule__Box__Group_5__0__Impl rule__Box__Group_5__1 ;
    public final void rule__Box__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:703:1: ( rule__Box__Group_5__0__Impl rule__Box__Group_5__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:704:2: rule__Box__Group_5__0__Impl rule__Box__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__0__Impl_in_rule__Box__Group_5__01354);
            rule__Box__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__1_in_rule__Box__Group_5__01357);
            rule__Box__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__0"


    // $ANTLR start "rule__Box__Group_5__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:711:1: rule__Box__Group_5__0__Impl : ( 'boxInstances' ) ;
    public final void rule__Box__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:715:1: ( ( 'boxInstances' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:716:1: ( 'boxInstances' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:716:1: ( 'boxInstances' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:717:1: 'boxInstances'
            {
             before(grammarAccess.getBoxAccess().getBoxInstancesKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Box__Group_5__0__Impl1385); 
             after(grammarAccess.getBoxAccess().getBoxInstancesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__0__Impl"


    // $ANTLR start "rule__Box__Group_5__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:730:1: rule__Box__Group_5__1 : rule__Box__Group_5__1__Impl rule__Box__Group_5__2 ;
    public final void rule__Box__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:734:1: ( rule__Box__Group_5__1__Impl rule__Box__Group_5__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:735:2: rule__Box__Group_5__1__Impl rule__Box__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__1__Impl_in_rule__Box__Group_5__11416);
            rule__Box__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__2_in_rule__Box__Group_5__11419);
            rule__Box__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__1"


    // $ANTLR start "rule__Box__Group_5__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:742:1: rule__Box__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Box__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:746:1: ( ( '{' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:747:1: ( '{' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:747:1: ( '{' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:748:1: '{'
            {
             before(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Box__Group_5__1__Impl1447); 
             after(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__1__Impl"


    // $ANTLR start "rule__Box__Group_5__2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:761:1: rule__Box__Group_5__2 : rule__Box__Group_5__2__Impl rule__Box__Group_5__3 ;
    public final void rule__Box__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:765:1: ( rule__Box__Group_5__2__Impl rule__Box__Group_5__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:766:2: rule__Box__Group_5__2__Impl rule__Box__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__2__Impl_in_rule__Box__Group_5__21478);
            rule__Box__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__3_in_rule__Box__Group_5__21481);
            rule__Box__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__2"


    // $ANTLR start "rule__Box__Group_5__2__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:773:1: rule__Box__Group_5__2__Impl : ( ( rule__Box__BoxInstancesAssignment_5_2 ) ) ;
    public final void rule__Box__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:777:1: ( ( ( rule__Box__BoxInstancesAssignment_5_2 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:778:1: ( ( rule__Box__BoxInstancesAssignment_5_2 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:778:1: ( ( rule__Box__BoxInstancesAssignment_5_2 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:779:1: ( rule__Box__BoxInstancesAssignment_5_2 )
            {
             before(grammarAccess.getBoxAccess().getBoxInstancesAssignment_5_2()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:780:1: ( rule__Box__BoxInstancesAssignment_5_2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:780:2: rule__Box__BoxInstancesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__BoxInstancesAssignment_5_2_in_rule__Box__Group_5__2__Impl1508);
            rule__Box__BoxInstancesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getBoxInstancesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__2__Impl"


    // $ANTLR start "rule__Box__Group_5__3"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:790:1: rule__Box__Group_5__3 : rule__Box__Group_5__3__Impl rule__Box__Group_5__4 ;
    public final void rule__Box__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:794:1: ( rule__Box__Group_5__3__Impl rule__Box__Group_5__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:795:2: rule__Box__Group_5__3__Impl rule__Box__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__3__Impl_in_rule__Box__Group_5__31538);
            rule__Box__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__4_in_rule__Box__Group_5__31541);
            rule__Box__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__3"


    // $ANTLR start "rule__Box__Group_5__3__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:802:1: rule__Box__Group_5__3__Impl : ( ( rule__Box__Group_5_3__0 )* ) ;
    public final void rule__Box__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:806:1: ( ( ( rule__Box__Group_5_3__0 )* ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:807:1: ( ( rule__Box__Group_5_3__0 )* )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:807:1: ( ( rule__Box__Group_5_3__0 )* )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:808:1: ( rule__Box__Group_5_3__0 )*
            {
             before(grammarAccess.getBoxAccess().getGroup_5_3()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:809:1: ( rule__Box__Group_5_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:809:2: rule__Box__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5_3__0_in_rule__Box__Group_5__3__Impl1568);
            	    rule__Box__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getBoxAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__3__Impl"


    // $ANTLR start "rule__Box__Group_5__4"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:819:1: rule__Box__Group_5__4 : rule__Box__Group_5__4__Impl ;
    public final void rule__Box__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:823:1: ( rule__Box__Group_5__4__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:824:2: rule__Box__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__4__Impl_in_rule__Box__Group_5__41599);
            rule__Box__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__4"


    // $ANTLR start "rule__Box__Group_5__4__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:830:1: rule__Box__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Box__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:834:1: ( ( '}' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:835:1: ( '}' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:835:1: ( '}' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:836:1: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Box__Group_5__4__Impl1627); 
             after(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5__4__Impl"


    // $ANTLR start "rule__Box__Group_5_3__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:859:1: rule__Box__Group_5_3__0 : rule__Box__Group_5_3__0__Impl rule__Box__Group_5_3__1 ;
    public final void rule__Box__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:863:1: ( rule__Box__Group_5_3__0__Impl rule__Box__Group_5_3__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:864:2: rule__Box__Group_5_3__0__Impl rule__Box__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5_3__0__Impl_in_rule__Box__Group_5_3__01668);
            rule__Box__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5_3__1_in_rule__Box__Group_5_3__01671);
            rule__Box__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5_3__0"


    // $ANTLR start "rule__Box__Group_5_3__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:871:1: rule__Box__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Box__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:875:1: ( ( ',' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:876:1: ( ',' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:876:1: ( ',' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:877:1: ','
            {
             before(grammarAccess.getBoxAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Box__Group_5_3__0__Impl1699); 
             after(grammarAccess.getBoxAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5_3__0__Impl"


    // $ANTLR start "rule__Box__Group_5_3__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:890:1: rule__Box__Group_5_3__1 : rule__Box__Group_5_3__1__Impl ;
    public final void rule__Box__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:894:1: ( rule__Box__Group_5_3__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:895:2: rule__Box__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5_3__1__Impl_in_rule__Box__Group_5_3__11730);
            rule__Box__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5_3__1"


    // $ANTLR start "rule__Box__Group_5_3__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:901:1: rule__Box__Group_5_3__1__Impl : ( ( rule__Box__BoxInstancesAssignment_5_3_1 ) ) ;
    public final void rule__Box__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:905:1: ( ( ( rule__Box__BoxInstancesAssignment_5_3_1 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:906:1: ( ( rule__Box__BoxInstancesAssignment_5_3_1 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:906:1: ( ( rule__Box__BoxInstancesAssignment_5_3_1 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:907:1: ( rule__Box__BoxInstancesAssignment_5_3_1 )
            {
             before(grammarAccess.getBoxAccess().getBoxInstancesAssignment_5_3_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:908:1: ( rule__Box__BoxInstancesAssignment_5_3_1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:908:2: rule__Box__BoxInstancesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__BoxInstancesAssignment_5_3_1_in_rule__Box__Group_5_3__1__Impl1757);
            rule__Box__BoxInstancesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getBoxInstancesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_5_3__1__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:922:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:926:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:927:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__01791);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Port__Group__1_in_rule__Port__Group__01794);
            rule__Port__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:934:1: rule__Port__Group__0__Impl : ( () ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:938:1: ( ( () ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:939:1: ( () )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:939:1: ( () )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:940:1: ()
            {
             before(grammarAccess.getPortAccess().getPortAction_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:941:1: ()
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:943:1: 
            {
            }

             after(grammarAccess.getPortAccess().getPortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:953:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:957:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:958:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__11852);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Port__Group__2_in_rule__Port__Group__11855);
            rule__Port__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:965:1: rule__Port__Group__1__Impl : ( 'Port' ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:969:1: ( ( 'Port' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:970:1: ( 'Port' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:970:1: ( 'Port' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:971:1: 'Port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Port__Group__1__Impl1883); 
             after(grammarAccess.getPortAccess().getPortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:984:1: rule__Port__Group__2 : rule__Port__Group__2__Impl ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:988:1: ( rule__Port__Group__2__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:989:2: rule__Port__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__21914);
            rule__Port__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:995:1: rule__Port__Group__2__Impl : ( ( rule__Port__NameAssignment_2 ) ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:999:1: ( ( ( rule__Port__NameAssignment_2 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1000:1: ( ( rule__Port__NameAssignment_2 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1000:1: ( ( rule__Port__NameAssignment_2 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1001:1: ( rule__Port__NameAssignment_2 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_2()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1002:1: ( rule__Port__NameAssignment_2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1002:2: rule__Port__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Port__NameAssignment_2_in_rule__Port__Group__2__Impl1941);
            rule__Port__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1018:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1022:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1023:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__01977);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__01980);
            rule__Connection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0"


    // $ANTLR start "rule__Connection__Group__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1030:1: rule__Connection__Group__0__Impl : ( 'Connection' ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1034:1: ( ( 'Connection' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1035:1: ( 'Connection' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1035:1: ( 'Connection' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1036:1: 'Connection'
            {
             before(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Connection__Group__0__Impl2008); 
             after(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0__Impl"


    // $ANTLR start "rule__Connection__Group__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1049:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1053:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1054:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__12039);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__12042);
            rule__Connection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1"


    // $ANTLR start "rule__Connection__Group__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1061:1: rule__Connection__Group__1__Impl : ( '{' ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1065:1: ( ( '{' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1066:1: ( '{' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1066:1: ( '{' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1067:1: '{'
            {
             before(grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Connection__Group__1__Impl2070); 
             after(grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1__Impl"


    // $ANTLR start "rule__Connection__Group__2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1080:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1084:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1085:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__22101);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__22104);
            rule__Connection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2"


    // $ANTLR start "rule__Connection__Group__2__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1092:1: rule__Connection__Group__2__Impl : ( 'intPorts' ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1096:1: ( ( 'intPorts' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1097:1: ( 'intPorts' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1097:1: ( 'intPorts' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1098:1: 'intPorts'
            {
             before(grammarAccess.getConnectionAccess().getIntPortsKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Connection__Group__2__Impl2132); 
             after(grammarAccess.getConnectionAccess().getIntPortsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__3"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1111:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1115:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1116:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__32163);
            rule__Connection__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__32166);
            rule__Connection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3"


    // $ANTLR start "rule__Connection__Group__3__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1123:1: rule__Connection__Group__3__Impl : ( '(' ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1127:1: ( ( '(' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1128:1: ( '(' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1128:1: ( '(' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1129:1: '('
            {
             before(grammarAccess.getConnectionAccess().getLeftParenthesisKeyword_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Connection__Group__3__Impl2194); 
             after(grammarAccess.getConnectionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group__4"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1142:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1146:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1147:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__42225);
            rule__Connection__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__5_in_rule__Connection__Group__42228);
            rule__Connection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4"


    // $ANTLR start "rule__Connection__Group__4__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1154:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__IntPortsAssignment_4 ) ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1158:1: ( ( ( rule__Connection__IntPortsAssignment_4 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1159:1: ( ( rule__Connection__IntPortsAssignment_4 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1159:1: ( ( rule__Connection__IntPortsAssignment_4 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1160:1: ( rule__Connection__IntPortsAssignment_4 )
            {
             before(grammarAccess.getConnectionAccess().getIntPortsAssignment_4()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1161:1: ( rule__Connection__IntPortsAssignment_4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1161:2: rule__Connection__IntPortsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__IntPortsAssignment_4_in_rule__Connection__Group__4__Impl2255);
            rule__Connection__IntPortsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getIntPortsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4__Impl"


    // $ANTLR start "rule__Connection__Group__5"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1171:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl rule__Connection__Group__6 ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1175:1: ( rule__Connection__Group__5__Impl rule__Connection__Group__6 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1176:2: rule__Connection__Group__5__Impl rule__Connection__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__5__Impl_in_rule__Connection__Group__52285);
            rule__Connection__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__6_in_rule__Connection__Group__52288);
            rule__Connection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__5"


    // $ANTLR start "rule__Connection__Group__5__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1183:1: rule__Connection__Group__5__Impl : ( ( rule__Connection__Group_5__0 )* ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1187:1: ( ( ( rule__Connection__Group_5__0 )* ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1188:1: ( ( rule__Connection__Group_5__0 )* )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1188:1: ( ( rule__Connection__Group_5__0 )* )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1189:1: ( rule__Connection__Group_5__0 )*
            {
             before(grammarAccess.getConnectionAccess().getGroup_5()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1190:1: ( rule__Connection__Group_5__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1190:2: rule__Connection__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_5__0_in_rule__Connection__Group__5__Impl2315);
            	    rule__Connection__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getConnectionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__5__Impl"


    // $ANTLR start "rule__Connection__Group__6"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1200:1: rule__Connection__Group__6 : rule__Connection__Group__6__Impl rule__Connection__Group__7 ;
    public final void rule__Connection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1204:1: ( rule__Connection__Group__6__Impl rule__Connection__Group__7 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1205:2: rule__Connection__Group__6__Impl rule__Connection__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__6__Impl_in_rule__Connection__Group__62346);
            rule__Connection__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__7_in_rule__Connection__Group__62349);
            rule__Connection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__6"


    // $ANTLR start "rule__Connection__Group__6__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1212:1: rule__Connection__Group__6__Impl : ( ')' ) ;
    public final void rule__Connection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1216:1: ( ( ')' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1217:1: ( ')' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1217:1: ( ')' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1218:1: ')'
            {
             before(grammarAccess.getConnectionAccess().getRightParenthesisKeyword_6()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Connection__Group__6__Impl2377); 
             after(grammarAccess.getConnectionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__6__Impl"


    // $ANTLR start "rule__Connection__Group__7"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1231:1: rule__Connection__Group__7 : rule__Connection__Group__7__Impl rule__Connection__Group__8 ;
    public final void rule__Connection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1235:1: ( rule__Connection__Group__7__Impl rule__Connection__Group__8 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1236:2: rule__Connection__Group__7__Impl rule__Connection__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__7__Impl_in_rule__Connection__Group__72408);
            rule__Connection__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__8_in_rule__Connection__Group__72411);
            rule__Connection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__7"


    // $ANTLR start "rule__Connection__Group__7__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1243:1: rule__Connection__Group__7__Impl : ( ( rule__Connection__Group_7__0 )? ) ;
    public final void rule__Connection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1247:1: ( ( ( rule__Connection__Group_7__0 )? ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1248:1: ( ( rule__Connection__Group_7__0 )? )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1248:1: ( ( rule__Connection__Group_7__0 )? )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1249:1: ( rule__Connection__Group_7__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_7()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1250:1: ( rule__Connection__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1250:2: rule__Connection__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__0_in_rule__Connection__Group__7__Impl2438);
                    rule__Connection__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__7__Impl"


    // $ANTLR start "rule__Connection__Group__8"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1260:1: rule__Connection__Group__8 : rule__Connection__Group__8__Impl ;
    public final void rule__Connection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1264:1: ( rule__Connection__Group__8__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1265:2: rule__Connection__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__8__Impl_in_rule__Connection__Group__82469);
            rule__Connection__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__8"


    // $ANTLR start "rule__Connection__Group__8__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1271:1: rule__Connection__Group__8__Impl : ( '}' ) ;
    public final void rule__Connection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1275:1: ( ( '}' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1276:1: ( '}' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1276:1: ( '}' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1277:1: '}'
            {
             before(grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Connection__Group__8__Impl2497); 
             after(grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__8__Impl"


    // $ANTLR start "rule__Connection__Group_5__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1308:1: rule__Connection__Group_5__0 : rule__Connection__Group_5__0__Impl rule__Connection__Group_5__1 ;
    public final void rule__Connection__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1312:1: ( rule__Connection__Group_5__0__Impl rule__Connection__Group_5__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1313:2: rule__Connection__Group_5__0__Impl rule__Connection__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_5__0__Impl_in_rule__Connection__Group_5__02546);
            rule__Connection__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_5__1_in_rule__Connection__Group_5__02549);
            rule__Connection__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_5__0"


    // $ANTLR start "rule__Connection__Group_5__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1320:1: rule__Connection__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Connection__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1324:1: ( ( ',' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1325:1: ( ',' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1325:1: ( ',' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1326:1: ','
            {
             before(grammarAccess.getConnectionAccess().getCommaKeyword_5_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Connection__Group_5__0__Impl2577); 
             after(grammarAccess.getConnectionAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_5__0__Impl"


    // $ANTLR start "rule__Connection__Group_5__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1339:1: rule__Connection__Group_5__1 : rule__Connection__Group_5__1__Impl ;
    public final void rule__Connection__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1343:1: ( rule__Connection__Group_5__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1344:2: rule__Connection__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_5__1__Impl_in_rule__Connection__Group_5__12608);
            rule__Connection__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_5__1"


    // $ANTLR start "rule__Connection__Group_5__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1350:1: rule__Connection__Group_5__1__Impl : ( ( rule__Connection__IntPortsAssignment_5_1 ) ) ;
    public final void rule__Connection__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1354:1: ( ( ( rule__Connection__IntPortsAssignment_5_1 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1355:1: ( ( rule__Connection__IntPortsAssignment_5_1 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1355:1: ( ( rule__Connection__IntPortsAssignment_5_1 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1356:1: ( rule__Connection__IntPortsAssignment_5_1 )
            {
             before(grammarAccess.getConnectionAccess().getIntPortsAssignment_5_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1357:1: ( rule__Connection__IntPortsAssignment_5_1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1357:2: rule__Connection__IntPortsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__IntPortsAssignment_5_1_in_rule__Connection__Group_5__1__Impl2635);
            rule__Connection__IntPortsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getIntPortsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_5__1__Impl"


    // $ANTLR start "rule__Connection__Group_7__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1371:1: rule__Connection__Group_7__0 : rule__Connection__Group_7__0__Impl rule__Connection__Group_7__1 ;
    public final void rule__Connection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1375:1: ( rule__Connection__Group_7__0__Impl rule__Connection__Group_7__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1376:2: rule__Connection__Group_7__0__Impl rule__Connection__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__0__Impl_in_rule__Connection__Group_7__02669);
            rule__Connection__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__1_in_rule__Connection__Group_7__02672);
            rule__Connection__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7__0"


    // $ANTLR start "rule__Connection__Group_7__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1383:1: rule__Connection__Group_7__0__Impl : ( 'extPorts' ) ;
    public final void rule__Connection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1387:1: ( ( 'extPorts' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1388:1: ( 'extPorts' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1388:1: ( 'extPorts' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1389:1: 'extPorts'
            {
             before(grammarAccess.getConnectionAccess().getExtPortsKeyword_7_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Connection__Group_7__0__Impl2700); 
             after(grammarAccess.getConnectionAccess().getExtPortsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7__0__Impl"


    // $ANTLR start "rule__Connection__Group_7__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1402:1: rule__Connection__Group_7__1 : rule__Connection__Group_7__1__Impl rule__Connection__Group_7__2 ;
    public final void rule__Connection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1406:1: ( rule__Connection__Group_7__1__Impl rule__Connection__Group_7__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1407:2: rule__Connection__Group_7__1__Impl rule__Connection__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__1__Impl_in_rule__Connection__Group_7__12731);
            rule__Connection__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__2_in_rule__Connection__Group_7__12734);
            rule__Connection__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7__1"


    // $ANTLR start "rule__Connection__Group_7__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1414:1: rule__Connection__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Connection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1418:1: ( ( '(' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1419:1: ( '(' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1419:1: ( '(' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1420:1: '('
            {
             before(grammarAccess.getConnectionAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Connection__Group_7__1__Impl2762); 
             after(grammarAccess.getConnectionAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7__1__Impl"


    // $ANTLR start "rule__Connection__Group_7__2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1433:1: rule__Connection__Group_7__2 : rule__Connection__Group_7__2__Impl rule__Connection__Group_7__3 ;
    public final void rule__Connection__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1437:1: ( rule__Connection__Group_7__2__Impl rule__Connection__Group_7__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1438:2: rule__Connection__Group_7__2__Impl rule__Connection__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__2__Impl_in_rule__Connection__Group_7__22793);
            rule__Connection__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__3_in_rule__Connection__Group_7__22796);
            rule__Connection__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7__2"


    // $ANTLR start "rule__Connection__Group_7__2__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1445:1: rule__Connection__Group_7__2__Impl : ( ( rule__Connection__ExtPortsAssignment_7_2 ) ) ;
    public final void rule__Connection__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1449:1: ( ( ( rule__Connection__ExtPortsAssignment_7_2 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1450:1: ( ( rule__Connection__ExtPortsAssignment_7_2 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1450:1: ( ( rule__Connection__ExtPortsAssignment_7_2 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1451:1: ( rule__Connection__ExtPortsAssignment_7_2 )
            {
             before(grammarAccess.getConnectionAccess().getExtPortsAssignment_7_2()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1452:1: ( rule__Connection__ExtPortsAssignment_7_2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1452:2: rule__Connection__ExtPortsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__ExtPortsAssignment_7_2_in_rule__Connection__Group_7__2__Impl2823);
            rule__Connection__ExtPortsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getExtPortsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7__2__Impl"


    // $ANTLR start "rule__Connection__Group_7__3"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1462:1: rule__Connection__Group_7__3 : rule__Connection__Group_7__3__Impl rule__Connection__Group_7__4 ;
    public final void rule__Connection__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1466:1: ( rule__Connection__Group_7__3__Impl rule__Connection__Group_7__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1467:2: rule__Connection__Group_7__3__Impl rule__Connection__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__3__Impl_in_rule__Connection__Group_7__32853);
            rule__Connection__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__4_in_rule__Connection__Group_7__32856);
            rule__Connection__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7__3"


    // $ANTLR start "rule__Connection__Group_7__3__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1474:1: rule__Connection__Group_7__3__Impl : ( ( rule__Connection__Group_7_3__0 )* ) ;
    public final void rule__Connection__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1478:1: ( ( ( rule__Connection__Group_7_3__0 )* ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1479:1: ( ( rule__Connection__Group_7_3__0 )* )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1479:1: ( ( rule__Connection__Group_7_3__0 )* )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1480:1: ( rule__Connection__Group_7_3__0 )*
            {
             before(grammarAccess.getConnectionAccess().getGroup_7_3()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1481:1: ( rule__Connection__Group_7_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1481:2: rule__Connection__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7_3__0_in_rule__Connection__Group_7__3__Impl2883);
            	    rule__Connection__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getConnectionAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7__3__Impl"


    // $ANTLR start "rule__Connection__Group_7__4"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1491:1: rule__Connection__Group_7__4 : rule__Connection__Group_7__4__Impl ;
    public final void rule__Connection__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1495:1: ( rule__Connection__Group_7__4__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1496:2: rule__Connection__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__4__Impl_in_rule__Connection__Group_7__42914);
            rule__Connection__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7__4"


    // $ANTLR start "rule__Connection__Group_7__4__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1502:1: rule__Connection__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Connection__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1506:1: ( ( ')' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1507:1: ( ')' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1507:1: ( ')' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1508:1: ')'
            {
             before(grammarAccess.getConnectionAccess().getRightParenthesisKeyword_7_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Connection__Group_7__4__Impl2942); 
             after(grammarAccess.getConnectionAccess().getRightParenthesisKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7__4__Impl"


    // $ANTLR start "rule__Connection__Group_7_3__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1531:1: rule__Connection__Group_7_3__0 : rule__Connection__Group_7_3__0__Impl rule__Connection__Group_7_3__1 ;
    public final void rule__Connection__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1535:1: ( rule__Connection__Group_7_3__0__Impl rule__Connection__Group_7_3__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1536:2: rule__Connection__Group_7_3__0__Impl rule__Connection__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7_3__0__Impl_in_rule__Connection__Group_7_3__02983);
            rule__Connection__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7_3__1_in_rule__Connection__Group_7_3__02986);
            rule__Connection__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7_3__0"


    // $ANTLR start "rule__Connection__Group_7_3__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1543:1: rule__Connection__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Connection__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1547:1: ( ( ',' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1548:1: ( ',' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1548:1: ( ',' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1549:1: ','
            {
             before(grammarAccess.getConnectionAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Connection__Group_7_3__0__Impl3014); 
             after(grammarAccess.getConnectionAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7_3__0__Impl"


    // $ANTLR start "rule__Connection__Group_7_3__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1562:1: rule__Connection__Group_7_3__1 : rule__Connection__Group_7_3__1__Impl ;
    public final void rule__Connection__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1566:1: ( rule__Connection__Group_7_3__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1567:2: rule__Connection__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7_3__1__Impl_in_rule__Connection__Group_7_3__13045);
            rule__Connection__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7_3__1"


    // $ANTLR start "rule__Connection__Group_7_3__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1573:1: rule__Connection__Group_7_3__1__Impl : ( ( rule__Connection__ExtPortsAssignment_7_3_1 ) ) ;
    public final void rule__Connection__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1577:1: ( ( ( rule__Connection__ExtPortsAssignment_7_3_1 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1578:1: ( ( rule__Connection__ExtPortsAssignment_7_3_1 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1578:1: ( ( rule__Connection__ExtPortsAssignment_7_3_1 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1579:1: ( rule__Connection__ExtPortsAssignment_7_3_1 )
            {
             before(grammarAccess.getConnectionAccess().getExtPortsAssignment_7_3_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1580:1: ( rule__Connection__ExtPortsAssignment_7_3_1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1580:2: rule__Connection__ExtPortsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__ExtPortsAssignment_7_3_1_in_rule__Connection__Group_7_3__1__Impl3072);
            rule__Connection__ExtPortsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getExtPortsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_7_3__1__Impl"


    // $ANTLR start "rule__BoxInstance__Group__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1594:1: rule__BoxInstance__Group__0 : rule__BoxInstance__Group__0__Impl rule__BoxInstance__Group__1 ;
    public final void rule__BoxInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1598:1: ( rule__BoxInstance__Group__0__Impl rule__BoxInstance__Group__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1599:2: rule__BoxInstance__Group__0__Impl rule__BoxInstance__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__0__Impl_in_rule__BoxInstance__Group__03106);
            rule__BoxInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__1_in_rule__BoxInstance__Group__03109);
            rule__BoxInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__0"


    // $ANTLR start "rule__BoxInstance__Group__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1606:1: rule__BoxInstance__Group__0__Impl : ( 'BoxInstance' ) ;
    public final void rule__BoxInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1610:1: ( ( 'BoxInstance' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1611:1: ( 'BoxInstance' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1611:1: ( 'BoxInstance' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1612:1: 'BoxInstance'
            {
             before(grammarAccess.getBoxInstanceAccess().getBoxInstanceKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__BoxInstance__Group__0__Impl3137); 
             after(grammarAccess.getBoxInstanceAccess().getBoxInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__0__Impl"


    // $ANTLR start "rule__BoxInstance__Group__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1625:1: rule__BoxInstance__Group__1 : rule__BoxInstance__Group__1__Impl rule__BoxInstance__Group__2 ;
    public final void rule__BoxInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1629:1: ( rule__BoxInstance__Group__1__Impl rule__BoxInstance__Group__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1630:2: rule__BoxInstance__Group__1__Impl rule__BoxInstance__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__1__Impl_in_rule__BoxInstance__Group__13168);
            rule__BoxInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__2_in_rule__BoxInstance__Group__13171);
            rule__BoxInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__1"


    // $ANTLR start "rule__BoxInstance__Group__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1637:1: rule__BoxInstance__Group__1__Impl : ( '{' ) ;
    public final void rule__BoxInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1641:1: ( ( '{' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1642:1: ( '{' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1642:1: ( '{' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1643:1: '{'
            {
             before(grammarAccess.getBoxInstanceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BoxInstance__Group__1__Impl3199); 
             after(grammarAccess.getBoxInstanceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__1__Impl"


    // $ANTLR start "rule__BoxInstance__Group__2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1656:1: rule__BoxInstance__Group__2 : rule__BoxInstance__Group__2__Impl rule__BoxInstance__Group__3 ;
    public final void rule__BoxInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1660:1: ( rule__BoxInstance__Group__2__Impl rule__BoxInstance__Group__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1661:2: rule__BoxInstance__Group__2__Impl rule__BoxInstance__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__2__Impl_in_rule__BoxInstance__Group__23230);
            rule__BoxInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__3_in_rule__BoxInstance__Group__23233);
            rule__BoxInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__2"


    // $ANTLR start "rule__BoxInstance__Group__2__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1668:1: rule__BoxInstance__Group__2__Impl : ( 'boxRef' ) ;
    public final void rule__BoxInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1672:1: ( ( 'boxRef' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1673:1: ( 'boxRef' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1673:1: ( 'boxRef' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1674:1: 'boxRef'
            {
             before(grammarAccess.getBoxInstanceAccess().getBoxRefKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__BoxInstance__Group__2__Impl3261); 
             after(grammarAccess.getBoxInstanceAccess().getBoxRefKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__2__Impl"


    // $ANTLR start "rule__BoxInstance__Group__3"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1687:1: rule__BoxInstance__Group__3 : rule__BoxInstance__Group__3__Impl rule__BoxInstance__Group__4 ;
    public final void rule__BoxInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1691:1: ( rule__BoxInstance__Group__3__Impl rule__BoxInstance__Group__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1692:2: rule__BoxInstance__Group__3__Impl rule__BoxInstance__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__3__Impl_in_rule__BoxInstance__Group__33292);
            rule__BoxInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__4_in_rule__BoxInstance__Group__33295);
            rule__BoxInstance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__3"


    // $ANTLR start "rule__BoxInstance__Group__3__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1699:1: rule__BoxInstance__Group__3__Impl : ( ( rule__BoxInstance__BoxRefAssignment_3 ) ) ;
    public final void rule__BoxInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1703:1: ( ( ( rule__BoxInstance__BoxRefAssignment_3 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1704:1: ( ( rule__BoxInstance__BoxRefAssignment_3 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1704:1: ( ( rule__BoxInstance__BoxRefAssignment_3 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1705:1: ( rule__BoxInstance__BoxRefAssignment_3 )
            {
             before(grammarAccess.getBoxInstanceAccess().getBoxRefAssignment_3()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1706:1: ( rule__BoxInstance__BoxRefAssignment_3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1706:2: rule__BoxInstance__BoxRefAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__BoxRefAssignment_3_in_rule__BoxInstance__Group__3__Impl3322);
            rule__BoxInstance__BoxRefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoxInstanceAccess().getBoxRefAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__3__Impl"


    // $ANTLR start "rule__BoxInstance__Group__4"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1716:1: rule__BoxInstance__Group__4 : rule__BoxInstance__Group__4__Impl rule__BoxInstance__Group__5 ;
    public final void rule__BoxInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1720:1: ( rule__BoxInstance__Group__4__Impl rule__BoxInstance__Group__5 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1721:2: rule__BoxInstance__Group__4__Impl rule__BoxInstance__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__4__Impl_in_rule__BoxInstance__Group__43352);
            rule__BoxInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__5_in_rule__BoxInstance__Group__43355);
            rule__BoxInstance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__4"


    // $ANTLR start "rule__BoxInstance__Group__4__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1728:1: rule__BoxInstance__Group__4__Impl : ( ( rule__BoxInstance__Group_4__0 )? ) ;
    public final void rule__BoxInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1732:1: ( ( ( rule__BoxInstance__Group_4__0 )? ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1733:1: ( ( rule__BoxInstance__Group_4__0 )? )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1733:1: ( ( rule__BoxInstance__Group_4__0 )? )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1734:1: ( rule__BoxInstance__Group_4__0 )?
            {
             before(grammarAccess.getBoxInstanceAccess().getGroup_4()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1735:1: ( rule__BoxInstance__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1735:2: rule__BoxInstance__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_4__0_in_rule__BoxInstance__Group__4__Impl3382);
                    rule__BoxInstance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxInstanceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__4__Impl"


    // $ANTLR start "rule__BoxInstance__Group__5"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1745:1: rule__BoxInstance__Group__5 : rule__BoxInstance__Group__5__Impl rule__BoxInstance__Group__6 ;
    public final void rule__BoxInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1749:1: ( rule__BoxInstance__Group__5__Impl rule__BoxInstance__Group__6 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1750:2: rule__BoxInstance__Group__5__Impl rule__BoxInstance__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__5__Impl_in_rule__BoxInstance__Group__53413);
            rule__BoxInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__6_in_rule__BoxInstance__Group__53416);
            rule__BoxInstance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__5"


    // $ANTLR start "rule__BoxInstance__Group__5__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1757:1: rule__BoxInstance__Group__5__Impl : ( ( rule__BoxInstance__Group_5__0 )? ) ;
    public final void rule__BoxInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1761:1: ( ( ( rule__BoxInstance__Group_5__0 )? ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1762:1: ( ( rule__BoxInstance__Group_5__0 )? )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1762:1: ( ( rule__BoxInstance__Group_5__0 )? )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1763:1: ( rule__BoxInstance__Group_5__0 )?
            {
             before(grammarAccess.getBoxInstanceAccess().getGroup_5()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1764:1: ( rule__BoxInstance__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1764:2: rule__BoxInstance__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5__0_in_rule__BoxInstance__Group__5__Impl3443);
                    rule__BoxInstance__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxInstanceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__5__Impl"


    // $ANTLR start "rule__BoxInstance__Group__6"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1774:1: rule__BoxInstance__Group__6 : rule__BoxInstance__Group__6__Impl ;
    public final void rule__BoxInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1778:1: ( rule__BoxInstance__Group__6__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1779:2: rule__BoxInstance__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__6__Impl_in_rule__BoxInstance__Group__63474);
            rule__BoxInstance__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__6"


    // $ANTLR start "rule__BoxInstance__Group__6__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1785:1: rule__BoxInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__BoxInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1789:1: ( ( '}' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1790:1: ( '}' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1790:1: ( '}' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1791:1: '}'
            {
             before(grammarAccess.getBoxInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BoxInstance__Group__6__Impl3502); 
             after(grammarAccess.getBoxInstanceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group__6__Impl"


    // $ANTLR start "rule__BoxInstance__Group_4__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1818:1: rule__BoxInstance__Group_4__0 : rule__BoxInstance__Group_4__0__Impl rule__BoxInstance__Group_4__1 ;
    public final void rule__BoxInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1822:1: ( rule__BoxInstance__Group_4__0__Impl rule__BoxInstance__Group_4__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1823:2: rule__BoxInstance__Group_4__0__Impl rule__BoxInstance__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_4__0__Impl_in_rule__BoxInstance__Group_4__03547);
            rule__BoxInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_4__1_in_rule__BoxInstance__Group_4__03550);
            rule__BoxInstance__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_4__0"


    // $ANTLR start "rule__BoxInstance__Group_4__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1830:1: rule__BoxInstance__Group_4__0__Impl : ( 'instanceName' ) ;
    public final void rule__BoxInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1834:1: ( ( 'instanceName' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1835:1: ( 'instanceName' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1835:1: ( 'instanceName' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1836:1: 'instanceName'
            {
             before(grammarAccess.getBoxInstanceAccess().getInstanceNameKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__BoxInstance__Group_4__0__Impl3578); 
             after(grammarAccess.getBoxInstanceAccess().getInstanceNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_4__0__Impl"


    // $ANTLR start "rule__BoxInstance__Group_4__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1849:1: rule__BoxInstance__Group_4__1 : rule__BoxInstance__Group_4__1__Impl ;
    public final void rule__BoxInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1853:1: ( rule__BoxInstance__Group_4__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1854:2: rule__BoxInstance__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_4__1__Impl_in_rule__BoxInstance__Group_4__13609);
            rule__BoxInstance__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_4__1"


    // $ANTLR start "rule__BoxInstance__Group_4__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1860:1: rule__BoxInstance__Group_4__1__Impl : ( ( rule__BoxInstance__InstanceNameAssignment_4_1 ) ) ;
    public final void rule__BoxInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1864:1: ( ( ( rule__BoxInstance__InstanceNameAssignment_4_1 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1865:1: ( ( rule__BoxInstance__InstanceNameAssignment_4_1 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1865:1: ( ( rule__BoxInstance__InstanceNameAssignment_4_1 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1866:1: ( rule__BoxInstance__InstanceNameAssignment_4_1 )
            {
             before(grammarAccess.getBoxInstanceAccess().getInstanceNameAssignment_4_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1867:1: ( rule__BoxInstance__InstanceNameAssignment_4_1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1867:2: rule__BoxInstance__InstanceNameAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__InstanceNameAssignment_4_1_in_rule__BoxInstance__Group_4__1__Impl3636);
            rule__BoxInstance__InstanceNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxInstanceAccess().getInstanceNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_4__1__Impl"


    // $ANTLR start "rule__BoxInstance__Group_5__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1881:1: rule__BoxInstance__Group_5__0 : rule__BoxInstance__Group_5__0__Impl rule__BoxInstance__Group_5__1 ;
    public final void rule__BoxInstance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1885:1: ( rule__BoxInstance__Group_5__0__Impl rule__BoxInstance__Group_5__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1886:2: rule__BoxInstance__Group_5__0__Impl rule__BoxInstance__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5__0__Impl_in_rule__BoxInstance__Group_5__03670);
            rule__BoxInstance__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5__1_in_rule__BoxInstance__Group_5__03673);
            rule__BoxInstance__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5__0"


    // $ANTLR start "rule__BoxInstance__Group_5__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1893:1: rule__BoxInstance__Group_5__0__Impl : ( 'connections' ) ;
    public final void rule__BoxInstance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1897:1: ( ( 'connections' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1898:1: ( 'connections' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1898:1: ( 'connections' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1899:1: 'connections'
            {
             before(grammarAccess.getBoxInstanceAccess().getConnectionsKeyword_5_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__BoxInstance__Group_5__0__Impl3701); 
             after(grammarAccess.getBoxInstanceAccess().getConnectionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5__0__Impl"


    // $ANTLR start "rule__BoxInstance__Group_5__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1912:1: rule__BoxInstance__Group_5__1 : rule__BoxInstance__Group_5__1__Impl rule__BoxInstance__Group_5__2 ;
    public final void rule__BoxInstance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1916:1: ( rule__BoxInstance__Group_5__1__Impl rule__BoxInstance__Group_5__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1917:2: rule__BoxInstance__Group_5__1__Impl rule__BoxInstance__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5__1__Impl_in_rule__BoxInstance__Group_5__13732);
            rule__BoxInstance__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5__2_in_rule__BoxInstance__Group_5__13735);
            rule__BoxInstance__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5__1"


    // $ANTLR start "rule__BoxInstance__Group_5__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1924:1: rule__BoxInstance__Group_5__1__Impl : ( '{' ) ;
    public final void rule__BoxInstance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1928:1: ( ( '{' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1929:1: ( '{' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1929:1: ( '{' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1930:1: '{'
            {
             before(grammarAccess.getBoxInstanceAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BoxInstance__Group_5__1__Impl3763); 
             after(grammarAccess.getBoxInstanceAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5__1__Impl"


    // $ANTLR start "rule__BoxInstance__Group_5__2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1943:1: rule__BoxInstance__Group_5__2 : rule__BoxInstance__Group_5__2__Impl rule__BoxInstance__Group_5__3 ;
    public final void rule__BoxInstance__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1947:1: ( rule__BoxInstance__Group_5__2__Impl rule__BoxInstance__Group_5__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1948:2: rule__BoxInstance__Group_5__2__Impl rule__BoxInstance__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5__2__Impl_in_rule__BoxInstance__Group_5__23794);
            rule__BoxInstance__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5__3_in_rule__BoxInstance__Group_5__23797);
            rule__BoxInstance__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5__2"


    // $ANTLR start "rule__BoxInstance__Group_5__2__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1955:1: rule__BoxInstance__Group_5__2__Impl : ( ( rule__BoxInstance__ConnectionsAssignment_5_2 ) ) ;
    public final void rule__BoxInstance__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1959:1: ( ( ( rule__BoxInstance__ConnectionsAssignment_5_2 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1960:1: ( ( rule__BoxInstance__ConnectionsAssignment_5_2 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1960:1: ( ( rule__BoxInstance__ConnectionsAssignment_5_2 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1961:1: ( rule__BoxInstance__ConnectionsAssignment_5_2 )
            {
             before(grammarAccess.getBoxInstanceAccess().getConnectionsAssignment_5_2()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1962:1: ( rule__BoxInstance__ConnectionsAssignment_5_2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1962:2: rule__BoxInstance__ConnectionsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__ConnectionsAssignment_5_2_in_rule__BoxInstance__Group_5__2__Impl3824);
            rule__BoxInstance__ConnectionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxInstanceAccess().getConnectionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5__2__Impl"


    // $ANTLR start "rule__BoxInstance__Group_5__3"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1972:1: rule__BoxInstance__Group_5__3 : rule__BoxInstance__Group_5__3__Impl rule__BoxInstance__Group_5__4 ;
    public final void rule__BoxInstance__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1976:1: ( rule__BoxInstance__Group_5__3__Impl rule__BoxInstance__Group_5__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1977:2: rule__BoxInstance__Group_5__3__Impl rule__BoxInstance__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5__3__Impl_in_rule__BoxInstance__Group_5__33854);
            rule__BoxInstance__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5__4_in_rule__BoxInstance__Group_5__33857);
            rule__BoxInstance__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5__3"


    // $ANTLR start "rule__BoxInstance__Group_5__3__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1984:1: rule__BoxInstance__Group_5__3__Impl : ( ( rule__BoxInstance__Group_5_3__0 )* ) ;
    public final void rule__BoxInstance__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1988:1: ( ( ( rule__BoxInstance__Group_5_3__0 )* ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1989:1: ( ( rule__BoxInstance__Group_5_3__0 )* )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1989:1: ( ( rule__BoxInstance__Group_5_3__0 )* )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1990:1: ( rule__BoxInstance__Group_5_3__0 )*
            {
             before(grammarAccess.getBoxInstanceAccess().getGroup_5_3()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1991:1: ( rule__BoxInstance__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1991:2: rule__BoxInstance__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5_3__0_in_rule__BoxInstance__Group_5__3__Impl3884);
            	    rule__BoxInstance__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBoxInstanceAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5__3__Impl"


    // $ANTLR start "rule__BoxInstance__Group_5__4"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2001:1: rule__BoxInstance__Group_5__4 : rule__BoxInstance__Group_5__4__Impl ;
    public final void rule__BoxInstance__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2005:1: ( rule__BoxInstance__Group_5__4__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2006:2: rule__BoxInstance__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5__4__Impl_in_rule__BoxInstance__Group_5__43915);
            rule__BoxInstance__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5__4"


    // $ANTLR start "rule__BoxInstance__Group_5__4__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2012:1: rule__BoxInstance__Group_5__4__Impl : ( '}' ) ;
    public final void rule__BoxInstance__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2016:1: ( ( '}' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2017:1: ( '}' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2017:1: ( '}' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2018:1: '}'
            {
             before(grammarAccess.getBoxInstanceAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BoxInstance__Group_5__4__Impl3943); 
             after(grammarAccess.getBoxInstanceAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5__4__Impl"


    // $ANTLR start "rule__BoxInstance__Group_5_3__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2041:1: rule__BoxInstance__Group_5_3__0 : rule__BoxInstance__Group_5_3__0__Impl rule__BoxInstance__Group_5_3__1 ;
    public final void rule__BoxInstance__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2045:1: ( rule__BoxInstance__Group_5_3__0__Impl rule__BoxInstance__Group_5_3__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2046:2: rule__BoxInstance__Group_5_3__0__Impl rule__BoxInstance__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5_3__0__Impl_in_rule__BoxInstance__Group_5_3__03984);
            rule__BoxInstance__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5_3__1_in_rule__BoxInstance__Group_5_3__03987);
            rule__BoxInstance__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5_3__0"


    // $ANTLR start "rule__BoxInstance__Group_5_3__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2053:1: rule__BoxInstance__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BoxInstance__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2057:1: ( ( ',' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2058:1: ( ',' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2058:1: ( ',' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2059:1: ','
            {
             before(grammarAccess.getBoxInstanceAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__BoxInstance__Group_5_3__0__Impl4015); 
             after(grammarAccess.getBoxInstanceAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5_3__0__Impl"


    // $ANTLR start "rule__BoxInstance__Group_5_3__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2072:1: rule__BoxInstance__Group_5_3__1 : rule__BoxInstance__Group_5_3__1__Impl ;
    public final void rule__BoxInstance__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2076:1: ( rule__BoxInstance__Group_5_3__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2077:2: rule__BoxInstance__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_5_3__1__Impl_in_rule__BoxInstance__Group_5_3__14046);
            rule__BoxInstance__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5_3__1"


    // $ANTLR start "rule__BoxInstance__Group_5_3__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2083:1: rule__BoxInstance__Group_5_3__1__Impl : ( ( rule__BoxInstance__ConnectionsAssignment_5_3_1 ) ) ;
    public final void rule__BoxInstance__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2087:1: ( ( ( rule__BoxInstance__ConnectionsAssignment_5_3_1 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2088:1: ( ( rule__BoxInstance__ConnectionsAssignment_5_3_1 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2088:1: ( ( rule__BoxInstance__ConnectionsAssignment_5_3_1 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2089:1: ( rule__BoxInstance__ConnectionsAssignment_5_3_1 )
            {
             before(grammarAccess.getBoxInstanceAccess().getConnectionsAssignment_5_3_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2090:1: ( rule__BoxInstance__ConnectionsAssignment_5_3_1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2090:2: rule__BoxInstance__ConnectionsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__ConnectionsAssignment_5_3_1_in_rule__BoxInstance__Group_5_3__1__Impl4073);
            rule__BoxInstance__ConnectionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxInstanceAccess().getConnectionsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__Group_5_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2104:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2108:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2109:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04107);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04110);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2116:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2120:1: ( ( RULE_ID ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2121:1: ( RULE_ID )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2121:1: ( RULE_ID )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2122:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4137); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2133:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2137:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2138:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14166);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2144:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2148:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2149:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2149:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2150:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2151:1: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2151:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4193);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2165:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2169:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2170:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04228);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04231);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2177:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2181:1: ( ( '.' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2182:1: ( '.' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2182:1: ( '.' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2183:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__QualifiedName__Group_1__0__Impl4259); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2196:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2200:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2201:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14290);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2207:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2211:1: ( ( RULE_ID ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2212:1: ( RULE_ID )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2212:1: ( RULE_ID )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2213:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4317); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Box__NameAssignment_2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2229:1: rule__Box__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Box__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2233:1: ( ( ruleEString ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2234:1: ( ruleEString )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2234:1: ( ruleEString )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2235:1: ruleEString
            {
             before(grammarAccess.getBoxAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Box__NameAssignment_24355);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__NameAssignment_2"


    // $ANTLR start "rule__Box__PortsAssignment_4_2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2244:1: rule__Box__PortsAssignment_4_2 : ( rulePort ) ;
    public final void rule__Box__PortsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2248:1: ( ( rulePort ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2249:1: ( rulePort )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2249:1: ( rulePort )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2250:1: rulePort
            {
             before(grammarAccess.getBoxAccess().getPortsPortParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePort_in_rule__Box__PortsAssignment_4_24386);
            rulePort();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getPortsPortParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__PortsAssignment_4_2"


    // $ANTLR start "rule__Box__PortsAssignment_4_3_1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2259:1: rule__Box__PortsAssignment_4_3_1 : ( rulePort ) ;
    public final void rule__Box__PortsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2263:1: ( ( rulePort ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2264:1: ( rulePort )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2264:1: ( rulePort )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2265:1: rulePort
            {
             before(grammarAccess.getBoxAccess().getPortsPortParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePort_in_rule__Box__PortsAssignment_4_3_14417);
            rulePort();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getPortsPortParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__PortsAssignment_4_3_1"


    // $ANTLR start "rule__Box__BoxInstancesAssignment_5_2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2274:1: rule__Box__BoxInstancesAssignment_5_2 : ( ruleBoxInstance ) ;
    public final void rule__Box__BoxInstancesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2278:1: ( ( ruleBoxInstance ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2279:1: ( ruleBoxInstance )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2279:1: ( ruleBoxInstance )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2280:1: ruleBoxInstance
            {
             before(grammarAccess.getBoxAccess().getBoxInstancesBoxInstanceParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoxInstance_in_rule__Box__BoxInstancesAssignment_5_24448);
            ruleBoxInstance();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getBoxInstancesBoxInstanceParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__BoxInstancesAssignment_5_2"


    // $ANTLR start "rule__Box__BoxInstancesAssignment_5_3_1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2289:1: rule__Box__BoxInstancesAssignment_5_3_1 : ( ruleBoxInstance ) ;
    public final void rule__Box__BoxInstancesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2293:1: ( ( ruleBoxInstance ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2294:1: ( ruleBoxInstance )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2294:1: ( ruleBoxInstance )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2295:1: ruleBoxInstance
            {
             before(grammarAccess.getBoxAccess().getBoxInstancesBoxInstanceParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoxInstance_in_rule__Box__BoxInstancesAssignment_5_3_14479);
            ruleBoxInstance();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getBoxInstancesBoxInstanceParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__BoxInstancesAssignment_5_3_1"


    // $ANTLR start "rule__Port__NameAssignment_2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2304:1: rule__Port__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Port__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2308:1: ( ( ruleEString ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2309:1: ( ruleEString )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2309:1: ( ruleEString )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2310:1: ruleEString
            {
             before(grammarAccess.getPortAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Port__NameAssignment_24510);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPortAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NameAssignment_2"


    // $ANTLR start "rule__Connection__IntPortsAssignment_4"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2319:1: rule__Connection__IntPortsAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connection__IntPortsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2323:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2324:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2324:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2325:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectionAccess().getIntPortsPortCrossReference_4_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2326:1: ( ruleQualifiedName )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2327:1: ruleQualifiedName
            {
             before(grammarAccess.getConnectionAccess().getIntPortsPortQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Connection__IntPortsAssignment_44545);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getIntPortsPortQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getIntPortsPortCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__IntPortsAssignment_4"


    // $ANTLR start "rule__Connection__IntPortsAssignment_5_1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2338:1: rule__Connection__IntPortsAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connection__IntPortsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2342:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2343:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2343:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2344:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectionAccess().getIntPortsPortCrossReference_5_1_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2345:1: ( ruleQualifiedName )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2346:1: ruleQualifiedName
            {
             before(grammarAccess.getConnectionAccess().getIntPortsPortQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Connection__IntPortsAssignment_5_14584);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getIntPortsPortQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getIntPortsPortCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__IntPortsAssignment_5_1"


    // $ANTLR start "rule__Connection__ExtPortsAssignment_7_2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2357:1: rule__Connection__ExtPortsAssignment_7_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connection__ExtPortsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2361:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2362:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2362:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2363:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectionAccess().getExtPortsPortCrossReference_7_2_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2364:1: ( ruleQualifiedName )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2365:1: ruleQualifiedName
            {
             before(grammarAccess.getConnectionAccess().getExtPortsPortQualifiedNameParserRuleCall_7_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Connection__ExtPortsAssignment_7_24623);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getExtPortsPortQualifiedNameParserRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getExtPortsPortCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__ExtPortsAssignment_7_2"


    // $ANTLR start "rule__Connection__ExtPortsAssignment_7_3_1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2376:1: rule__Connection__ExtPortsAssignment_7_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connection__ExtPortsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2380:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2381:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2381:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2382:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectionAccess().getExtPortsPortCrossReference_7_3_1_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2383:1: ( ruleQualifiedName )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2384:1: ruleQualifiedName
            {
             before(grammarAccess.getConnectionAccess().getExtPortsPortQualifiedNameParserRuleCall_7_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Connection__ExtPortsAssignment_7_3_14662);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getExtPortsPortQualifiedNameParserRuleCall_7_3_1_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getExtPortsPortCrossReference_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__ExtPortsAssignment_7_3_1"


    // $ANTLR start "rule__BoxInstance__BoxRefAssignment_3"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2395:1: rule__BoxInstance__BoxRefAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BoxInstance__BoxRefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2399:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2400:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2400:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2401:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getBoxInstanceAccess().getBoxRefBoxCrossReference_3_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2402:1: ( ruleQualifiedName )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2403:1: ruleQualifiedName
            {
             before(grammarAccess.getBoxInstanceAccess().getBoxRefBoxQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__BoxInstance__BoxRefAssignment_34701);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBoxInstanceAccess().getBoxRefBoxQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBoxInstanceAccess().getBoxRefBoxCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__BoxRefAssignment_3"


    // $ANTLR start "rule__BoxInstance__InstanceNameAssignment_4_1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2414:1: rule__BoxInstance__InstanceNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BoxInstance__InstanceNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2418:1: ( ( ruleEString ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2419:1: ( ruleEString )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2419:1: ( ruleEString )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2420:1: ruleEString
            {
             before(grammarAccess.getBoxInstanceAccess().getInstanceNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BoxInstance__InstanceNameAssignment_4_14736);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBoxInstanceAccess().getInstanceNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__InstanceNameAssignment_4_1"


    // $ANTLR start "rule__BoxInstance__ConnectionsAssignment_5_2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2429:1: rule__BoxInstance__ConnectionsAssignment_5_2 : ( ruleConnection ) ;
    public final void rule__BoxInstance__ConnectionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2433:1: ( ( ruleConnection ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2434:1: ( ruleConnection )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2434:1: ( ruleConnection )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2435:1: ruleConnection
            {
             before(grammarAccess.getBoxInstanceAccess().getConnectionsConnectionParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_rule__BoxInstance__ConnectionsAssignment_5_24767);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getBoxInstanceAccess().getConnectionsConnectionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__ConnectionsAssignment_5_2"


    // $ANTLR start "rule__BoxInstance__ConnectionsAssignment_5_3_1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2444:1: rule__BoxInstance__ConnectionsAssignment_5_3_1 : ( ruleConnection ) ;
    public final void rule__BoxInstance__ConnectionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2448:1: ( ( ruleConnection ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2449:1: ( ruleConnection )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2449:1: ( ruleConnection )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2450:1: ruleConnection
            {
             before(grammarAccess.getBoxInstanceAccess().getConnectionsConnectionParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_rule__BoxInstance__ConnectionsAssignment_5_3_14798);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getBoxInstanceAccess().getConnectionsConnectionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoxInstance__ConnectionsAssignment_5_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleBox_in_entryRuleBox61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBox68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group__0_in_ruleBox94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePort_in_entryRulePort181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePort188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnection248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__0_in_ruleConnection274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoxInstance_in_entryRuleBoxInstance301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoxInstance308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__0_in_ruleBoxInstance334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group__0__Impl_in_rule__Box__Group__0477 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Box__Group__1_in_rule__Box__Group__0480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group__1__Impl_in_rule__Box__Group__1538 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Box__Group__2_in_rule__Box__Group__1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Box__Group__1__Impl569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group__2__Impl_in_rule__Box__Group__2600 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Box__Group__3_in_rule__Box__Group__2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__NameAssignment_2_in_rule__Box__Group__2__Impl630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group__3__Impl_in_rule__Box__Group__3660 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__Box__Group__4_in_rule__Box__Group__3663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Box__Group__3__Impl691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group__4__Impl_in_rule__Box__Group__4722 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__Box__Group__5_in_rule__Box__Group__4725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4__0_in_rule__Box__Group__4__Impl752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group__5__Impl_in_rule__Box__Group__5783 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__Box__Group__6_in_rule__Box__Group__5786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5__0_in_rule__Box__Group__5__Impl813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group__6__Impl_in_rule__Box__Group__6844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Box__Group__6__Impl872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4__0__Impl_in_rule__Box__Group_4__0917 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Box__Group_4__1_in_rule__Box__Group_4__0920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Box__Group_4__0__Impl948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4__1__Impl_in_rule__Box__Group_4__1979 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Box__Group_4__2_in_rule__Box__Group_4__1982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Box__Group_4__1__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4__2__Impl_in_rule__Box__Group_4__21041 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Box__Group_4__3_in_rule__Box__Group_4__21044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__PortsAssignment_4_2_in_rule__Box__Group_4__2__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4__3__Impl_in_rule__Box__Group_4__31101 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Box__Group_4__4_in_rule__Box__Group_4__31104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4_3__0_in_rule__Box__Group_4__3__Impl1131 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Box__Group_4__4__Impl_in_rule__Box__Group_4__41162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Box__Group_4__4__Impl1190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4_3__0__Impl_in_rule__Box__Group_4_3__01231 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Box__Group_4_3__1_in_rule__Box__Group_4_3__01234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Box__Group_4_3__0__Impl1262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4_3__1__Impl_in_rule__Box__Group_4_3__11293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__PortsAssignment_4_3_1_in_rule__Box__Group_4_3__1__Impl1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5__0__Impl_in_rule__Box__Group_5__01354 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Box__Group_5__1_in_rule__Box__Group_5__01357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Box__Group_5__0__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5__1__Impl_in_rule__Box__Group_5__11416 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Box__Group_5__2_in_rule__Box__Group_5__11419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Box__Group_5__1__Impl1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5__2__Impl_in_rule__Box__Group_5__21478 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Box__Group_5__3_in_rule__Box__Group_5__21481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__BoxInstancesAssignment_5_2_in_rule__Box__Group_5__2__Impl1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5__3__Impl_in_rule__Box__Group_5__31538 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Box__Group_5__4_in_rule__Box__Group_5__31541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5_3__0_in_rule__Box__Group_5__3__Impl1568 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Box__Group_5__4__Impl_in_rule__Box__Group_5__41599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Box__Group_5__4__Impl1627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5_3__0__Impl_in_rule__Box__Group_5_3__01668 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Box__Group_5_3__1_in_rule__Box__Group_5_3__01671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Box__Group_5_3__0__Impl1699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5_3__1__Impl_in_rule__Box__Group_5_3__11730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__BoxInstancesAssignment_5_3_1_in_rule__Box__Group_5_3__1__Impl1757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__01791 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__01794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__11852 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Port__Group__2_in_rule__Port__Group__11855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Port__Group__1__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__21914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Port__NameAssignment_2_in_rule__Port__Group__2__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__01977 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__01980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Connection__Group__0__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__12039 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__12042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Connection__Group__1__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__22101 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__22104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Connection__Group__2__Impl2132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__32163 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__32166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Connection__Group__3__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__42225 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_rule__Connection__Group__5_in_rule__Connection__Group__42228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__IntPortsAssignment_4_in_rule__Connection__Group__4__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__5__Impl_in_rule__Connection__Group__52285 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_rule__Connection__Group__6_in_rule__Connection__Group__52288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_5__0_in_rule__Connection__Group__5__Impl2315 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Connection__Group__6__Impl_in_rule__Connection__Group__62346 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_rule__Connection__Group__7_in_rule__Connection__Group__62349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Connection__Group__6__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__7__Impl_in_rule__Connection__Group__72408 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_rule__Connection__Group__8_in_rule__Connection__Group__72411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__0_in_rule__Connection__Group__7__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__8__Impl_in_rule__Connection__Group__82469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Connection__Group__8__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_5__0__Impl_in_rule__Connection__Group_5__02546 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Connection__Group_5__1_in_rule__Connection__Group_5__02549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Connection__Group_5__0__Impl2577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_5__1__Impl_in_rule__Connection__Group_5__12608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__IntPortsAssignment_5_1_in_rule__Connection__Group_5__1__Impl2635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__0__Impl_in_rule__Connection__Group_7__02669 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__1_in_rule__Connection__Group_7__02672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Connection__Group_7__0__Impl2700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__1__Impl_in_rule__Connection__Group_7__12731 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__2_in_rule__Connection__Group_7__12734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Connection__Group_7__1__Impl2762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__2__Impl_in_rule__Connection__Group_7__22793 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__3_in_rule__Connection__Group_7__22796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__ExtPortsAssignment_7_2_in_rule__Connection__Group_7__2__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__3__Impl_in_rule__Connection__Group_7__32853 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__4_in_rule__Connection__Group_7__32856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7_3__0_in_rule__Connection__Group_7__3__Impl2883 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__4__Impl_in_rule__Connection__Group_7__42914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Connection__Group_7__4__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7_3__0__Impl_in_rule__Connection__Group_7_3__02983 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Connection__Group_7_3__1_in_rule__Connection__Group_7_3__02986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Connection__Group_7_3__0__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7_3__1__Impl_in_rule__Connection__Group_7_3__13045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__ExtPortsAssignment_7_3_1_in_rule__Connection__Group_7_3__1__Impl3072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__0__Impl_in_rule__BoxInstance__Group__03106 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__1_in_rule__BoxInstance__Group__03109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__BoxInstance__Group__0__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__1__Impl_in_rule__BoxInstance__Group__13168 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__2_in_rule__BoxInstance__Group__13171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BoxInstance__Group__1__Impl3199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__2__Impl_in_rule__BoxInstance__Group__23230 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__3_in_rule__BoxInstance__Group__23233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__BoxInstance__Group__2__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__3__Impl_in_rule__BoxInstance__Group__33292 = new BitSet(new long[]{0x0000000006002000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__4_in_rule__BoxInstance__Group__33295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__BoxRefAssignment_3_in_rule__BoxInstance__Group__3__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__4__Impl_in_rule__BoxInstance__Group__43352 = new BitSet(new long[]{0x0000000006002000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__5_in_rule__BoxInstance__Group__43355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_4__0_in_rule__BoxInstance__Group__4__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__5__Impl_in_rule__BoxInstance__Group__53413 = new BitSet(new long[]{0x0000000006002000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__6_in_rule__BoxInstance__Group__53416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5__0_in_rule__BoxInstance__Group__5__Impl3443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__6__Impl_in_rule__BoxInstance__Group__63474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BoxInstance__Group__6__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_4__0__Impl_in_rule__BoxInstance__Group_4__03547 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_4__1_in_rule__BoxInstance__Group_4__03550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__BoxInstance__Group_4__0__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_4__1__Impl_in_rule__BoxInstance__Group_4__13609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__InstanceNameAssignment_4_1_in_rule__BoxInstance__Group_4__1__Impl3636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5__0__Impl_in_rule__BoxInstance__Group_5__03670 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5__1_in_rule__BoxInstance__Group_5__03673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__BoxInstance__Group_5__0__Impl3701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5__1__Impl_in_rule__BoxInstance__Group_5__13732 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5__2_in_rule__BoxInstance__Group_5__13735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BoxInstance__Group_5__1__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5__2__Impl_in_rule__BoxInstance__Group_5__23794 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5__3_in_rule__BoxInstance__Group_5__23797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__ConnectionsAssignment_5_2_in_rule__BoxInstance__Group_5__2__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5__3__Impl_in_rule__BoxInstance__Group_5__33854 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5__4_in_rule__BoxInstance__Group_5__33857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5_3__0_in_rule__BoxInstance__Group_5__3__Impl3884 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5__4__Impl_in_rule__BoxInstance__Group_5__43915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BoxInstance__Group_5__4__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5_3__0__Impl_in_rule__BoxInstance__Group_5_3__03984 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5_3__1_in_rule__BoxInstance__Group_5_3__03987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BoxInstance__Group_5_3__0__Impl4015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_5_3__1__Impl_in_rule__BoxInstance__Group_5_3__14046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__ConnectionsAssignment_5_3_1_in_rule__BoxInstance__Group_5_3__1__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04107 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4193 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04228 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__QualifiedName__Group_1__0__Impl4259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Box__NameAssignment_24355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePort_in_rule__Box__PortsAssignment_4_24386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePort_in_rule__Box__PortsAssignment_4_3_14417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoxInstance_in_rule__Box__BoxInstancesAssignment_5_24448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoxInstance_in_rule__Box__BoxInstancesAssignment_5_3_14479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Port__NameAssignment_24510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Connection__IntPortsAssignment_44545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Connection__IntPortsAssignment_5_14584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Connection__ExtPortsAssignment_7_24623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Connection__ExtPortsAssignment_7_3_14662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__BoxInstance__BoxRefAssignment_34701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BoxInstance__InstanceNameAssignment_4_14736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_rule__BoxInstance__ConnectionsAssignment_5_24767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_rule__BoxInstance__ConnectionsAssignment_5_3_14798 = new BitSet(new long[]{0x0000000000000002L});
    }


}