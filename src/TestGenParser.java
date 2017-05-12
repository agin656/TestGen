// Generated from C:/Users/memoy/Desktop/desk/TestGen\TestGen.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestGenParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, WS=14, Num=15, Scope=16, Word=17, 
		String=18, A=19;
	public static final int
		RULE_s = 0, RULE_a = 1, RULE_className = 2, RULE_ts = 3, RULE_t = 4, RULE_comment = 5, 
		RULE_comment1 = 6, RULE_func1 = 7, RULE_lines = 8, RULE_line = 9, RULE_in = 10, 
		RULE_out = 11, RULE_inparams = 12, RULE_outparams = 13, RULE_params = 14, 
		RULE_param = 15, RULE_func = 16, RULE_funcParams = 17, RULE_funcParam = 18, 
		RULE_body = 19, RULE_funcname = 20;
	public static final String[] ruleNames = {
		"s", "a", "className", "ts", "t", "comment", "comment1", "func1", "lines", 
		"line", "in", "out", "inparams", "outparams", "params", "param", "func", 
		"funcParams", "funcParam", "body", "funcname"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'}'", "'class'", "'{'", "'/*'", "'*/'", "'*'", "'^'", "'$'", "'in:'", 
		"'out:'", "','", "'('", "'){'", null, null, null, null, null, "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "WS", "Num", "Scope", "Word", "String", "A"
	};
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
	public String getGrammarFileName() { return "TestGen.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TestGenParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TsContext ts() {
			return getRuleContext(TsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TestGenParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			a();
			setState(43);
			ts();
			setState(44);
			match(T__0);
			setState(45);
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

	public static class AContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__1);
			setState(48);
			className();
			setState(49);
			match(T__2);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(TestGenParser.Word, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(Word);
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

	public static class TsContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TsContext ts() {
			return getRuleContext(TsContext.class,0);
		}
		public Func1Context func1() {
			return getRuleContext(Func1Context.class,0);
		}
		public TsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterTs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitTs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitTs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsContext ts() throws RecognitionException {
		TsContext _localctx = new TsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ts);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				t();
				setState(54);
				ts();
				}
				break;
			case Scope:
			case Word:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				func1();
				setState(57);
				ts();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			comment();
			setState(63);
			func();
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

	public static class CommentContext extends ParserRuleContext {
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__3);
			setState(66);
			lines();
			setState(67);
			match(T__4);
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

	public static class Comment1Context extends ParserRuleContext {
		public Comment1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterComment1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitComment1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitComment1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comment1Context comment1() throws RecognitionException {
		Comment1Context _localctx = new Comment1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_comment1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__3);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(70);
					matchWildcard();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(76);
			match(T__4);
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

	public static class Func1Context extends ParserRuleContext {
		public TerminalNode Word() { return getToken(TestGenParser.Word, 0); }
		public TerminalNode Scope() { return getToken(TestGenParser.Scope, 0); }
		public Func1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterFunc1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitFunc1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitFunc1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func1Context func1() throws RecognitionException {
		Func1Context _localctx = new Func1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_func1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Scope) {
				{
				setState(78);
				match(Scope);
				}
			}

			setState(81);
			match(Word);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(82);
					matchWildcard();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
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

	public static class LinesContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitLines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lines);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				line();
				setState(89);
				lines();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LineContext extends ParserRuleContext {
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(94);
				match(T__5);
				}
			}

			setState(97);
			match(T__6);
			setState(98);
			in();
			setState(99);
			match(A);
			setState(100);
			out();
			setState(101);
			match(T__7);
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

	public static class InContext extends ParserRuleContext {
		public InparamsContext inparams() {
			return getRuleContext(InparamsContext.class,0);
		}
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__8);
			setState(104);
			inparams();
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

	public static class OutContext extends ParserRuleContext {
		public OutparamsContext outparams() {
			return getRuleContext(OutparamsContext.class,0);
		}
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__9);
			setState(107);
			outparams();
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

	public static class InparamsContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public InparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterInparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitInparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitInparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InparamsContext inparams() throws RecognitionException {
		InparamsContext _localctx = new InparamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			params();
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

	public static class OutparamsContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public OutparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterOutparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitOutparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitOutparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutparamsContext outparams() throws RecognitionException {
		OutparamsContext _localctx = new OutparamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_outparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			params();
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

	public static class ParamsContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_params);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				param();
				setState(114);
				match(T__10);
				setState(115);
				params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				param();
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(TestGenParser.Num, 0); }
		public TerminalNode String() { return getToken(TestGenParser.String, 0); }
		public TerminalNode Word() { return getToken(TestGenParser.Word, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Num) | (1L << Word) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(TestGenParser.Word, 0); }
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncParamsContext funcParams() {
			return getRuleContext(FuncParamsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode Scope() { return getToken(TestGenParser.Scope, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Scope) {
				{
				setState(122);
				match(Scope);
				}
			}

			setState(125);
			match(Word);
			setState(126);
			funcname();
			setState(127);
			match(T__11);
			setState(128);
			funcParams();
			setState(129);
			body();
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

	public static class FuncParamsContext extends ParserRuleContext {
		public FuncParamContext funcParam() {
			return getRuleContext(FuncParamContext.class,0);
		}
		public FuncParamsContext funcParams() {
			return getRuleContext(FuncParamsContext.class,0);
		}
		public FuncParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterFuncParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitFuncParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitFuncParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamsContext funcParams() throws RecognitionException {
		FuncParamsContext _localctx = new FuncParamsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcParams);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				funcParam();
				setState(132);
				match(T__10);
				setState(133);
				funcParams();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				funcParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FuncParamContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(TestGenParser.Word, 0); }
		public FuncParamContext funcParam() {
			return getRuleContext(FuncParamContext.class,0);
		}
		public TerminalNode Num() { return getToken(TestGenParser.Num, 0); }
		public TerminalNode String() { return getToken(TestGenParser.String, 0); }
		public FuncParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterFuncParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitFuncParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitFuncParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamContext funcParam() throws RecognitionException {
		FuncParamContext _localctx = new FuncParamContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcParam);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Word:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(Word);
				setState(140);
				funcParam();
				}
				break;
			case Num:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(Num);
				setState(142);
				funcParam();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(String);
				setState(144);
				funcParam();
				}
				break;
			case T__10:
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class BodyContext extends ParserRuleContext {
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__12);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(149);
					matchWildcard();
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(155);
			match(T__0);
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

	public static class FuncnameContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(TestGenParser.Word, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGenListener ) ((TestGenListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGenVisitor ) return ((TestGenVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Word);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u00a2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\7\bJ\n\b\f\b\16\bM\13\b\3\b\3\b\3\t\5\tR\n\t\3\t\3"+
		"\t\7\tV\n\t\f\t\16\tY\13\t\3\n\3\n\3\n\3\n\5\n_\n\n\3\13\5\13b\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\5\20y\n\20\3\21\3\21\3\22\5\22~\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u008c\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0095\n\24\3\25\3\25\7\25\u0099"+
		"\n\25\f\25\16\25\u009c\13\25\3\25\3\25\3\26\3\26\3\26\5KW\u009a\2\27\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\4\2\21\21\23\24\u009b"+
		"\2,\3\2\2\2\4\61\3\2\2\2\6\65\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\fC\3\2\2\2"+
		"\16G\3\2\2\2\20Q\3\2\2\2\22^\3\2\2\2\24a\3\2\2\2\26i\3\2\2\2\30l\3\2\2"+
		"\2\32o\3\2\2\2\34q\3\2\2\2\36x\3\2\2\2 z\3\2\2\2\"}\3\2\2\2$\u008b\3\2"+
		"\2\2&\u0094\3\2\2\2(\u0096\3\2\2\2*\u009f\3\2\2\2,-\5\4\3\2-.\5\b\5\2"+
		"./\7\3\2\2/\60\7\2\2\3\60\3\3\2\2\2\61\62\7\4\2\2\62\63\5\6\4\2\63\64"+
		"\7\5\2\2\64\5\3\2\2\2\65\66\7\23\2\2\66\7\3\2\2\2\678\5\n\6\289\5\b\5"+
		"\29?\3\2\2\2:;\5\20\t\2;<\5\b\5\2<?\3\2\2\2=?\3\2\2\2>\67\3\2\2\2>:\3"+
		"\2\2\2>=\3\2\2\2?\t\3\2\2\2@A\5\f\7\2AB\5\"\22\2B\13\3\2\2\2CD\7\6\2\2"+
		"DE\5\22\n\2EF\7\7\2\2F\r\3\2\2\2GK\7\6\2\2HJ\13\2\2\2IH\3\2\2\2JM\3\2"+
		"\2\2KL\3\2\2\2KI\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\7\2\2O\17\3\2\2\2PR\7"+
		"\22\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2SW\7\23\2\2TV\13\2\2\2UT\3\2\2\2"+
		"VY\3\2\2\2WX\3\2\2\2WU\3\2\2\2X\21\3\2\2\2YW\3\2\2\2Z[\5\24\13\2[\\\5"+
		"\22\n\2\\_\3\2\2\2]_\3\2\2\2^Z\3\2\2\2^]\3\2\2\2_\23\3\2\2\2`b\7\b\2\2"+
		"a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\t\2\2de\5\26\f\2ef\7\25\2\2fg\5\30"+
		"\r\2gh\7\n\2\2h\25\3\2\2\2ij\7\13\2\2jk\5\32\16\2k\27\3\2\2\2lm\7\f\2"+
		"\2mn\5\34\17\2n\31\3\2\2\2op\5\36\20\2p\33\3\2\2\2qr\5\36\20\2r\35\3\2"+
		"\2\2st\5 \21\2tu\7\r\2\2uv\5\36\20\2vy\3\2\2\2wy\5 \21\2xs\3\2\2\2xw\3"+
		"\2\2\2y\37\3\2\2\2z{\t\2\2\2{!\3\2\2\2|~\7\22\2\2}|\3\2\2\2}~\3\2\2\2"+
		"~\177\3\2\2\2\177\u0080\7\23\2\2\u0080\u0081\5*\26\2\u0081\u0082\7\16"+
		"\2\2\u0082\u0083\5$\23\2\u0083\u0084\5(\25\2\u0084#\3\2\2\2\u0085\u0086"+
		"\5&\24\2\u0086\u0087\7\r\2\2\u0087\u0088\5$\23\2\u0088\u008c\3\2\2\2\u0089"+
		"\u008c\5&\24\2\u008a\u008c\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008a\3\2\2\2\u008c%\3\2\2\2\u008d\u008e\7\23\2\2\u008e\u0095"+
		"\5&\24\2\u008f\u0090\7\21\2\2\u0090\u0095\5&\24\2\u0091\u0092\7\24\2\2"+
		"\u0092\u0095\5&\24\2\u0093\u0095\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008f"+
		"\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0093\3\2\2\2\u0095\'\3\2\2\2\u0096"+
		"\u009a\7\17\2\2\u0097\u0099\13\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7\3\2\2\u009e)\3\2\2\2\u009f\u00a0\7\23\2\2"+
		"\u00a0+\3\2\2\2\r>KQW^ax}\u008b\u0094\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}