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
		T__0=1, T__1=2, WS=3, SELECT=4, WHERE=5, NTHCHILD=6, BETWEEN=7, MTHS_BTWN=8, 
		YRS_BTWN=9, CURR_DATE=10, MINS_BTWN=11, COUNT=12, SUM=13, MIN=14, MAX=15, 
		AVG=16, DISTINCT=17, ORDER=18, ORD_DIR=19, LIMIT=20, CROSSTAB=21, CONCAT=22, 
		OR=23, AND=24, PAND=25, NOT=26, ROUND=27, LP=28, RP=29, MOP=30, SOP=31, 
		UOP=32, BOOL=33, OP=34, INT=35, FLOAT=36, YEAR=37, MONTH=38, DAY=39, DIGIT=40, 
		ID=41, FIELD=42, SLITERAL=43, ESC=44, ARITH_OP=45, ERROR=46, QUOTE=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "WS", "SELECT", "WHERE", "NTHCHILD", "BETWEEN", "MTHS_BTWN", 
		"YRS_BTWN", "CURR_DATE", "MINS_BTWN", "COUNT", "SUM", "MIN", "MAX", "AVG", 
		"DISTINCT", "ORDER", "ORD_DIR", "LIMIT", "CROSSTAB", "CONCAT", "OR", "AND", 
		"PAND", "NOT", "ROUND", "LP", "RP", "MOP", "SOP", "UOP", "BOOL", "OP", 
		"INT", "FLOAT", "YEAR", "MONTH", "DAY", "DIGIT", "ID", "FIELD", "SLITERAL", 
		"ESC", "ARITH_OP", "ERROR", "SGUTS", "QUOTE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'as'", null, "'select'", "'where'", "'nthchild'", "'between'", 
		"'months_between'", "'years_between'", "'current_date'", "'minutes_between'", 
		"'count'", "'sum'", "'min'", "'max'", "'avg'", "'distinct'", "'order by'", 
		null, "'limit'", "'crosstab'", "'concat'", "'or'", "'and'", "'pand'", 
		"'not'", "'round'", "'('", "')'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "WS", "SELECT", "WHERE", "NTHCHILD", "BETWEEN", "MTHS_BTWN", 
		"YRS_BTWN", "CURR_DATE", "MINS_BTWN", "COUNT", "SUM", "MIN", "MAX", "AVG", 
		"DISTINCT", "ORDER", "ORD_DIR", "LIMIT", "CROSSTAB", "CONCAT", "OR", "AND", 
		"PAND", "NOT", "ROUND", "LP", "RP", "MOP", "SOP", "UOP", "BOOL", "OP", 
		"INT", "FLOAT", "YEAR", "MONTH", "DAY", "DIGIT", "ID", "FIELD", "SLITERAL", 
		"ESC", "ARITH_OP", "ERROR", "QUOTE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u01d3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\6\4j\n\4\r\4\16\4k\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f7"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0131\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u014f\n \3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0164\n!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u016f\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u017d"+
		"\n#\3$\5$\u0180\n$\3$\6$\u0183\n$\r$\16$\u0184\3%\5%\u0188\n%\3%\6%\u018b"+
		"\n%\r%\16%\u018c\3%\3%\6%\u0191\n%\r%\16%\u0192\3&\6&\u0196\n&\r&\16&"+
		"\u0197\3&\3&\3\'\6\'\u019d\n\'\r\'\16\'\u019e\3\'\3\'\3(\6(\u01a4\n(\r"+
		"(\16(\u01a5\3(\3(\3)\3)\3*\3*\7*\u01ae\n*\f*\16*\u01b1\13*\3+\3+\5+\u01b5"+
		"\n+\3+\3+\3+\3+\7+\u01bb\n+\f+\16+\u01be\13+\3,\3,\3,\3,\3-\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\7\60\u01cd\n\60\f\60\16\60\u01d0\13\60\3\61\3\61\2\2"+
		"\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\61\3\2\13\5\2\13\f\17\17"+
		"\"\"\4\2>>@@\4\2[[{{\4\2OOoo\4\2FFff\5\2C\\aac|\7\2\62;AAC\\aac|\4\2$"+
		"$^^\5\2,-//\61\61\u01eb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7i\3\2\2\2\to\3\2\2\2\13v\3\2"+
		"\2\2\r|\3\2\2\2\17\u0085\3\2\2\2\21\u008d\3\2\2\2\23\u009c\3\2\2\2\25"+
		"\u00aa\3\2\2\2\27\u00b7\3\2\2\2\31\u00c7\3\2\2\2\33\u00cd\3\2\2\2\35\u00d1"+
		"\3\2\2\2\37\u00d5\3\2\2\2!\u00d9\3\2\2\2#\u00dd\3\2\2\2%\u00e6\3\2\2\2"+
		"\'\u00f6\3\2\2\2)\u00f8\3\2\2\2+\u00fe\3\2\2\2-\u0107\3\2\2\2/\u010e\3"+
		"\2\2\2\61\u0111\3\2\2\2\63\u0115\3\2\2\2\65\u011a\3\2\2\2\67\u011e\3\2"+
		"\2\29\u0124\3\2\2\2;\u0126\3\2\2\2=\u0130\3\2\2\2?\u014e\3\2\2\2A\u0163"+
		"\3\2\2\2C\u016e\3\2\2\2E\u017c\3\2\2\2G\u017f\3\2\2\2I\u0187\3\2\2\2K"+
		"\u0195\3\2\2\2M\u019c\3\2\2\2O\u01a3\3\2\2\2Q\u01a9\3\2\2\2S\u01ab\3\2"+
		"\2\2U\u01b4\3\2\2\2W\u01bf\3\2\2\2Y\u01c3\3\2\2\2[\u01c6\3\2\2\2]\u01c8"+
		"\3\2\2\2_\u01ce\3\2\2\2a\u01d1\3\2\2\2cd\7.\2\2d\4\3\2\2\2ef\7c\2\2fg"+
		"\7u\2\2g\6\3\2\2\2hj\t\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l"+
		"m\3\2\2\2mn\b\4\2\2n\b\3\2\2\2op\7u\2\2pq\7g\2\2qr\7n\2\2rs\7g\2\2st\7"+
		"e\2\2tu\7v\2\2u\n\3\2\2\2vw\7y\2\2wx\7j\2\2xy\7g\2\2yz\7t\2\2z{\7g\2\2"+
		"{\f\3\2\2\2|}\7p\2\2}~\7v\2\2~\177\7j\2\2\177\u0080\7e\2\2\u0080\u0081"+
		"\7j\2\2\u0081\u0082\7k\2\2\u0082\u0083\7n\2\2\u0083\u0084\7f\2\2\u0084"+
		"\16\3\2\2\2\u0085\u0086\7d\2\2\u0086\u0087\7g\2\2\u0087\u0088\7v\2\2\u0088"+
		"\u0089\7y\2\2\u0089\u008a\7g\2\2\u008a\u008b\7g\2\2\u008b\u008c\7p\2\2"+
		"\u008c\20\3\2\2\2\u008d\u008e\7o\2\2\u008e\u008f\7q\2\2\u008f\u0090\7"+
		"p\2\2\u0090\u0091\7v\2\2\u0091\u0092\7j\2\2\u0092\u0093\7u\2\2\u0093\u0094"+
		"\7a\2\2\u0094\u0095\7d\2\2\u0095\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097"+
		"\u0098\7y\2\2\u0098\u0099\7g\2\2\u0099\u009a\7g\2\2\u009a\u009b\7p\2\2"+
		"\u009b\22\3\2\2\2\u009c\u009d\7{\2\2\u009d\u009e\7g\2\2\u009e\u009f\7"+
		"c\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7a\2\2\u00a2\u00a3"+
		"\7d\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7y\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9\24\3\2\2\2\u00aa"+
		"\u00ab\7e\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7t\2\2"+
		"\u00ae\u00af\7g\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2"+
		"\7a\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\26\3\2\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\7k\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7g\2\2"+
		"\u00bd\u00be\7u\2\2\u00be\u00bf\7a\2\2\u00bf\u00c0\7d\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7y\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5\u00c6\7p\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8"+
		"\u00c9\7q\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2"+
		"\u00cc\32\3\2\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7"+
		"o\2\2\u00d0\34\3\2\2\2\u00d1\u00d2\7o\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4\36\3\2\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8"+
		"\7z\2\2\u00d8 \3\2\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7x\2\2\u00db\u00dc"+
		"\7i\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7k\2\2\u00df\u00e0"+
		"\7u\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3"+
		"\u00e4\7e\2\2\u00e4\u00e5\7v\2\2\u00e5$\3\2\2\2\u00e6\u00e7\7q\2\2\u00e7"+
		"\u00e8\7t\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7t\2\2"+
		"\u00eb\u00ec\7\"\2\2\u00ec\u00ed\7d\2\2\u00ed\u00ee\7{\2\2\u00ee&\3\2"+
		"\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f7"+
		"\7e\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f7\7e\2\2\u00f6"+
		"\u00ef\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7(\3\2\2\2\u00f8\u00f9\7n\2\2\u00f9"+
		"\u00fa\7k\2\2\u00fa\u00fb\7o\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7v\2\2"+
		"\u00fd*\3\2\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7q\2"+
		"\2\u0101\u0102\7u\2\2\u0102\u0103\7u\2\2\u0103\u0104\7v\2\2\u0104\u0105"+
		"\7c\2\2\u0105\u0106\7d\2\2\u0106,\3\2\2\2\u0107\u0108\7e\2\2\u0108\u0109"+
		"\7q\2\2\u0109\u010a\7p\2\2\u010a\u010b\7e\2\2\u010b\u010c\7c\2\2\u010c"+
		"\u010d\7v\2\2\u010d.\3\2\2\2\u010e\u010f\7q\2\2\u010f\u0110\7t\2\2\u0110"+
		"\60\3\2\2\2\u0111\u0112\7c\2\2\u0112\u0113\7p\2\2\u0113\u0114\7f\2\2\u0114"+
		"\62\3\2\2\2\u0115\u0116\7r\2\2\u0116\u0117\7c\2\2\u0117\u0118\7p\2\2\u0118"+
		"\u0119\7f\2\2\u0119\64\3\2\2\2\u011a\u011b\7p\2\2\u011b\u011c\7q\2\2\u011c"+
		"\u011d\7v\2\2\u011d\66\3\2\2\2\u011e\u011f\7t\2\2\u011f\u0120\7q\2\2\u0120"+
		"\u0121\7w\2\2\u0121\u0122\7p\2\2\u0122\u0123\7f\2\2\u01238\3\2\2\2\u0124"+
		"\u0125\7*\2\2\u0125:\3\2\2\2\u0126\u0127\7+\2\2\u0127<\3\2\2\2\u0128\u0129"+
		"\7k\2\2\u0129\u0131\7p\2\2\u012a\u012b\7p\2\2\u012b\u012c\7q\2\2\u012c"+
		"\u012d\7v\2\2\u012d\u012e\7\"\2\2\u012e\u012f\7k\2\2\u012f\u0131\7p\2"+
		"\2\u0130\u0128\3\2\2\2\u0130\u012a\3\2\2\2\u0131>\3\2\2\2\u0132\u0133"+
		"\7e\2\2\u0133\u0134\7q\2\2\u0134\u0135\7p\2\2\u0135\u0136\7v\2\2\u0136"+
		"\u0137\7c\2\2\u0137\u0138\7k\2\2\u0138\u0139\7p\2\2\u0139\u014f\7u\2\2"+
		"\u013a\u013b\7u\2\2\u013b\u013c\7v\2\2\u013c\u013d\7c\2\2\u013d\u013e"+
		"\7t\2\2\u013e\u013f\7v\2\2\u013f\u0140\7u\2\2\u0140\u0141\7\"\2\2\u0141"+
		"\u0142\7y\2\2\u0142\u0143\7k\2\2\u0143\u0144\7v\2\2\u0144\u014f\7j\2\2"+
		"\u0145\u0146\7g\2\2\u0146\u0147\7p\2\2\u0147\u0148\7f\2\2\u0148\u0149"+
		"\7u\2\2\u0149\u014a\7\"\2\2\u014a\u014b\7y\2\2\u014b\u014c\7k\2\2\u014c"+
		"\u014d\7v\2\2\u014d\u014f\7j\2\2\u014e\u0132\3\2\2\2\u014e\u013a\3\2\2"+
		"\2\u014e\u0145\3\2\2\2\u014f@\3\2\2\2\u0150\u0151\7g\2\2\u0151\u0152\7"+
		"z\2\2\u0152\u0153\7k\2\2\u0153\u0154\7u\2\2\u0154\u0155\7v\2\2\u0155\u0164"+
		"\7u\2\2\u0156\u0157\7p\2\2\u0157\u0158\7q\2\2\u0158\u0159\7v\2\2\u0159"+
		"\u015a\7\"\2\2\u015a\u015b\7g\2\2\u015b\u015c\7z\2\2\u015c\u015d\7k\2"+
		"\2\u015d\u015e\7u\2\2\u015e\u015f\7v\2\2\u015f\u0164\7u\2\2\u0160\u0161"+
		"\7c\2\2\u0161\u0162\7p\2\2\u0162\u0164\7{\2\2\u0163\u0150\3\2\2\2\u0163"+
		"\u0156\3\2\2\2\u0163\u0160\3\2\2\2\u0164B\3\2\2\2\u0165\u0166\7v\2\2\u0166"+
		"\u0167\7t\2\2\u0167\u0168\7w\2\2\u0168\u016f\7g\2\2\u0169\u016a\7h\2\2"+
		"\u016a\u016b\7c\2\2\u016b\u016c\7n\2\2\u016c\u016d\7u\2\2\u016d\u016f"+
		"\7g\2\2\u016e\u0165\3\2\2\2\u016e\u0169\3\2\2\2\u016fD\3\2\2\2\u0170\u017d"+
		"\t\3\2\2\u0171\u0172\7@\2\2\u0172\u017d\7?\2\2\u0173\u0174\7>\2\2\u0174"+
		"\u017d\7?\2\2\u0175\u017d\7?\2\2\u0176\u0177\7#\2\2\u0177\u017d\7?\2\2"+
		"\u0178\u0179\7n\2\2\u0179\u017a\7k\2\2\u017a\u017b\7m\2\2\u017b\u017d"+
		"\7g\2\2\u017c\u0170\3\2\2\2\u017c\u0171\3\2\2\2\u017c\u0173\3\2\2\2\u017c"+
		"\u0175\3\2\2\2\u017c\u0176\3\2\2\2\u017c\u0178\3\2\2\2\u017dF\3\2\2\2"+
		"\u017e\u0180\7/\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182"+
		"\3\2\2\2\u0181\u0183\5Q)\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185H\3\2\2\2\u0186\u0188\7/\2\2\u0187"+
		"\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u018b\5Q"+
		")\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\7\60\2\2\u018f\u0191\5"+
		"Q)\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193J\3\2\2\2\u0194\u0196\5Q)\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u019a\t\4\2\2\u019aL\3\2\2\2\u019b\u019d\5Q)\2\u019c\u019b"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\t\5\2\2\u01a1N\3\2\2\2\u01a2\u01a4\5Q)\2\u01a3"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\t\6\2\2\u01a8P\3\2\2\2\u01a9\u01aa"+
		"\4\62;\2\u01aaR\3\2\2\2\u01ab\u01af\t\7\2\2\u01ac\u01ae\t\b\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0T\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\5G$\2\u01b3\u01b5"+
		"\5S*\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\7\60\2\2\u01b7\u01bc\5S*\2\u01b8\u01b9\7\60\2\2\u01b9\u01bb\5S"+
		"*\2\u01ba\u01b8\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bdV\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7$\2\2\u01c0"+
		"\u01c1\5_\60\2\u01c1\u01c2\7$\2\2\u01c2X\3\2\2\2\u01c3\u01c4\7^\2\2\u01c4"+
		"\u01c5\t\t\2\2\u01c5Z\3\2\2\2\u01c6\u01c7\t\n\2\2\u01c7\\\3\2\2\2\u01c8"+
		"\u01c9\13\2\2\2\u01c9^\3\2\2\2\u01ca\u01cd\5Y-\2\u01cb\u01cd\n\t\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf`\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2"+
		"\7$\2\2\u01d2b\3\2\2\2\27\2k\u00f6\u0130\u014e\u0163\u016e\u017c\u017f"+
		"\u0184\u0187\u018c\u0192\u0197\u019e\u01a5\u01af\u01b4\u01bc\u01cc\u01ce"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}