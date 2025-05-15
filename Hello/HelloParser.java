// Generated from Hello.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, WS=16, COMMENT=17;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_greeting = 2, RULE_simpleGreeting = 3, 
		RULE_compoundGreeting = 4, RULE_farewell = 5, RULE_question = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "greeting", "simpleGreeting", "compoundGreeting", 
			"farewell", "question"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hello'", "'!'", "'hi'", "','", "'goodbye'", "'bye'", "'how'", 
			"'are'", "'you'", "'?'", "'what'", "'is'", "'your'", "'name'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HelloParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				statement();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2282L) != 0) );
			setState(19);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public GreetingContext greeting() {
			return getRuleContext(GreetingContext.class,0);
		}
		public FarewellContext farewell() {
			return getRuleContext(FarewellContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				greeting();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				farewell();
				}
				break;
			case T__6:
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				question();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GreetingContext extends ParserRuleContext {
		public SimpleGreetingContext simpleGreeting() {
			return getRuleContext(SimpleGreetingContext.class,0);
		}
		public CompoundGreetingContext compoundGreeting() {
			return getRuleContext(CompoundGreetingContext.class,0);
		}
		public GreetingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greeting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterGreeting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitGreeting(this);
		}
	}

	public final GreetingContext greeting() throws RecognitionException {
		GreetingContext _localctx = new GreetingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_greeting);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				simpleGreeting();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				compoundGreeting();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleGreetingContext extends ParserRuleContext {
		public SimpleGreetingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleGreeting; }
	 
		public SimpleGreetingContext() { }
		public void copyFrom(SimpleGreetingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleHelloContext extends SimpleGreetingContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public SimpleHelloContext(SimpleGreetingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSimpleHello(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSimpleHello(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleHiContext extends SimpleGreetingContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public SimpleHiContext(SimpleGreetingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSimpleHi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSimpleHi(this);
		}
	}

	public final SimpleGreetingContext simpleGreeting() throws RecognitionException {
		SimpleGreetingContext _localctx = new SimpleGreetingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleGreeting);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new SimpleHelloContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(T__0);
				setState(31);
				match(ID);
				setState(32);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new SimpleHiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(T__2);
				setState(34);
				match(ID);
				setState(35);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundGreetingContext extends ParserRuleContext {
		public CompoundGreetingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundGreeting; }
	 
		public CompoundGreetingContext() { }
		public void copyFrom(CompoundGreetingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundHiContext extends CompoundGreetingContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public GreetingContext greeting() {
			return getRuleContext(GreetingContext.class,0);
		}
		public CompoundHiContext(CompoundGreetingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCompoundHi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCompoundHi(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundHelloContext extends CompoundGreetingContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public GreetingContext greeting() {
			return getRuleContext(GreetingContext.class,0);
		}
		public CompoundHelloContext(CompoundGreetingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCompoundHello(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCompoundHello(this);
		}
	}

	public final CompoundGreetingContext compoundGreeting() throws RecognitionException {
		CompoundGreetingContext _localctx = new CompoundGreetingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compoundGreeting);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new CompoundHelloContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(T__0);
				setState(39);
				match(ID);
				setState(40);
				match(T__3);
				setState(41);
				greeting();
				}
				break;
			case T__2:
				_localctx = new CompoundHiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(T__2);
				setState(43);
				match(ID);
				setState(44);
				match(T__3);
				setState(45);
				greeting();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FarewellContext extends ParserRuleContext {
		public FarewellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_farewell; }
	 
		public FarewellContext() { }
		public void copyFrom(FarewellContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleGoodbyeContext extends FarewellContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public SimpleGoodbyeContext(FarewellContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSimpleGoodbye(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSimpleGoodbye(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundGoodbyeContext extends FarewellContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public GreetingContext greeting() {
			return getRuleContext(GreetingContext.class,0);
		}
		public CompoundGoodbyeContext(FarewellContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCompoundGoodbye(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCompoundGoodbye(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleByeContext extends FarewellContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public SimpleByeContext(FarewellContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSimpleBye(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSimpleBye(this);
		}
	}

	public final FarewellContext farewell() throws RecognitionException {
		FarewellContext _localctx = new FarewellContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_farewell);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SimpleGoodbyeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(T__4);
				setState(49);
				match(ID);
				setState(50);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new SimpleByeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(T__5);
				setState(52);
				match(ID);
				setState(53);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new CompoundGoodbyeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(T__4);
				setState(55);
				match(ID);
				setState(56);
				match(T__3);
				setState(57);
				greeting();
				setState(58);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionContext extends ParserRuleContext {
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	 
		public QuestionContext() { }
		public void copyFrom(QuestionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhatIsYourNameContext extends QuestionContext {
		public WhatIsYourNameContext(QuestionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterWhatIsYourName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitWhatIsYourName(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HowAreYouContext extends QuestionContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public HowAreYouContext(QuestionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterHowAreYou(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitHowAreYou(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_question);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new HowAreYouContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(T__6);
				setState(63);
				match(T__7);
				setState(64);
				match(T__8);
				setState(65);
				match(ID);
				setState(66);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new WhatIsYourNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__10);
				setState(68);
				match(T__11);
				setState(69);
				match(T__12);
				setState(70);
				match(T__13);
				setState(71);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0011K\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u001d\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003%\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004/\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005=\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006I\b\u0006\u0001\u0006\u0000\u0000"+
		"\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000L\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004\u001c\u0001\u0000"+
		"\u0000\u0000\u0006$\u0001\u0000\u0000\u0000\b.\u0001\u0000\u0000\u0000"+
		"\n<\u0001\u0000\u0000\u0000\fH\u0001\u0000\u0000\u0000\u000e\u0010\u0003"+
		"\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001"+
		"\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014\u0005"+
		"\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0019\u0003"+
		"\u0004\u0002\u0000\u0016\u0019\u0003\n\u0005\u0000\u0017\u0019\u0003\f"+
		"\u0006\u0000\u0018\u0015\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000"+
		"\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u0003\u0001\u0000"+
		"\u0000\u0000\u001a\u001d\u0003\u0006\u0003\u0000\u001b\u001d\u0003\b\u0004"+
		"\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u0005\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000"+
		"\u0000\u001f \u0005\u000f\u0000\u0000 %\u0005\u0002\u0000\u0000!\"\u0005"+
		"\u0003\u0000\u0000\"#\u0005\u000f\u0000\u0000#%\u0005\u0002\u0000\u0000"+
		"$\u001e\u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000%\u0007\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u0001\u0000\u0000\'(\u0005\u000f\u0000\u0000"+
		"()\u0005\u0004\u0000\u0000)/\u0003\u0004\u0002\u0000*+\u0005\u0003\u0000"+
		"\u0000+,\u0005\u000f\u0000\u0000,-\u0005\u0004\u0000\u0000-/\u0003\u0004"+
		"\u0002\u0000.&\u0001\u0000\u0000\u0000.*\u0001\u0000\u0000\u0000/\t\u0001"+
		"\u0000\u0000\u000001\u0005\u0005\u0000\u000012\u0005\u000f\u0000\u0000"+
		"2=\u0005\u0002\u0000\u000034\u0005\u0006\u0000\u000045\u0005\u000f\u0000"+
		"\u00005=\u0005\u0002\u0000\u000067\u0005\u0005\u0000\u000078\u0005\u000f"+
		"\u0000\u000089\u0005\u0004\u0000\u00009:\u0003\u0004\u0002\u0000:;\u0005"+
		"\u0002\u0000\u0000;=\u0001\u0000\u0000\u0000<0\u0001\u0000\u0000\u0000"+
		"<3\u0001\u0000\u0000\u0000<6\u0001\u0000\u0000\u0000=\u000b\u0001\u0000"+
		"\u0000\u0000>?\u0005\u0007\u0000\u0000?@\u0005\b\u0000\u0000@A\u0005\t"+
		"\u0000\u0000AB\u0005\u000f\u0000\u0000BI\u0005\n\u0000\u0000CD\u0005\u000b"+
		"\u0000\u0000DE\u0005\f\u0000\u0000EF\u0005\r\u0000\u0000FG\u0005\u000e"+
		"\u0000\u0000GI\u0005\n\u0000\u0000H>\u0001\u0000\u0000\u0000HC\u0001\u0000"+
		"\u0000\u0000I\r\u0001\u0000\u0000\u0000\u0007\u0011\u0018\u001c$.<H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}