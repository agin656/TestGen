// Generated from C:/Users/memoy/Desktop/TestGen\TestGen.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestGenLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, Scope=15, Word=16, String=17, 
		AnyC=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "Scope", "Word", "String", 
		"AnyC", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'/*'", "'*/'", "'*'", "'^'", "'|'", "'$'", "'in:'", 
		"'out:'", "','", "'('", "')'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Scope", "Word", "String", "AnyC", "WS"
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


	public TestGenLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TestGen.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20^\n\20\3\21\6\21a\n\21\r"+
		"\21\16\21b\3\22\3\22\6\22g\n\22\r\22\16\22h\3\22\3\22\3\23\6\23n\n\23"+
		"\r\23\16\23o\3\24\3\24\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\6\b"+
		"\2))..\60\60\62;C\\c|\13\2%%))..\60\60\62;=>@@C\\c|\f\2%%))-.\60\60\62"+
		";=>@@C\\aac|\t\2\f\f\17\17\"\"))..\61\61ddx\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\3)\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\64\3\2\2\2\13\67\3\2\2\2\r9\3"+
		"\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25C\3\2\2\2\27H\3\2\2\2\31"+
		"J\3\2\2\2\33L\3\2\2\2\35N\3\2\2\2\37]\3\2\2\2!`\3\2\2\2#d\3\2\2\2%m\3"+
		"\2\2\2\'q\3\2\2\2)*\7e\2\2*+\7n\2\2+,\7c\2\2,-\7u\2\2-.\7u\2\2.\4\3\2"+
		"\2\2/\60\7}\2\2\60\6\3\2\2\2\61\62\7\61\2\2\62\63\7,\2\2\63\b\3\2\2\2"+
		"\64\65\7,\2\2\65\66\7\61\2\2\66\n\3\2\2\2\678\7,\2\28\f\3\2\2\29:\7`\2"+
		"\2:\16\3\2\2\2;<\7~\2\2<\20\3\2\2\2=>\7&\2\2>\22\3\2\2\2?@\7k\2\2@A\7"+
		"p\2\2AB\7<\2\2B\24\3\2\2\2CD\7q\2\2DE\7w\2\2EF\7v\2\2FG\7<\2\2G\26\3\2"+
		"\2\2HI\7.\2\2I\30\3\2\2\2JK\7*\2\2K\32\3\2\2\2LM\7+\2\2M\34\3\2\2\2NO"+
		"\7\177\2\2O\36\3\2\2\2PQ\7r\2\2QR\7w\2\2RS\7d\2\2ST\7n\2\2TU\7k\2\2U^"+
		"\7e\2\2VW\7r\2\2WX\7t\2\2XY\7k\2\2YZ\7x\2\2Z[\7c\2\2[\\\7v\2\2\\^\7g\2"+
		"\2]P\3\2\2\2]V\3\2\2\2^ \3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2"+
		"\2bc\3\2\2\2c\"\3\2\2\2df\7$\2\2eg\t\3\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2"+
		"\2hi\3\2\2\2ij\3\2\2\2jk\7$\2\2k$\3\2\2\2ln\t\4\2\2ml\3\2\2\2no\3\2\2"+
		"\2om\3\2\2\2op\3\2\2\2p&\3\2\2\2qr\t\5\2\2rs\3\2\2\2st\b\24\2\2t(\3\2"+
		"\2\2\7\2]bho\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}