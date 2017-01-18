// Generated from AQL.g4 by ANTLR 4.5.1
package edu.common.dynamicextensions.query.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, SELECT=4, WHERE=5, NTHCHILD=6, BETWEEN=7, DATE_FMT=8, 
		MTHS_BTWN=9, YRS_BTWN=10, CURR_DATE=11, MINS_BTWN=12, DATE_RANGE=13, COUNT=14, 
		CCOUNT=15, SUM=16, CSUM=17, MIN=18, MAX=19, AVG=20, DISTINCT=21, ORDER=22, 
		ORD_DIR=23, LIMIT=24, CROSSTAB=25, CONCAT=26, CONCAT_WS=27, OR=28, AND=29, 
		PAND=30, NOT=31, ROUND=32, LP=33, RP=34, MOP=35, SOP=36, UOP=37, BOOL=38, 
		OP=39, INT=40, FLOAT=41, YEAR=42, MONTH=43, DAY=44, DIGIT=45, ID=46, FIELD=47, 
		SLITERAL=48, ESC=49, ARITH_OP=50, ERROR=51, QUOTE=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "WS", "SELECT", "WHERE", "NTHCHILD", "BETWEEN", "DATE_FMT", 
		"MTHS_BTWN", "YRS_BTWN", "CURR_DATE", "MINS_BTWN", "DATE_RANGE", "COUNT", 
		"CCOUNT", "SUM", "CSUM", "MIN", "MAX", "AVG", "DISTINCT", "ORDER", "ORD_DIR", 
		"LIMIT", "CROSSTAB", "CONCAT", "CONCAT_WS", "OR", "AND", "PAND", "NOT", 
		"ROUND", "LP", "RP", "MOP", "SOP", "UOP", "BOOL", "OP", "INT", "FLOAT", 
		"YEAR", "MONTH", "DAY", "DIGIT", "ID", "FIELD", "SLITERAL", "ESC", "ARITH_OP", 
		"ERROR", "SGUTS", "QUOTE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'as'", null, "'select'", "'where'", "'nthchild'", "'between'", 
		"'date_format'", "'months_between'", "'years_between'", "'current_date'", 
		"'minutes_between'", "'date_range'", "'count'", "'c_count'", "'sum'", 
		"'c_sum'", "'min'", "'max'", "'avg'", "'distinct'", "'order by'", null, 
		"'limit'", "'crosstab'", "'concat'", "'concat_ws'", "'or'", "'and'", "'pand'", 
		"'not'", "'round'", "'('", "')'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "WS", "SELECT", "WHERE", "NTHCHILD", "BETWEEN", "DATE_FMT", 
		"MTHS_BTWN", "YRS_BTWN", "CURR_DATE", "MINS_BTWN", "DATE_RANGE", "COUNT", 
		"CCOUNT", "SUM", "CSUM", "MIN", "MAX", "AVG", "DISTINCT", "ORDER", "ORD_DIR", 
		"LIMIT", "CROSSTAB", "CONCAT", "CONCAT_WS", "OR", "AND", "PAND", "NOT", 
		"ROUND", "LP", "RP", "MOP", "SOP", "UOP", "BOOL", "OP", "INT", "FLOAT", 
		"YEAR", "MONTH", "DAY", "DIGIT", "ID", "FIELD", "SLITERAL", "ESC", "ARITH_OP", 
		"ERROR", "QUOTE"
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


	public AQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u020c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\3\3\4\6\4t\n\4\r\4\16\4u\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u0126\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u016a\n$\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%"+
		"\u0188\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&"+
		"\u019d\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01a8\n\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01b6\n(\3)\5)\u01b9\n)\3)\6)\u01bc\n)\r"+
		")\16)\u01bd\3*\5*\u01c1\n*\3*\6*\u01c4\n*\r*\16*\u01c5\3*\3*\6*\u01ca"+
		"\n*\r*\16*\u01cb\3+\6+\u01cf\n+\r+\16+\u01d0\3+\3+\3,\6,\u01d6\n,\r,\16"+
		",\u01d7\3,\3,\3-\6-\u01dd\n-\r-\16-\u01de\3-\3-\3.\3.\3/\3/\7/\u01e7\n"+
		"/\f/\16/\u01ea\13/\3\60\3\60\5\60\u01ee\n\60\3\60\3\60\3\60\3\60\7\60"+
		"\u01f4\n\60\f\60\16\60\u01f7\13\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\7\65\u0206\n\65\f\65\16\65\u0209\13\65"+
		"\3\66\3\66\2\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\2k\66\3\2\13\5\2\13\f\17\17\"\"\4\2>>@@\4\2[[{{\4\2OOoo\4\2FFff"+
		"\5\2C\\aac|\7\2\62;AAC\\aac|\4\2$$^^\5\2,-//\61\61\u0224\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7s\3\2\2\2\t"+
		"y\3\2\2\2\13\u0080\3\2\2\2\r\u0086\3\2\2\2\17\u008f\3\2\2\2\21\u0097\3"+
		"\2\2\2\23\u00a3\3\2\2\2\25\u00b2\3\2\2\2\27\u00c0\3\2\2\2\31\u00cd\3\2"+
		"\2\2\33\u00dd\3\2\2\2\35\u00e8\3\2\2\2\37\u00ee\3\2\2\2!\u00f6\3\2\2\2"+
		"#\u00fa\3\2\2\2%\u0100\3\2\2\2\'\u0104\3\2\2\2)\u0108\3\2\2\2+\u010c\3"+
		"\2\2\2-\u0115\3\2\2\2/\u0125\3\2\2\2\61\u0127\3\2\2\2\63\u012d\3\2\2\2"+
		"\65\u0136\3\2\2\2\67\u013d\3\2\2\29\u0147\3\2\2\2;\u014a\3\2\2\2=\u014e"+
		"\3\2\2\2?\u0153\3\2\2\2A\u0157\3\2\2\2C\u015d\3\2\2\2E\u015f\3\2\2\2G"+
		"\u0169\3\2\2\2I\u0187\3\2\2\2K\u019c\3\2\2\2M\u01a7\3\2\2\2O\u01b5\3\2"+
		"\2\2Q\u01b8\3\2\2\2S\u01c0\3\2\2\2U\u01ce\3\2\2\2W\u01d5\3\2\2\2Y\u01dc"+
		"\3\2\2\2[\u01e2\3\2\2\2]\u01e4\3\2\2\2_\u01ed\3\2\2\2a\u01f8\3\2\2\2c"+
		"\u01fc\3\2\2\2e\u01ff\3\2\2\2g\u0201\3\2\2\2i\u0207\3\2\2\2k\u020a\3\2"+
		"\2\2mn\7.\2\2n\4\3\2\2\2op\7c\2\2pq\7u\2\2q\6\3\2\2\2rt\t\2\2\2sr\3\2"+
		"\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\4\2\2x\b\3\2\2\2yz\7"+
		"u\2\2z{\7g\2\2{|\7n\2\2|}\7g\2\2}~\7e\2\2~\177\7v\2\2\177\n\3\2\2\2\u0080"+
		"\u0081\7y\2\2\u0081\u0082\7j\2\2\u0082\u0083\7g\2\2\u0083\u0084\7t\2\2"+
		"\u0084\u0085\7g\2\2\u0085\f\3\2\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v"+
		"\2\2\u0088\u0089\7j\2\2\u0089\u008a\7e\2\2\u008a\u008b\7j\2\2\u008b\u008c"+
		"\7k\2\2\u008c\u008d\7n\2\2\u008d\u008e\7f\2\2\u008e\16\3\2\2\2\u008f\u0090"+
		"\7d\2\2\u0090\u0091\7g\2\2\u0091\u0092\7v\2\2\u0092\u0093\7y\2\2\u0093"+
		"\u0094\7g\2\2\u0094\u0095\7g\2\2\u0095\u0096\7p\2\2\u0096\20\3\2\2\2\u0097"+
		"\u0098\7f\2\2\u0098\u0099\7c\2\2\u0099\u009a\7v\2\2\u009a\u009b\7g\2\2"+
		"\u009b\u009c\7a\2\2\u009c\u009d\7h\2\2\u009d\u009e\7q\2\2\u009e\u009f"+
		"\7t\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"\22\3\2\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7a\2\2"+
		"\u00aa\u00ab\7d\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae"+
		"\7y\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7p\2\2\u00b1"+
		"\24\3\2\2\2\u00b2\u00b3\7{\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7c\2\2\u00b5"+
		"\u00b6\7t\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7a\2\2\u00b8\u00b9\7d\2\2"+
		"\u00b9\u00ba\7g\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7y\2\2\u00bc\u00bd"+
		"\7g\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2\u00bf\26\3\2\2\2\u00c0\u00c1"+
		"\7e\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7a\2\2"+
		"\u00c8\u00c9\7f\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\30\3\2\2\2\u00cd\u00ce\7o\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\u00d4\7u\2\2\u00d4\u00d5\7a\2\2\u00d5\u00d6\7d\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7\u00d8\7v\2\2\u00d8\u00d9\7y\2\2\u00d9\u00da\7g\2\2\u00da\u00db"+
		"\7g\2\2\u00db\u00dc\7p\2\2\u00dc\32\3\2\2\2\u00dd\u00de\7f\2\2\u00de\u00df"+
		"\7c\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7a\2\2\u00e2"+
		"\u00e3\7t\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7i\2\2"+
		"\u00e6\u00e7\7g\2\2\u00e7\34\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7"+
		"q\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7v\2\2\u00ed\36"+
		"\3\2\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7a\2\2\u00f0\u00f1\7e\2\2\u00f1"+
		"\u00f2\7q\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2"+
		"\u00f5 \3\2\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7o\2"+
		"\2\u00f9\"\3\2\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7a\2\2\u00fc\u00fd\7"+
		"u\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7o\2\2\u00ff$\3\2\2\2\u0100\u0101"+
		"\7o\2\2\u0101\u0102\7k\2\2\u0102\u0103\7p\2\2\u0103&\3\2\2\2\u0104\u0105"+
		"\7o\2\2\u0105\u0106\7c\2\2\u0106\u0107\7z\2\2\u0107(\3\2\2\2\u0108\u0109"+
		"\7c\2\2\u0109\u010a\7x\2\2\u010a\u010b\7i\2\2\u010b*\3\2\2\2\u010c\u010d"+
		"\7f\2\2\u010d\u010e\7k\2\2\u010e\u010f\7u\2\2\u010f\u0110\7v\2\2\u0110"+
		"\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7e\2\2\u0113\u0114\7v\2\2"+
		"\u0114,\3\2\2\2\u0115\u0116\7q\2\2\u0116\u0117\7t\2\2\u0117\u0118\7f\2"+
		"\2\u0118\u0119\7g\2\2\u0119\u011a\7t\2\2\u011a\u011b\7\"\2\2\u011b\u011c"+
		"\7d\2\2\u011c\u011d\7{\2\2\u011d.\3\2\2\2\u011e\u011f\7f\2\2\u011f\u0120"+
		"\7g\2\2\u0120\u0121\7u\2\2\u0121\u0126\7e\2\2\u0122\u0123\7c\2\2\u0123"+
		"\u0124\7u\2\2\u0124\u0126\7e\2\2\u0125\u011e\3\2\2\2\u0125\u0122\3\2\2"+
		"\2\u0126\60\3\2\2\2\u0127\u0128\7n\2\2\u0128\u0129\7k\2\2\u0129\u012a"+
		"\7o\2\2\u012a\u012b\7k\2\2\u012b\u012c\7v\2\2\u012c\62\3\2\2\2\u012d\u012e"+
		"\7e\2\2\u012e\u012f\7t\2\2\u012f\u0130\7q\2\2\u0130\u0131\7u\2\2\u0131"+
		"\u0132\7u\2\2\u0132\u0133\7v\2\2\u0133\u0134\7c\2\2\u0134\u0135\7d\2\2"+
		"\u0135\64\3\2\2\2\u0136\u0137\7e\2\2\u0137\u0138\7q\2\2\u0138\u0139\7"+
		"p\2\2\u0139\u013a\7e\2\2\u013a\u013b\7c\2\2\u013b\u013c\7v\2\2\u013c\66"+
		"\3\2\2\2\u013d\u013e\7e\2\2\u013e\u013f\7q\2\2\u013f\u0140\7p\2\2\u0140"+
		"\u0141\7e\2\2\u0141\u0142\7c\2\2\u0142\u0143\7v\2\2\u0143\u0144\7a\2\2"+
		"\u0144\u0145\7y\2\2\u0145\u0146\7u\2\2\u01468\3\2\2\2\u0147\u0148\7q\2"+
		"\2\u0148\u0149\7t\2\2\u0149:\3\2\2\2\u014a\u014b\7c\2\2\u014b\u014c\7"+
		"p\2\2\u014c\u014d\7f\2\2\u014d<\3\2\2\2\u014e\u014f\7r\2\2\u014f\u0150"+
		"\7c\2\2\u0150\u0151\7p\2\2\u0151\u0152\7f\2\2\u0152>\3\2\2\2\u0153\u0154"+
		"\7p\2\2\u0154\u0155\7q\2\2\u0155\u0156\7v\2\2\u0156@\3\2\2\2\u0157\u0158"+
		"\7t\2\2\u0158\u0159\7q\2\2\u0159\u015a\7w\2\2\u015a\u015b\7p\2\2\u015b"+
		"\u015c\7f\2\2\u015cB\3\2\2\2\u015d\u015e\7*\2\2\u015eD\3\2\2\2\u015f\u0160"+
		"\7+\2\2\u0160F\3\2\2\2\u0161\u0162\7k\2\2\u0162\u016a\7p\2\2\u0163\u0164"+
		"\7p\2\2\u0164\u0165\7q\2\2\u0165\u0166\7v\2\2\u0166\u0167\7\"\2\2\u0167"+
		"\u0168\7k\2\2\u0168\u016a\7p\2\2\u0169\u0161\3\2\2\2\u0169\u0163\3\2\2"+
		"\2\u016aH\3\2\2\2\u016b\u016c\7e\2\2\u016c\u016d\7q\2\2\u016d\u016e\7"+
		"p\2\2\u016e\u016f\7v\2\2\u016f\u0170\7c\2\2\u0170\u0171\7k\2\2\u0171\u0172"+
		"\7p\2\2\u0172\u0188\7u\2\2\u0173\u0174\7u\2\2\u0174\u0175\7v\2\2\u0175"+
		"\u0176\7c\2\2\u0176\u0177\7t\2\2\u0177\u0178\7v\2\2\u0178\u0179\7u\2\2"+
		"\u0179\u017a\7\"\2\2\u017a\u017b\7y\2\2\u017b\u017c\7k\2\2\u017c\u017d"+
		"\7v\2\2\u017d\u0188\7j\2\2\u017e\u017f\7g\2\2\u017f\u0180\7p\2\2\u0180"+
		"\u0181\7f\2\2\u0181\u0182\7u\2\2\u0182\u0183\7\"\2\2\u0183\u0184\7y\2"+
		"\2\u0184\u0185\7k\2\2\u0185\u0186\7v\2\2\u0186\u0188\7j\2\2\u0187\u016b"+
		"\3\2\2\2\u0187\u0173\3\2\2\2\u0187\u017e\3\2\2\2\u0188J\3\2\2\2\u0189"+
		"\u018a\7g\2\2\u018a\u018b\7z\2\2\u018b\u018c\7k\2\2\u018c\u018d\7u\2\2"+
		"\u018d\u018e\7v\2\2\u018e\u019d\7u\2\2\u018f\u0190\7p\2\2\u0190\u0191"+
		"\7q\2\2\u0191\u0192\7v\2\2\u0192\u0193\7\"\2\2\u0193\u0194\7g\2\2\u0194"+
		"\u0195\7z\2\2\u0195\u0196\7k\2\2\u0196\u0197\7u\2\2\u0197\u0198\7v\2\2"+
		"\u0198\u019d\7u\2\2\u0199\u019a\7c\2\2\u019a\u019b\7p\2\2\u019b\u019d"+
		"\7{\2\2\u019c\u0189\3\2\2\2\u019c\u018f\3\2\2\2\u019c\u0199\3\2\2\2\u019d"+
		"L\3\2\2\2\u019e\u019f\7v\2\2\u019f\u01a0\7t\2\2\u01a0\u01a1\7w\2\2\u01a1"+
		"\u01a8\7g\2\2\u01a2\u01a3\7h\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7n\2\2"+
		"\u01a5\u01a6\7u\2\2\u01a6\u01a8\7g\2\2\u01a7\u019e\3\2\2\2\u01a7\u01a2"+
		"\3\2\2\2\u01a8N\3\2\2\2\u01a9\u01b6\t\3\2\2\u01aa\u01ab\7@\2\2\u01ab\u01b6"+
		"\7?\2\2\u01ac\u01ad\7>\2\2\u01ad\u01b6\7?\2\2\u01ae\u01b6\7?\2\2\u01af"+
		"\u01b0\7#\2\2\u01b0\u01b6\7?\2\2\u01b1\u01b2\7n\2\2\u01b2\u01b3\7k\2\2"+
		"\u01b3\u01b4\7m\2\2\u01b4\u01b6\7g\2\2\u01b5\u01a9\3\2\2\2\u01b5\u01aa"+
		"\3\2\2\2\u01b5\u01ac\3\2\2\2\u01b5\u01ae\3\2\2\2\u01b5\u01af\3\2\2\2\u01b5"+
		"\u01b1\3\2\2\2\u01b6P\3\2\2\2\u01b7\u01b9\7/\2\2\u01b8\u01b7\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01bc\5[.\2\u01bb\u01ba\3\2\2"+
		"\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01beR"+
		"\3\2\2\2\u01bf\u01c1\7/\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c3\3\2\2\2\u01c2\u01c4\5[.\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2"+
		"\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9"+
		"\7\60\2\2\u01c8\u01ca\5[.\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01ccT\3\2\2\2\u01cd\u01cf\5[.\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\t\4\2\2\u01d3V\3\2\2\2\u01d4\u01d6"+
		"\5[.\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\t\5\2\2\u01daX\3\2\2\2"+
		"\u01db\u01dd\5[.\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\t\6\2\2\u01e1"+
		"Z\3\2\2\2\u01e2\u01e3\4\62;\2\u01e3\\\3\2\2\2\u01e4\u01e8\t\7\2\2\u01e5"+
		"\u01e7\t\b\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9^\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee"+
		"\5Q)\2\u01ec\u01ee\5]/\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f0\7\60\2\2\u01f0\u01f5\5]/\2\u01f1\u01f2\7\60"+
		"\2\2\u01f2\u01f4\5]/\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6`\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u01f9\7$\2\2\u01f9\u01fa\5i\65\2\u01fa\u01fb\7$\2\2\u01fbb\3\2\2\2\u01fc"+
		"\u01fd\7^\2\2\u01fd\u01fe\t\t\2\2\u01fed\3\2\2\2\u01ff\u0200\t\n\2\2\u0200"+
		"f\3\2\2\2\u0201\u0202\13\2\2\2\u0202h\3\2\2\2\u0203\u0206\5c\62\2\u0204"+
		"\u0206\n\t\2\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2"+
		"\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208j\3\2\2\2\u0209\u0207"+
		"\3\2\2\2\u020a\u020b\7$\2\2\u020bl\3\2\2\2\27\2u\u0125\u0169\u0187\u019c"+
		"\u01a7\u01b5\u01b8\u01bd\u01c0\u01c5\u01cb\u01d0\u01d7\u01de\u01e8\u01ed"+
		"\u01f5\u0205\u0207\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}