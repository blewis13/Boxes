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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Box'", "'{'", "'}'", "'ports'", "','", "'boxInstances'", "'connections'", "'Port'", "'Connection'", "'intPorts'", "'('", "')'", "'extPorts'", "'BoxInstance'", "'boxRef'", "'instanceName'", "'.'"
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:432:1: rule__Box__Group__6 : rule__Box__Group__6__Impl rule__Box__Group__7 ;
    public final void rule__Box__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:436:1: ( rule__Box__Group__6__Impl rule__Box__Group__7 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:437:2: rule__Box__Group__6__Impl rule__Box__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__6__Impl_in_rule__Box__Group__6844);
            rule__Box__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__7_in_rule__Box__Group__6847);
            rule__Box__Group__7();

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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:444:1: rule__Box__Group__6__Impl : ( ( rule__Box__Group_6__0 )? ) ;
    public final void rule__Box__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:448:1: ( ( ( rule__Box__Group_6__0 )? ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:449:1: ( ( rule__Box__Group_6__0 )? )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:449:1: ( ( rule__Box__Group_6__0 )? )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:450:1: ( rule__Box__Group_6__0 )?
            {
             before(grammarAccess.getBoxAccess().getGroup_6()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:451:1: ( rule__Box__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:451:2: rule__Box__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6__0_in_rule__Box__Group__6__Impl874);
                    rule__Box__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getGroup_6()); 

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


    // $ANTLR start "rule__Box__Group__7"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:461:1: rule__Box__Group__7 : rule__Box__Group__7__Impl ;
    public final void rule__Box__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:465:1: ( rule__Box__Group__7__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:466:2: rule__Box__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group__7__Impl_in_rule__Box__Group__7905);
            rule__Box__Group__7__Impl();

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
    // $ANTLR end "rule__Box__Group__7"


    // $ANTLR start "rule__Box__Group__7__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:472:1: rule__Box__Group__7__Impl : ( '}' ) ;
    public final void rule__Box__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:476:1: ( ( '}' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:477:1: ( '}' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:477:1: ( '}' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:478:1: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Box__Group__7__Impl933); 
             after(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Box__Group__7__Impl"


    // $ANTLR start "rule__Box__Group_4__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:507:1: rule__Box__Group_4__0 : rule__Box__Group_4__0__Impl rule__Box__Group_4__1 ;
    public final void rule__Box__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:511:1: ( rule__Box__Group_4__0__Impl rule__Box__Group_4__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:512:2: rule__Box__Group_4__0__Impl rule__Box__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__0__Impl_in_rule__Box__Group_4__0980);
            rule__Box__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__1_in_rule__Box__Group_4__0983);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:519:1: rule__Box__Group_4__0__Impl : ( 'ports' ) ;
    public final void rule__Box__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:523:1: ( ( 'ports' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:524:1: ( 'ports' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:524:1: ( 'ports' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:525:1: 'ports'
            {
             before(grammarAccess.getBoxAccess().getPortsKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Box__Group_4__0__Impl1011); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:538:1: rule__Box__Group_4__1 : rule__Box__Group_4__1__Impl rule__Box__Group_4__2 ;
    public final void rule__Box__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:542:1: ( rule__Box__Group_4__1__Impl rule__Box__Group_4__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:543:2: rule__Box__Group_4__1__Impl rule__Box__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__1__Impl_in_rule__Box__Group_4__11042);
            rule__Box__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__2_in_rule__Box__Group_4__11045);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:550:1: rule__Box__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Box__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:554:1: ( ( '{' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:555:1: ( '{' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:555:1: ( '{' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:556:1: '{'
            {
             before(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Box__Group_4__1__Impl1073); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:569:1: rule__Box__Group_4__2 : rule__Box__Group_4__2__Impl rule__Box__Group_4__3 ;
    public final void rule__Box__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:573:1: ( rule__Box__Group_4__2__Impl rule__Box__Group_4__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:574:2: rule__Box__Group_4__2__Impl rule__Box__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__2__Impl_in_rule__Box__Group_4__21104);
            rule__Box__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__3_in_rule__Box__Group_4__21107);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:581:1: rule__Box__Group_4__2__Impl : ( ( rule__Box__PortsAssignment_4_2 ) ) ;
    public final void rule__Box__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:585:1: ( ( ( rule__Box__PortsAssignment_4_2 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:586:1: ( ( rule__Box__PortsAssignment_4_2 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:586:1: ( ( rule__Box__PortsAssignment_4_2 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:587:1: ( rule__Box__PortsAssignment_4_2 )
            {
             before(grammarAccess.getBoxAccess().getPortsAssignment_4_2()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:588:1: ( rule__Box__PortsAssignment_4_2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:588:2: rule__Box__PortsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__PortsAssignment_4_2_in_rule__Box__Group_4__2__Impl1134);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:598:1: rule__Box__Group_4__3 : rule__Box__Group_4__3__Impl rule__Box__Group_4__4 ;
    public final void rule__Box__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:602:1: ( rule__Box__Group_4__3__Impl rule__Box__Group_4__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:603:2: rule__Box__Group_4__3__Impl rule__Box__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__3__Impl_in_rule__Box__Group_4__31164);
            rule__Box__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__4_in_rule__Box__Group_4__31167);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:610:1: rule__Box__Group_4__3__Impl : ( ( rule__Box__Group_4_3__0 )* ) ;
    public final void rule__Box__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:614:1: ( ( ( rule__Box__Group_4_3__0 )* ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:615:1: ( ( rule__Box__Group_4_3__0 )* )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:615:1: ( ( rule__Box__Group_4_3__0 )* )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:616:1: ( rule__Box__Group_4_3__0 )*
            {
             before(grammarAccess.getBoxAccess().getGroup_4_3()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:617:1: ( rule__Box__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:617:2: rule__Box__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4_3__0_in_rule__Box__Group_4__3__Impl1194);
            	    rule__Box__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:627:1: rule__Box__Group_4__4 : rule__Box__Group_4__4__Impl ;
    public final void rule__Box__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:631:1: ( rule__Box__Group_4__4__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:632:2: rule__Box__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4__4__Impl_in_rule__Box__Group_4__41225);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:638:1: rule__Box__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Box__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:642:1: ( ( '}' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:643:1: ( '}' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:643:1: ( '}' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:644:1: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Box__Group_4__4__Impl1253); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:667:1: rule__Box__Group_4_3__0 : rule__Box__Group_4_3__0__Impl rule__Box__Group_4_3__1 ;
    public final void rule__Box__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:671:1: ( rule__Box__Group_4_3__0__Impl rule__Box__Group_4_3__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:672:2: rule__Box__Group_4_3__0__Impl rule__Box__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4_3__0__Impl_in_rule__Box__Group_4_3__01294);
            rule__Box__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4_3__1_in_rule__Box__Group_4_3__01297);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:679:1: rule__Box__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Box__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:683:1: ( ( ',' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:684:1: ( ',' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:684:1: ( ',' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:685:1: ','
            {
             before(grammarAccess.getBoxAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Box__Group_4_3__0__Impl1325); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:698:1: rule__Box__Group_4_3__1 : rule__Box__Group_4_3__1__Impl ;
    public final void rule__Box__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:702:1: ( rule__Box__Group_4_3__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:703:2: rule__Box__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_4_3__1__Impl_in_rule__Box__Group_4_3__11356);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:709:1: rule__Box__Group_4_3__1__Impl : ( ( rule__Box__PortsAssignment_4_3_1 ) ) ;
    public final void rule__Box__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:713:1: ( ( ( rule__Box__PortsAssignment_4_3_1 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:714:1: ( ( rule__Box__PortsAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:714:1: ( ( rule__Box__PortsAssignment_4_3_1 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:715:1: ( rule__Box__PortsAssignment_4_3_1 )
            {
             before(grammarAccess.getBoxAccess().getPortsAssignment_4_3_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:716:1: ( rule__Box__PortsAssignment_4_3_1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:716:2: rule__Box__PortsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__PortsAssignment_4_3_1_in_rule__Box__Group_4_3__1__Impl1383);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:730:1: rule__Box__Group_5__0 : rule__Box__Group_5__0__Impl rule__Box__Group_5__1 ;
    public final void rule__Box__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:734:1: ( rule__Box__Group_5__0__Impl rule__Box__Group_5__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:735:2: rule__Box__Group_5__0__Impl rule__Box__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__0__Impl_in_rule__Box__Group_5__01417);
            rule__Box__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__1_in_rule__Box__Group_5__01420);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:742:1: rule__Box__Group_5__0__Impl : ( 'boxInstances' ) ;
    public final void rule__Box__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:746:1: ( ( 'boxInstances' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:747:1: ( 'boxInstances' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:747:1: ( 'boxInstances' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:748:1: 'boxInstances'
            {
             before(grammarAccess.getBoxAccess().getBoxInstancesKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Box__Group_5__0__Impl1448); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:761:1: rule__Box__Group_5__1 : rule__Box__Group_5__1__Impl rule__Box__Group_5__2 ;
    public final void rule__Box__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:765:1: ( rule__Box__Group_5__1__Impl rule__Box__Group_5__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:766:2: rule__Box__Group_5__1__Impl rule__Box__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__1__Impl_in_rule__Box__Group_5__11479);
            rule__Box__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__2_in_rule__Box__Group_5__11482);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:773:1: rule__Box__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Box__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:777:1: ( ( '{' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:778:1: ( '{' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:778:1: ( '{' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:779:1: '{'
            {
             before(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Box__Group_5__1__Impl1510); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:792:1: rule__Box__Group_5__2 : rule__Box__Group_5__2__Impl rule__Box__Group_5__3 ;
    public final void rule__Box__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:796:1: ( rule__Box__Group_5__2__Impl rule__Box__Group_5__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:797:2: rule__Box__Group_5__2__Impl rule__Box__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__2__Impl_in_rule__Box__Group_5__21541);
            rule__Box__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__3_in_rule__Box__Group_5__21544);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:804:1: rule__Box__Group_5__2__Impl : ( ( rule__Box__BoxInstancesAssignment_5_2 ) ) ;
    public final void rule__Box__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:808:1: ( ( ( rule__Box__BoxInstancesAssignment_5_2 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:809:1: ( ( rule__Box__BoxInstancesAssignment_5_2 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:809:1: ( ( rule__Box__BoxInstancesAssignment_5_2 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:810:1: ( rule__Box__BoxInstancesAssignment_5_2 )
            {
             before(grammarAccess.getBoxAccess().getBoxInstancesAssignment_5_2()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:811:1: ( rule__Box__BoxInstancesAssignment_5_2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:811:2: rule__Box__BoxInstancesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__BoxInstancesAssignment_5_2_in_rule__Box__Group_5__2__Impl1571);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:821:1: rule__Box__Group_5__3 : rule__Box__Group_5__3__Impl rule__Box__Group_5__4 ;
    public final void rule__Box__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:825:1: ( rule__Box__Group_5__3__Impl rule__Box__Group_5__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:826:2: rule__Box__Group_5__3__Impl rule__Box__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__3__Impl_in_rule__Box__Group_5__31601);
            rule__Box__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__4_in_rule__Box__Group_5__31604);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:833:1: rule__Box__Group_5__3__Impl : ( ( rule__Box__Group_5_3__0 )* ) ;
    public final void rule__Box__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:837:1: ( ( ( rule__Box__Group_5_3__0 )* ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:838:1: ( ( rule__Box__Group_5_3__0 )* )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:838:1: ( ( rule__Box__Group_5_3__0 )* )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:839:1: ( rule__Box__Group_5_3__0 )*
            {
             before(grammarAccess.getBoxAccess().getGroup_5_3()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:840:1: ( rule__Box__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:840:2: rule__Box__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5_3__0_in_rule__Box__Group_5__3__Impl1631);
            	    rule__Box__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:850:1: rule__Box__Group_5__4 : rule__Box__Group_5__4__Impl ;
    public final void rule__Box__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:854:1: ( rule__Box__Group_5__4__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:855:2: rule__Box__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5__4__Impl_in_rule__Box__Group_5__41662);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:861:1: rule__Box__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Box__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:865:1: ( ( '}' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:866:1: ( '}' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:866:1: ( '}' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:867:1: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Box__Group_5__4__Impl1690); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:890:1: rule__Box__Group_5_3__0 : rule__Box__Group_5_3__0__Impl rule__Box__Group_5_3__1 ;
    public final void rule__Box__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:894:1: ( rule__Box__Group_5_3__0__Impl rule__Box__Group_5_3__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:895:2: rule__Box__Group_5_3__0__Impl rule__Box__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5_3__0__Impl_in_rule__Box__Group_5_3__01731);
            rule__Box__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5_3__1_in_rule__Box__Group_5_3__01734);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:902:1: rule__Box__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Box__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:906:1: ( ( ',' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:907:1: ( ',' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:907:1: ( ',' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:908:1: ','
            {
             before(grammarAccess.getBoxAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Box__Group_5_3__0__Impl1762); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:921:1: rule__Box__Group_5_3__1 : rule__Box__Group_5_3__1__Impl ;
    public final void rule__Box__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:925:1: ( rule__Box__Group_5_3__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:926:2: rule__Box__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_5_3__1__Impl_in_rule__Box__Group_5_3__11793);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:932:1: rule__Box__Group_5_3__1__Impl : ( ( rule__Box__BoxInstancesAssignment_5_3_1 ) ) ;
    public final void rule__Box__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:936:1: ( ( ( rule__Box__BoxInstancesAssignment_5_3_1 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:937:1: ( ( rule__Box__BoxInstancesAssignment_5_3_1 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:937:1: ( ( rule__Box__BoxInstancesAssignment_5_3_1 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:938:1: ( rule__Box__BoxInstancesAssignment_5_3_1 )
            {
             before(grammarAccess.getBoxAccess().getBoxInstancesAssignment_5_3_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:939:1: ( rule__Box__BoxInstancesAssignment_5_3_1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:939:2: rule__Box__BoxInstancesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__BoxInstancesAssignment_5_3_1_in_rule__Box__Group_5_3__1__Impl1820);
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


    // $ANTLR start "rule__Box__Group_6__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:953:1: rule__Box__Group_6__0 : rule__Box__Group_6__0__Impl rule__Box__Group_6__1 ;
    public final void rule__Box__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:957:1: ( rule__Box__Group_6__0__Impl rule__Box__Group_6__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:958:2: rule__Box__Group_6__0__Impl rule__Box__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6__0__Impl_in_rule__Box__Group_6__01854);
            rule__Box__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6__1_in_rule__Box__Group_6__01857);
            rule__Box__Group_6__1();

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
    // $ANTLR end "rule__Box__Group_6__0"


    // $ANTLR start "rule__Box__Group_6__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:965:1: rule__Box__Group_6__0__Impl : ( 'connections' ) ;
    public final void rule__Box__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:969:1: ( ( 'connections' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:970:1: ( 'connections' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:970:1: ( 'connections' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:971:1: 'connections'
            {
             before(grammarAccess.getBoxAccess().getConnectionsKeyword_6_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Box__Group_6__0__Impl1885); 
             after(grammarAccess.getBoxAccess().getConnectionsKeyword_6_0()); 

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
    // $ANTLR end "rule__Box__Group_6__0__Impl"


    // $ANTLR start "rule__Box__Group_6__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:984:1: rule__Box__Group_6__1 : rule__Box__Group_6__1__Impl rule__Box__Group_6__2 ;
    public final void rule__Box__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:988:1: ( rule__Box__Group_6__1__Impl rule__Box__Group_6__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:989:2: rule__Box__Group_6__1__Impl rule__Box__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6__1__Impl_in_rule__Box__Group_6__11916);
            rule__Box__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6__2_in_rule__Box__Group_6__11919);
            rule__Box__Group_6__2();

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
    // $ANTLR end "rule__Box__Group_6__1"


    // $ANTLR start "rule__Box__Group_6__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:996:1: rule__Box__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Box__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1000:1: ( ( '{' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1001:1: ( '{' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1001:1: ( '{' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1002:1: '{'
            {
             before(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Box__Group_6__1__Impl1947); 
             after(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__Box__Group_6__1__Impl"


    // $ANTLR start "rule__Box__Group_6__2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1015:1: rule__Box__Group_6__2 : rule__Box__Group_6__2__Impl rule__Box__Group_6__3 ;
    public final void rule__Box__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1019:1: ( rule__Box__Group_6__2__Impl rule__Box__Group_6__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1020:2: rule__Box__Group_6__2__Impl rule__Box__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6__2__Impl_in_rule__Box__Group_6__21978);
            rule__Box__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6__3_in_rule__Box__Group_6__21981);
            rule__Box__Group_6__3();

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
    // $ANTLR end "rule__Box__Group_6__2"


    // $ANTLR start "rule__Box__Group_6__2__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1027:1: rule__Box__Group_6__2__Impl : ( ( rule__Box__ConnectionsAssignment_6_2 ) ) ;
    public final void rule__Box__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1031:1: ( ( ( rule__Box__ConnectionsAssignment_6_2 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1032:1: ( ( rule__Box__ConnectionsAssignment_6_2 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1032:1: ( ( rule__Box__ConnectionsAssignment_6_2 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1033:1: ( rule__Box__ConnectionsAssignment_6_2 )
            {
             before(grammarAccess.getBoxAccess().getConnectionsAssignment_6_2()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1034:1: ( rule__Box__ConnectionsAssignment_6_2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1034:2: rule__Box__ConnectionsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__ConnectionsAssignment_6_2_in_rule__Box__Group_6__2__Impl2008);
            rule__Box__ConnectionsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getConnectionsAssignment_6_2()); 

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
    // $ANTLR end "rule__Box__Group_6__2__Impl"


    // $ANTLR start "rule__Box__Group_6__3"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1044:1: rule__Box__Group_6__3 : rule__Box__Group_6__3__Impl rule__Box__Group_6__4 ;
    public final void rule__Box__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1048:1: ( rule__Box__Group_6__3__Impl rule__Box__Group_6__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1049:2: rule__Box__Group_6__3__Impl rule__Box__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6__3__Impl_in_rule__Box__Group_6__32038);
            rule__Box__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6__4_in_rule__Box__Group_6__32041);
            rule__Box__Group_6__4();

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
    // $ANTLR end "rule__Box__Group_6__3"


    // $ANTLR start "rule__Box__Group_6__3__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1056:1: rule__Box__Group_6__3__Impl : ( ( rule__Box__Group_6_3__0 )* ) ;
    public final void rule__Box__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1060:1: ( ( ( rule__Box__Group_6_3__0 )* ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1061:1: ( ( rule__Box__Group_6_3__0 )* )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1061:1: ( ( rule__Box__Group_6_3__0 )* )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1062:1: ( rule__Box__Group_6_3__0 )*
            {
             before(grammarAccess.getBoxAccess().getGroup_6_3()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1063:1: ( rule__Box__Group_6_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1063:2: rule__Box__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6_3__0_in_rule__Box__Group_6__3__Impl2068);
            	    rule__Box__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBoxAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__Box__Group_6__3__Impl"


    // $ANTLR start "rule__Box__Group_6__4"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1073:1: rule__Box__Group_6__4 : rule__Box__Group_6__4__Impl ;
    public final void rule__Box__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1077:1: ( rule__Box__Group_6__4__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1078:2: rule__Box__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6__4__Impl_in_rule__Box__Group_6__42099);
            rule__Box__Group_6__4__Impl();

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
    // $ANTLR end "rule__Box__Group_6__4"


    // $ANTLR start "rule__Box__Group_6__4__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1084:1: rule__Box__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Box__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1088:1: ( ( '}' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1089:1: ( '}' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1089:1: ( '}' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1090:1: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Box__Group_6__4__Impl2127); 
             after(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__Box__Group_6__4__Impl"


    // $ANTLR start "rule__Box__Group_6_3__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1113:1: rule__Box__Group_6_3__0 : rule__Box__Group_6_3__0__Impl rule__Box__Group_6_3__1 ;
    public final void rule__Box__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1117:1: ( rule__Box__Group_6_3__0__Impl rule__Box__Group_6_3__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1118:2: rule__Box__Group_6_3__0__Impl rule__Box__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6_3__0__Impl_in_rule__Box__Group_6_3__02168);
            rule__Box__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6_3__1_in_rule__Box__Group_6_3__02171);
            rule__Box__Group_6_3__1();

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
    // $ANTLR end "rule__Box__Group_6_3__0"


    // $ANTLR start "rule__Box__Group_6_3__0__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1125:1: rule__Box__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Box__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1129:1: ( ( ',' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1130:1: ( ',' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1130:1: ( ',' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1131:1: ','
            {
             before(grammarAccess.getBoxAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Box__Group_6_3__0__Impl2199); 
             after(grammarAccess.getBoxAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__Box__Group_6_3__0__Impl"


    // $ANTLR start "rule__Box__Group_6_3__1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1144:1: rule__Box__Group_6_3__1 : rule__Box__Group_6_3__1__Impl ;
    public final void rule__Box__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1148:1: ( rule__Box__Group_6_3__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1149:2: rule__Box__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__Group_6_3__1__Impl_in_rule__Box__Group_6_3__12230);
            rule__Box__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Box__Group_6_3__1"


    // $ANTLR start "rule__Box__Group_6_3__1__Impl"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1155:1: rule__Box__Group_6_3__1__Impl : ( ( rule__Box__ConnectionsAssignment_6_3_1 ) ) ;
    public final void rule__Box__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1159:1: ( ( ( rule__Box__ConnectionsAssignment_6_3_1 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1160:1: ( ( rule__Box__ConnectionsAssignment_6_3_1 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1160:1: ( ( rule__Box__ConnectionsAssignment_6_3_1 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1161:1: ( rule__Box__ConnectionsAssignment_6_3_1 )
            {
             before(grammarAccess.getBoxAccess().getConnectionsAssignment_6_3_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1162:1: ( rule__Box__ConnectionsAssignment_6_3_1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1162:2: rule__Box__ConnectionsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Box__ConnectionsAssignment_6_3_1_in_rule__Box__Group_6_3__1__Impl2257);
            rule__Box__ConnectionsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getConnectionsAssignment_6_3_1()); 

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
    // $ANTLR end "rule__Box__Group_6_3__1__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1176:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1180:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1181:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__02291);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Port__Group__1_in_rule__Port__Group__02294);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1188:1: rule__Port__Group__0__Impl : ( () ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1192:1: ( ( () ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1193:1: ( () )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1193:1: ( () )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1194:1: ()
            {
             before(grammarAccess.getPortAccess().getPortAction_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1195:1: ()
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1197:1: 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1207:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1211:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1212:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12352);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Port__Group__2_in_rule__Port__Group__12355);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1219:1: rule__Port__Group__1__Impl : ( 'Port' ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1223:1: ( ( 'Port' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1224:1: ( 'Port' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1224:1: ( 'Port' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1225:1: 'Port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Port__Group__1__Impl2383); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1238:1: rule__Port__Group__2 : rule__Port__Group__2__Impl ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1242:1: ( rule__Port__Group__2__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1243:2: rule__Port__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__22414);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1249:1: rule__Port__Group__2__Impl : ( ( rule__Port__NameAssignment_2 ) ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1253:1: ( ( ( rule__Port__NameAssignment_2 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1254:1: ( ( rule__Port__NameAssignment_2 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1254:1: ( ( rule__Port__NameAssignment_2 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1255:1: ( rule__Port__NameAssignment_2 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_2()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1256:1: ( rule__Port__NameAssignment_2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1256:2: rule__Port__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Port__NameAssignment_2_in_rule__Port__Group__2__Impl2441);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1272:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1276:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1277:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__02477);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__02480);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1284:1: rule__Connection__Group__0__Impl : ( 'Connection' ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1288:1: ( ( 'Connection' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1289:1: ( 'Connection' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1289:1: ( 'Connection' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1290:1: 'Connection'
            {
             before(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Connection__Group__0__Impl2508); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1303:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1307:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1308:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__12539);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__12542);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1315:1: rule__Connection__Group__1__Impl : ( '{' ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1319:1: ( ( '{' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1320:1: ( '{' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1320:1: ( '{' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1321:1: '{'
            {
             before(grammarAccess.getConnectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Connection__Group__1__Impl2570); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1334:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1338:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1339:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__22601);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__22604);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1346:1: rule__Connection__Group__2__Impl : ( 'intPorts' ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1350:1: ( ( 'intPorts' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1351:1: ( 'intPorts' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1351:1: ( 'intPorts' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1352:1: 'intPorts'
            {
             before(grammarAccess.getConnectionAccess().getIntPortsKeyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Connection__Group__2__Impl2632); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1365:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1369:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1370:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__32663);
            rule__Connection__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__32666);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1377:1: rule__Connection__Group__3__Impl : ( '(' ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1381:1: ( ( '(' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1382:1: ( '(' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1382:1: ( '(' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1383:1: '('
            {
             before(grammarAccess.getConnectionAccess().getLeftParenthesisKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Connection__Group__3__Impl2694); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1396:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1400:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1401:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__42725);
            rule__Connection__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__5_in_rule__Connection__Group__42728);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1408:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__IntPortsAssignment_4 ) ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1412:1: ( ( ( rule__Connection__IntPortsAssignment_4 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1413:1: ( ( rule__Connection__IntPortsAssignment_4 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1413:1: ( ( rule__Connection__IntPortsAssignment_4 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1414:1: ( rule__Connection__IntPortsAssignment_4 )
            {
             before(grammarAccess.getConnectionAccess().getIntPortsAssignment_4()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1415:1: ( rule__Connection__IntPortsAssignment_4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1415:2: rule__Connection__IntPortsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__IntPortsAssignment_4_in_rule__Connection__Group__4__Impl2755);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1425:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl rule__Connection__Group__6 ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1429:1: ( rule__Connection__Group__5__Impl rule__Connection__Group__6 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1430:2: rule__Connection__Group__5__Impl rule__Connection__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__5__Impl_in_rule__Connection__Group__52785);
            rule__Connection__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__6_in_rule__Connection__Group__52788);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1437:1: rule__Connection__Group__5__Impl : ( ( rule__Connection__Group_5__0 )* ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1441:1: ( ( ( rule__Connection__Group_5__0 )* ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1442:1: ( ( rule__Connection__Group_5__0 )* )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1442:1: ( ( rule__Connection__Group_5__0 )* )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1443:1: ( rule__Connection__Group_5__0 )*
            {
             before(grammarAccess.getConnectionAccess().getGroup_5()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1444:1: ( rule__Connection__Group_5__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1444:2: rule__Connection__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_5__0_in_rule__Connection__Group__5__Impl2815);
            	    rule__Connection__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1454:1: rule__Connection__Group__6 : rule__Connection__Group__6__Impl rule__Connection__Group__7 ;
    public final void rule__Connection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1458:1: ( rule__Connection__Group__6__Impl rule__Connection__Group__7 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1459:2: rule__Connection__Group__6__Impl rule__Connection__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__6__Impl_in_rule__Connection__Group__62846);
            rule__Connection__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__7_in_rule__Connection__Group__62849);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1466:1: rule__Connection__Group__6__Impl : ( ')' ) ;
    public final void rule__Connection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1470:1: ( ( ')' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1471:1: ( ')' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1471:1: ( ')' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1472:1: ')'
            {
             before(grammarAccess.getConnectionAccess().getRightParenthesisKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Connection__Group__6__Impl2877); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1485:1: rule__Connection__Group__7 : rule__Connection__Group__7__Impl rule__Connection__Group__8 ;
    public final void rule__Connection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1489:1: ( rule__Connection__Group__7__Impl rule__Connection__Group__8 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1490:2: rule__Connection__Group__7__Impl rule__Connection__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__7__Impl_in_rule__Connection__Group__72908);
            rule__Connection__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__8_in_rule__Connection__Group__72911);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1497:1: rule__Connection__Group__7__Impl : ( ( rule__Connection__Group_7__0 )? ) ;
    public final void rule__Connection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1501:1: ( ( ( rule__Connection__Group_7__0 )? ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1502:1: ( ( rule__Connection__Group_7__0 )? )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1502:1: ( ( rule__Connection__Group_7__0 )? )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1503:1: ( rule__Connection__Group_7__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_7()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1504:1: ( rule__Connection__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1504:2: rule__Connection__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__0_in_rule__Connection__Group__7__Impl2938);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1514:1: rule__Connection__Group__8 : rule__Connection__Group__8__Impl ;
    public final void rule__Connection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1518:1: ( rule__Connection__Group__8__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1519:2: rule__Connection__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__8__Impl_in_rule__Connection__Group__82969);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1525:1: rule__Connection__Group__8__Impl : ( '}' ) ;
    public final void rule__Connection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1529:1: ( ( '}' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1530:1: ( '}' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1530:1: ( '}' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1531:1: '}'
            {
             before(grammarAccess.getConnectionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Connection__Group__8__Impl2997); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1562:1: rule__Connection__Group_5__0 : rule__Connection__Group_5__0__Impl rule__Connection__Group_5__1 ;
    public final void rule__Connection__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1566:1: ( rule__Connection__Group_5__0__Impl rule__Connection__Group_5__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1567:2: rule__Connection__Group_5__0__Impl rule__Connection__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_5__0__Impl_in_rule__Connection__Group_5__03046);
            rule__Connection__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_5__1_in_rule__Connection__Group_5__03049);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1574:1: rule__Connection__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Connection__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1578:1: ( ( ',' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1579:1: ( ',' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1579:1: ( ',' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1580:1: ','
            {
             before(grammarAccess.getConnectionAccess().getCommaKeyword_5_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Connection__Group_5__0__Impl3077); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1593:1: rule__Connection__Group_5__1 : rule__Connection__Group_5__1__Impl ;
    public final void rule__Connection__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1597:1: ( rule__Connection__Group_5__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1598:2: rule__Connection__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_5__1__Impl_in_rule__Connection__Group_5__13108);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1604:1: rule__Connection__Group_5__1__Impl : ( ( rule__Connection__IntPortsAssignment_5_1 ) ) ;
    public final void rule__Connection__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1608:1: ( ( ( rule__Connection__IntPortsAssignment_5_1 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1609:1: ( ( rule__Connection__IntPortsAssignment_5_1 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1609:1: ( ( rule__Connection__IntPortsAssignment_5_1 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1610:1: ( rule__Connection__IntPortsAssignment_5_1 )
            {
             before(grammarAccess.getConnectionAccess().getIntPortsAssignment_5_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1611:1: ( rule__Connection__IntPortsAssignment_5_1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1611:2: rule__Connection__IntPortsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__IntPortsAssignment_5_1_in_rule__Connection__Group_5__1__Impl3135);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1625:1: rule__Connection__Group_7__0 : rule__Connection__Group_7__0__Impl rule__Connection__Group_7__1 ;
    public final void rule__Connection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1629:1: ( rule__Connection__Group_7__0__Impl rule__Connection__Group_7__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1630:2: rule__Connection__Group_7__0__Impl rule__Connection__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__0__Impl_in_rule__Connection__Group_7__03169);
            rule__Connection__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__1_in_rule__Connection__Group_7__03172);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1637:1: rule__Connection__Group_7__0__Impl : ( 'extPorts' ) ;
    public final void rule__Connection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1641:1: ( ( 'extPorts' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1642:1: ( 'extPorts' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1642:1: ( 'extPorts' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1643:1: 'extPorts'
            {
             before(grammarAccess.getConnectionAccess().getExtPortsKeyword_7_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Connection__Group_7__0__Impl3200); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1656:1: rule__Connection__Group_7__1 : rule__Connection__Group_7__1__Impl rule__Connection__Group_7__2 ;
    public final void rule__Connection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1660:1: ( rule__Connection__Group_7__1__Impl rule__Connection__Group_7__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1661:2: rule__Connection__Group_7__1__Impl rule__Connection__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__1__Impl_in_rule__Connection__Group_7__13231);
            rule__Connection__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__2_in_rule__Connection__Group_7__13234);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1668:1: rule__Connection__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Connection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1672:1: ( ( '(' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1673:1: ( '(' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1673:1: ( '(' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1674:1: '('
            {
             before(grammarAccess.getConnectionAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Connection__Group_7__1__Impl3262); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1687:1: rule__Connection__Group_7__2 : rule__Connection__Group_7__2__Impl rule__Connection__Group_7__3 ;
    public final void rule__Connection__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1691:1: ( rule__Connection__Group_7__2__Impl rule__Connection__Group_7__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1692:2: rule__Connection__Group_7__2__Impl rule__Connection__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__2__Impl_in_rule__Connection__Group_7__23293);
            rule__Connection__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__3_in_rule__Connection__Group_7__23296);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1699:1: rule__Connection__Group_7__2__Impl : ( ( rule__Connection__ExtPortsAssignment_7_2 ) ) ;
    public final void rule__Connection__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1703:1: ( ( ( rule__Connection__ExtPortsAssignment_7_2 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1704:1: ( ( rule__Connection__ExtPortsAssignment_7_2 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1704:1: ( ( rule__Connection__ExtPortsAssignment_7_2 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1705:1: ( rule__Connection__ExtPortsAssignment_7_2 )
            {
             before(grammarAccess.getConnectionAccess().getExtPortsAssignment_7_2()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1706:1: ( rule__Connection__ExtPortsAssignment_7_2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1706:2: rule__Connection__ExtPortsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__ExtPortsAssignment_7_2_in_rule__Connection__Group_7__2__Impl3323);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1716:1: rule__Connection__Group_7__3 : rule__Connection__Group_7__3__Impl rule__Connection__Group_7__4 ;
    public final void rule__Connection__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1720:1: ( rule__Connection__Group_7__3__Impl rule__Connection__Group_7__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1721:2: rule__Connection__Group_7__3__Impl rule__Connection__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__3__Impl_in_rule__Connection__Group_7__33353);
            rule__Connection__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__4_in_rule__Connection__Group_7__33356);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1728:1: rule__Connection__Group_7__3__Impl : ( ( rule__Connection__Group_7_3__0 )* ) ;
    public final void rule__Connection__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1732:1: ( ( ( rule__Connection__Group_7_3__0 )* ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1733:1: ( ( rule__Connection__Group_7_3__0 )* )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1733:1: ( ( rule__Connection__Group_7_3__0 )* )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1734:1: ( rule__Connection__Group_7_3__0 )*
            {
             before(grammarAccess.getConnectionAccess().getGroup_7_3()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1735:1: ( rule__Connection__Group_7_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1735:2: rule__Connection__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7_3__0_in_rule__Connection__Group_7__3__Impl3383);
            	    rule__Connection__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1745:1: rule__Connection__Group_7__4 : rule__Connection__Group_7__4__Impl ;
    public final void rule__Connection__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1749:1: ( rule__Connection__Group_7__4__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1750:2: rule__Connection__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7__4__Impl_in_rule__Connection__Group_7__43414);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1756:1: rule__Connection__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Connection__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1760:1: ( ( ')' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1761:1: ( ')' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1761:1: ( ')' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1762:1: ')'
            {
             before(grammarAccess.getConnectionAccess().getRightParenthesisKeyword_7_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Connection__Group_7__4__Impl3442); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1785:1: rule__Connection__Group_7_3__0 : rule__Connection__Group_7_3__0__Impl rule__Connection__Group_7_3__1 ;
    public final void rule__Connection__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1789:1: ( rule__Connection__Group_7_3__0__Impl rule__Connection__Group_7_3__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1790:2: rule__Connection__Group_7_3__0__Impl rule__Connection__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7_3__0__Impl_in_rule__Connection__Group_7_3__03483);
            rule__Connection__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7_3__1_in_rule__Connection__Group_7_3__03486);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1797:1: rule__Connection__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Connection__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1801:1: ( ( ',' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1802:1: ( ',' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1802:1: ( ',' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1803:1: ','
            {
             before(grammarAccess.getConnectionAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Connection__Group_7_3__0__Impl3514); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1816:1: rule__Connection__Group_7_3__1 : rule__Connection__Group_7_3__1__Impl ;
    public final void rule__Connection__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1820:1: ( rule__Connection__Group_7_3__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1821:2: rule__Connection__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_7_3__1__Impl_in_rule__Connection__Group_7_3__13545);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1827:1: rule__Connection__Group_7_3__1__Impl : ( ( rule__Connection__ExtPortsAssignment_7_3_1 ) ) ;
    public final void rule__Connection__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1831:1: ( ( ( rule__Connection__ExtPortsAssignment_7_3_1 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1832:1: ( ( rule__Connection__ExtPortsAssignment_7_3_1 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1832:1: ( ( rule__Connection__ExtPortsAssignment_7_3_1 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1833:1: ( rule__Connection__ExtPortsAssignment_7_3_1 )
            {
             before(grammarAccess.getConnectionAccess().getExtPortsAssignment_7_3_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1834:1: ( rule__Connection__ExtPortsAssignment_7_3_1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1834:2: rule__Connection__ExtPortsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__ExtPortsAssignment_7_3_1_in_rule__Connection__Group_7_3__1__Impl3572);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1848:1: rule__BoxInstance__Group__0 : rule__BoxInstance__Group__0__Impl rule__BoxInstance__Group__1 ;
    public final void rule__BoxInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1852:1: ( rule__BoxInstance__Group__0__Impl rule__BoxInstance__Group__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1853:2: rule__BoxInstance__Group__0__Impl rule__BoxInstance__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__0__Impl_in_rule__BoxInstance__Group__03606);
            rule__BoxInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__1_in_rule__BoxInstance__Group__03609);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1860:1: rule__BoxInstance__Group__0__Impl : ( 'BoxInstance' ) ;
    public final void rule__BoxInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1864:1: ( ( 'BoxInstance' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1865:1: ( 'BoxInstance' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1865:1: ( 'BoxInstance' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1866:1: 'BoxInstance'
            {
             before(grammarAccess.getBoxInstanceAccess().getBoxInstanceKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__BoxInstance__Group__0__Impl3637); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1879:1: rule__BoxInstance__Group__1 : rule__BoxInstance__Group__1__Impl rule__BoxInstance__Group__2 ;
    public final void rule__BoxInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1883:1: ( rule__BoxInstance__Group__1__Impl rule__BoxInstance__Group__2 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1884:2: rule__BoxInstance__Group__1__Impl rule__BoxInstance__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__1__Impl_in_rule__BoxInstance__Group__13668);
            rule__BoxInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__2_in_rule__BoxInstance__Group__13671);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1891:1: rule__BoxInstance__Group__1__Impl : ( '{' ) ;
    public final void rule__BoxInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1895:1: ( ( '{' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1896:1: ( '{' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1896:1: ( '{' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1897:1: '{'
            {
             before(grammarAccess.getBoxInstanceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BoxInstance__Group__1__Impl3699); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1910:1: rule__BoxInstance__Group__2 : rule__BoxInstance__Group__2__Impl rule__BoxInstance__Group__3 ;
    public final void rule__BoxInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1914:1: ( rule__BoxInstance__Group__2__Impl rule__BoxInstance__Group__3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1915:2: rule__BoxInstance__Group__2__Impl rule__BoxInstance__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__2__Impl_in_rule__BoxInstance__Group__23730);
            rule__BoxInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__3_in_rule__BoxInstance__Group__23733);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1922:1: rule__BoxInstance__Group__2__Impl : ( 'boxRef' ) ;
    public final void rule__BoxInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1926:1: ( ( 'boxRef' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1927:1: ( 'boxRef' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1927:1: ( 'boxRef' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1928:1: 'boxRef'
            {
             before(grammarAccess.getBoxInstanceAccess().getBoxRefKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__BoxInstance__Group__2__Impl3761); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1941:1: rule__BoxInstance__Group__3 : rule__BoxInstance__Group__3__Impl rule__BoxInstance__Group__4 ;
    public final void rule__BoxInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1945:1: ( rule__BoxInstance__Group__3__Impl rule__BoxInstance__Group__4 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1946:2: rule__BoxInstance__Group__3__Impl rule__BoxInstance__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__3__Impl_in_rule__BoxInstance__Group__33792);
            rule__BoxInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__4_in_rule__BoxInstance__Group__33795);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1953:1: rule__BoxInstance__Group__3__Impl : ( ( rule__BoxInstance__BoxRefAssignment_3 ) ) ;
    public final void rule__BoxInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1957:1: ( ( ( rule__BoxInstance__BoxRefAssignment_3 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1958:1: ( ( rule__BoxInstance__BoxRefAssignment_3 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1958:1: ( ( rule__BoxInstance__BoxRefAssignment_3 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1959:1: ( rule__BoxInstance__BoxRefAssignment_3 )
            {
             before(grammarAccess.getBoxInstanceAccess().getBoxRefAssignment_3()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1960:1: ( rule__BoxInstance__BoxRefAssignment_3 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1960:2: rule__BoxInstance__BoxRefAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__BoxRefAssignment_3_in_rule__BoxInstance__Group__3__Impl3822);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1970:1: rule__BoxInstance__Group__4 : rule__BoxInstance__Group__4__Impl rule__BoxInstance__Group__5 ;
    public final void rule__BoxInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1974:1: ( rule__BoxInstance__Group__4__Impl rule__BoxInstance__Group__5 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1975:2: rule__BoxInstance__Group__4__Impl rule__BoxInstance__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__4__Impl_in_rule__BoxInstance__Group__43852);
            rule__BoxInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__5_in_rule__BoxInstance__Group__43855);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1982:1: rule__BoxInstance__Group__4__Impl : ( ( rule__BoxInstance__Group_4__0 )? ) ;
    public final void rule__BoxInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1986:1: ( ( ( rule__BoxInstance__Group_4__0 )? ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1987:1: ( ( rule__BoxInstance__Group_4__0 )? )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1987:1: ( ( rule__BoxInstance__Group_4__0 )? )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1988:1: ( rule__BoxInstance__Group_4__0 )?
            {
             before(grammarAccess.getBoxInstanceAccess().getGroup_4()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1989:1: ( rule__BoxInstance__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1989:2: rule__BoxInstance__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_4__0_in_rule__BoxInstance__Group__4__Impl3882);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:1999:1: rule__BoxInstance__Group__5 : rule__BoxInstance__Group__5__Impl ;
    public final void rule__BoxInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2003:1: ( rule__BoxInstance__Group__5__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2004:2: rule__BoxInstance__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group__5__Impl_in_rule__BoxInstance__Group__53913);
            rule__BoxInstance__Group__5__Impl();

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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2010:1: rule__BoxInstance__Group__5__Impl : ( '}' ) ;
    public final void rule__BoxInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2014:1: ( ( '}' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2015:1: ( '}' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2015:1: ( '}' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2016:1: '}'
            {
             before(grammarAccess.getBoxInstanceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BoxInstance__Group__5__Impl3941); 
             after(grammarAccess.getBoxInstanceAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__BoxInstance__Group_4__0"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2041:1: rule__BoxInstance__Group_4__0 : rule__BoxInstance__Group_4__0__Impl rule__BoxInstance__Group_4__1 ;
    public final void rule__BoxInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2045:1: ( rule__BoxInstance__Group_4__0__Impl rule__BoxInstance__Group_4__1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2046:2: rule__BoxInstance__Group_4__0__Impl rule__BoxInstance__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_4__0__Impl_in_rule__BoxInstance__Group_4__03984);
            rule__BoxInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_4__1_in_rule__BoxInstance__Group_4__03987);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2053:1: rule__BoxInstance__Group_4__0__Impl : ( 'instanceName' ) ;
    public final void rule__BoxInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2057:1: ( ( 'instanceName' ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2058:1: ( 'instanceName' )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2058:1: ( 'instanceName' )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2059:1: 'instanceName'
            {
             before(grammarAccess.getBoxInstanceAccess().getInstanceNameKeyword_4_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__BoxInstance__Group_4__0__Impl4015); 
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2072:1: rule__BoxInstance__Group_4__1 : rule__BoxInstance__Group_4__1__Impl ;
    public final void rule__BoxInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2076:1: ( rule__BoxInstance__Group_4__1__Impl )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2077:2: rule__BoxInstance__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__Group_4__1__Impl_in_rule__BoxInstance__Group_4__14046);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2083:1: rule__BoxInstance__Group_4__1__Impl : ( ( rule__BoxInstance__InstanceNameAssignment_4_1 ) ) ;
    public final void rule__BoxInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2087:1: ( ( ( rule__BoxInstance__InstanceNameAssignment_4_1 ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2088:1: ( ( rule__BoxInstance__InstanceNameAssignment_4_1 ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2088:1: ( ( rule__BoxInstance__InstanceNameAssignment_4_1 ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2089:1: ( rule__BoxInstance__InstanceNameAssignment_4_1 )
            {
             before(grammarAccess.getBoxInstanceAccess().getInstanceNameAssignment_4_1()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2090:1: ( rule__BoxInstance__InstanceNameAssignment_4_1 )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2090:2: rule__BoxInstance__InstanceNameAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoxInstance__InstanceNameAssignment_4_1_in_rule__BoxInstance__Group_4__1__Impl4073);
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


    // $ANTLR start "rule__Box__ConnectionsAssignment_6_2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2304:1: rule__Box__ConnectionsAssignment_6_2 : ( ruleConnection ) ;
    public final void rule__Box__ConnectionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2308:1: ( ( ruleConnection ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2309:1: ( ruleConnection )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2309:1: ( ruleConnection )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2310:1: ruleConnection
            {
             before(grammarAccess.getBoxAccess().getConnectionsConnectionParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_rule__Box__ConnectionsAssignment_6_24510);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getConnectionsConnectionParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Box__ConnectionsAssignment_6_2"


    // $ANTLR start "rule__Box__ConnectionsAssignment_6_3_1"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2319:1: rule__Box__ConnectionsAssignment_6_3_1 : ( ruleConnection ) ;
    public final void rule__Box__ConnectionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2323:1: ( ( ruleConnection ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2324:1: ( ruleConnection )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2324:1: ( ruleConnection )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2325:1: ruleConnection
            {
             before(grammarAccess.getBoxAccess().getConnectionsConnectionParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_rule__Box__ConnectionsAssignment_6_3_14541);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getConnectionsConnectionParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__Box__ConnectionsAssignment_6_3_1"


    // $ANTLR start "rule__Port__NameAssignment_2"
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2334:1: rule__Port__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Port__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2338:1: ( ( ruleEString ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2339:1: ( ruleEString )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2339:1: ( ruleEString )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2340:1: ruleEString
            {
             before(grammarAccess.getPortAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Port__NameAssignment_24572);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2349:1: rule__Connection__IntPortsAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connection__IntPortsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2353:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2354:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2354:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2355:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectionAccess().getIntPortsPortCrossReference_4_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2356:1: ( ruleQualifiedName )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2357:1: ruleQualifiedName
            {
             before(grammarAccess.getConnectionAccess().getIntPortsPortQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Connection__IntPortsAssignment_44607);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2368:1: rule__Connection__IntPortsAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connection__IntPortsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2372:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2373:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2373:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2374:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectionAccess().getIntPortsPortCrossReference_5_1_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2375:1: ( ruleQualifiedName )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2376:1: ruleQualifiedName
            {
             before(grammarAccess.getConnectionAccess().getIntPortsPortQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Connection__IntPortsAssignment_5_14646);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2387:1: rule__Connection__ExtPortsAssignment_7_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connection__ExtPortsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2391:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2392:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2392:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2393:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectionAccess().getExtPortsPortCrossReference_7_2_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2394:1: ( ruleQualifiedName )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2395:1: ruleQualifiedName
            {
             before(grammarAccess.getConnectionAccess().getExtPortsPortQualifiedNameParserRuleCall_7_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Connection__ExtPortsAssignment_7_24685);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2406:1: rule__Connection__ExtPortsAssignment_7_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connection__ExtPortsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2410:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2411:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2411:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2412:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectionAccess().getExtPortsPortCrossReference_7_3_1_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2413:1: ( ruleQualifiedName )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2414:1: ruleQualifiedName
            {
             before(grammarAccess.getConnectionAccess().getExtPortsPortQualifiedNameParserRuleCall_7_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Connection__ExtPortsAssignment_7_3_14724);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2425:1: rule__BoxInstance__BoxRefAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BoxInstance__BoxRefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2429:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2430:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2430:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2431:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getBoxInstanceAccess().getBoxRefBoxCrossReference_3_0()); 
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2432:1: ( ruleQualifiedName )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2433:1: ruleQualifiedName
            {
             before(grammarAccess.getBoxInstanceAccess().getBoxRefBoxQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__BoxInstance__BoxRefAssignment_34763);
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
    // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2444:1: rule__BoxInstance__InstanceNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BoxInstance__InstanceNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2448:1: ( ( ruleEString ) )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2449:1: ( ruleEString )
            {
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2449:1: ( ruleEString )
            // ../org.xtext.example.boxes.ui/src-gen/org/xtext/example/boxes/ui/contentassist/antlr/internal/InternalBoxesDsl.g:2450:1: ruleEString
            {
             before(grammarAccess.getBoxInstanceAccess().getInstanceNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BoxInstance__InstanceNameAssignment_4_14798);
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
        public static final BitSet FOLLOW_rule__Box__Group__3__Impl_in_rule__Box__Group__3660 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__Box__Group__4_in_rule__Box__Group__3663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Box__Group__3__Impl691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group__4__Impl_in_rule__Box__Group__4722 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__Box__Group__5_in_rule__Box__Group__4725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4__0_in_rule__Box__Group__4__Impl752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group__5__Impl_in_rule__Box__Group__5783 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__Box__Group__6_in_rule__Box__Group__5786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5__0_in_rule__Box__Group__5__Impl813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group__6__Impl_in_rule__Box__Group__6844 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__Box__Group__7_in_rule__Box__Group__6847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_6__0_in_rule__Box__Group__6__Impl874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group__7__Impl_in_rule__Box__Group__7905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Box__Group__7__Impl933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4__0__Impl_in_rule__Box__Group_4__0980 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Box__Group_4__1_in_rule__Box__Group_4__0983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Box__Group_4__0__Impl1011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4__1__Impl_in_rule__Box__Group_4__11042 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Box__Group_4__2_in_rule__Box__Group_4__11045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Box__Group_4__1__Impl1073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4__2__Impl_in_rule__Box__Group_4__21104 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Box__Group_4__3_in_rule__Box__Group_4__21107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__PortsAssignment_4_2_in_rule__Box__Group_4__2__Impl1134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4__3__Impl_in_rule__Box__Group_4__31164 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Box__Group_4__4_in_rule__Box__Group_4__31167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4_3__0_in_rule__Box__Group_4__3__Impl1194 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Box__Group_4__4__Impl_in_rule__Box__Group_4__41225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Box__Group_4__4__Impl1253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4_3__0__Impl_in_rule__Box__Group_4_3__01294 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Box__Group_4_3__1_in_rule__Box__Group_4_3__01297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Box__Group_4_3__0__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_4_3__1__Impl_in_rule__Box__Group_4_3__11356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__PortsAssignment_4_3_1_in_rule__Box__Group_4_3__1__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5__0__Impl_in_rule__Box__Group_5__01417 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Box__Group_5__1_in_rule__Box__Group_5__01420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Box__Group_5__0__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5__1__Impl_in_rule__Box__Group_5__11479 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Box__Group_5__2_in_rule__Box__Group_5__11482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Box__Group_5__1__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5__2__Impl_in_rule__Box__Group_5__21541 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Box__Group_5__3_in_rule__Box__Group_5__21544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__BoxInstancesAssignment_5_2_in_rule__Box__Group_5__2__Impl1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5__3__Impl_in_rule__Box__Group_5__31601 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Box__Group_5__4_in_rule__Box__Group_5__31604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5_3__0_in_rule__Box__Group_5__3__Impl1631 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Box__Group_5__4__Impl_in_rule__Box__Group_5__41662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Box__Group_5__4__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5_3__0__Impl_in_rule__Box__Group_5_3__01731 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Box__Group_5_3__1_in_rule__Box__Group_5_3__01734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Box__Group_5_3__0__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_5_3__1__Impl_in_rule__Box__Group_5_3__11793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__BoxInstancesAssignment_5_3_1_in_rule__Box__Group_5_3__1__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_6__0__Impl_in_rule__Box__Group_6__01854 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Box__Group_6__1_in_rule__Box__Group_6__01857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Box__Group_6__0__Impl1885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_6__1__Impl_in_rule__Box__Group_6__11916 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Box__Group_6__2_in_rule__Box__Group_6__11919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Box__Group_6__1__Impl1947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_6__2__Impl_in_rule__Box__Group_6__21978 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Box__Group_6__3_in_rule__Box__Group_6__21981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__ConnectionsAssignment_6_2_in_rule__Box__Group_6__2__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_6__3__Impl_in_rule__Box__Group_6__32038 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Box__Group_6__4_in_rule__Box__Group_6__32041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_6_3__0_in_rule__Box__Group_6__3__Impl2068 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Box__Group_6__4__Impl_in_rule__Box__Group_6__42099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Box__Group_6__4__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_6_3__0__Impl_in_rule__Box__Group_6_3__02168 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Box__Group_6_3__1_in_rule__Box__Group_6_3__02171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Box__Group_6_3__0__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__Group_6_3__1__Impl_in_rule__Box__Group_6_3__12230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Box__ConnectionsAssignment_6_3_1_in_rule__Box__Group_6_3__1__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__02291 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__02294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12352 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Port__Group__2_in_rule__Port__Group__12355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Port__Group__1__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__22414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Port__NameAssignment_2_in_rule__Port__Group__2__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__02477 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__02480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Connection__Group__0__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__12539 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__12542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Connection__Group__1__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__22601 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__22604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Connection__Group__2__Impl2632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__32663 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__32666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Connection__Group__3__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__42725 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rule__Connection__Group__5_in_rule__Connection__Group__42728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__IntPortsAssignment_4_in_rule__Connection__Group__4__Impl2755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__5__Impl_in_rule__Connection__Group__52785 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rule__Connection__Group__6_in_rule__Connection__Group__52788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_5__0_in_rule__Connection__Group__5__Impl2815 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Connection__Group__6__Impl_in_rule__Connection__Group__62846 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_rule__Connection__Group__7_in_rule__Connection__Group__62849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Connection__Group__6__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__7__Impl_in_rule__Connection__Group__72908 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_rule__Connection__Group__8_in_rule__Connection__Group__72911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__0_in_rule__Connection__Group__7__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__8__Impl_in_rule__Connection__Group__82969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Connection__Group__8__Impl2997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_5__0__Impl_in_rule__Connection__Group_5__03046 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Connection__Group_5__1_in_rule__Connection__Group_5__03049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Connection__Group_5__0__Impl3077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_5__1__Impl_in_rule__Connection__Group_5__13108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__IntPortsAssignment_5_1_in_rule__Connection__Group_5__1__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__0__Impl_in_rule__Connection__Group_7__03169 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__1_in_rule__Connection__Group_7__03172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Connection__Group_7__0__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__1__Impl_in_rule__Connection__Group_7__13231 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__2_in_rule__Connection__Group_7__13234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Connection__Group_7__1__Impl3262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__2__Impl_in_rule__Connection__Group_7__23293 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__3_in_rule__Connection__Group_7__23296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__ExtPortsAssignment_7_2_in_rule__Connection__Group_7__2__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__3__Impl_in_rule__Connection__Group_7__33353 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__4_in_rule__Connection__Group_7__33356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7_3__0_in_rule__Connection__Group_7__3__Impl3383 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7__4__Impl_in_rule__Connection__Group_7__43414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Connection__Group_7__4__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7_3__0__Impl_in_rule__Connection__Group_7_3__03483 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Connection__Group_7_3__1_in_rule__Connection__Group_7_3__03486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Connection__Group_7_3__0__Impl3514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_7_3__1__Impl_in_rule__Connection__Group_7_3__13545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__ExtPortsAssignment_7_3_1_in_rule__Connection__Group_7_3__1__Impl3572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__0__Impl_in_rule__BoxInstance__Group__03606 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__1_in_rule__BoxInstance__Group__03609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__BoxInstance__Group__0__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__1__Impl_in_rule__BoxInstance__Group__13668 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__2_in_rule__BoxInstance__Group__13671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BoxInstance__Group__1__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__2__Impl_in_rule__BoxInstance__Group__23730 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__3_in_rule__BoxInstance__Group__23733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__BoxInstance__Group__2__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__3__Impl_in_rule__BoxInstance__Group__33792 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__4_in_rule__BoxInstance__Group__33795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__BoxRefAssignment_3_in_rule__BoxInstance__Group__3__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__4__Impl_in_rule__BoxInstance__Group__43852 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__5_in_rule__BoxInstance__Group__43855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_4__0_in_rule__BoxInstance__Group__4__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group__5__Impl_in_rule__BoxInstance__Group__53913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BoxInstance__Group__5__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_4__0__Impl_in_rule__BoxInstance__Group_4__03984 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_4__1_in_rule__BoxInstance__Group_4__03987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__BoxInstance__Group_4__0__Impl4015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__Group_4__1__Impl_in_rule__BoxInstance__Group_4__14046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoxInstance__InstanceNameAssignment_4_1_in_rule__BoxInstance__Group_4__1__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleConnection_in_rule__Box__ConnectionsAssignment_6_24510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_rule__Box__ConnectionsAssignment_6_3_14541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Port__NameAssignment_24572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Connection__IntPortsAssignment_44607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Connection__IntPortsAssignment_5_14646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Connection__ExtPortsAssignment_7_24685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Connection__ExtPortsAssignment_7_3_14724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__BoxInstance__BoxRefAssignment_34763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BoxInstance__InstanceNameAssignment_4_14798 = new BitSet(new long[]{0x0000000000000002L});
    }


}