// Generated from C:/Users/memoy/Desktop/desk/TestGen\TestGen.g4 by ANTLR 4.6
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
		T__9=10, T__10=11, T__11=12, T__12=13, Num=14, Scope=15, Word=16, String=17, 
		AnyC=18, WS=19, A=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "Num", "Scope", "Word", "String", "AnyC", 
		"WS", "A"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'/*'", "'*/'", "'*'", "'^'", "'$'", "'in:'", 
		"'out:'", "','", "'('", "')'", "'}'", null, null, null, null, null, null, 
		"'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "Num", "Scope", "Word", "String", "AnyC", "WS", "A"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20`\n\20\3\21\6\21"+
		"c\n\21\r\21\16\21d\3\22\3\22\6\22i\n\22\r\22\16\22j\3\22\3\22\3\23\6\23"+
		"p\n\23\r\23\16\23q\3\24\3\24\3\24\3\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26\3\2\7\3\2\62;\b\2))..\60\60\62;C\\c|\13\2%%))..\60\60\62"+
		";=>@@C\\c|\f\2%%))-.\60\60\62;=>@@C\\aac|\t\2\f\f\17\17\"\"))..\61\61"+
		"dd|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\61\3\2\2\2\7\63"+
		"\3\2\2\2\t\66\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23"+
		"C\3\2\2\2\25H\3\2\2\2\27J\3\2\2\2\31L\3\2\2\2\33N\3\2\2\2\35P\3\2\2\2"+
		"\37_\3\2\2\2!b\3\2\2\2#f\3\2\2\2%o\3\2\2\2\'s\3\2\2\2)w\3\2\2\2+,\7e\2"+
		"\2,-\7n\2\2-.\7c\2\2./\7u\2\2/\60\7u\2\2\60\4\3\2\2\2\61\62\7}\2\2\62"+
		"\6\3\2\2\2\63\64\7\61\2\2\64\65\7,\2\2\65\b\3\2\2\2\66\67\7,\2\2\678\7"+
		"\61\2\28\n\3\2\2\29:\7,\2\2:\f\3\2\2\2;<\7`\2\2<\16\3\2\2\2=>\7&\2\2>"+
		"\20\3\2\2\2?@\7k\2\2@A\7p\2\2AB\7<\2\2B\22\3\2\2\2CD\7q\2\2DE\7w\2\2E"+
		"F\7v\2\2FG\7<\2\2G\24\3\2\2\2HI\7.\2\2I\26\3\2\2\2JK\7*\2\2K\30\3\2\2"+
		"\2LM\7+\2\2M\32\3\2\2\2NO\7\177\2\2O\34\3\2\2\2PQ\t\2\2\2Q\36\3\2\2\2"+
		"RS\7r\2\2ST\7w\2\2TU\7d\2\2UV\7n\2\2VW\7k\2\2W`\7e\2\2XY\7r\2\2YZ\7t\2"+
		"\2Z[\7k\2\2[\\\7x\2\2\\]\7c\2\2]^\7v\2\2^`\7g\2\2_R\3\2\2\2_X\3\2\2\2"+
		"` \3\2\2\2ac\t\3\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\"\3\2\2"+
		"\2fh\7$\2\2gi\t\4\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2"+
		"\2lm\7$\2\2m$\3\2\2\2np\t\5\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2r&\3\2\2\2st\t\6\2\2tu\3\2\2\2uv\b\24\2\2v(\3\2\2\2wx\7~\2\2x*\3\2\2"+
		"\2\7\2_djq\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}