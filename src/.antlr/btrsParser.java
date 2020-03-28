// Generated from /Users/AzimeX/Documents/Projects/BTRS/src/btrs.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class btrsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, QUOTE=2, FILEHEADER_NAME=3, WS=4;
	public static final int
		RULE_btrsfile = 0, RULE_fileheader = 1;
	public static final String[] ruleNames = {
		"btrsfile", "fileheader"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fileheader '", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "QUOTE", "FILEHEADER_NAME", "WS"
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
	public String getGrammarFileName() { return "btrs.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public btrsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BtrsfileContext extends ParserRuleContext {
		public List<FileheaderContext> fileheader() {
			return getRuleContexts(FileheaderContext.class);
		}
		public FileheaderContext fileheader(int i) {
			return getRuleContext(FileheaderContext.class,i);
		}
		public List<TerminalNode> EOF() { return getTokens(btrsParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(btrsParser.EOF, i);
		}
		public BtrsfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btrsfile; }
	}

	public final BtrsfileContext btrsfile() throws RecognitionException {
		BtrsfileContext _localctx = new BtrsfileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_btrsfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(8);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(4);
					fileheader();
					}
					break;
				case 2:
					{
					setState(5);
					fileheader();
					setState(6);
					match(EOF);
					}
					break;
				}
				}
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class FileheaderContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(btrsParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(btrsParser.QUOTE, i);
		}
		public TerminalNode FILEHEADER_NAME() { return getToken(btrsParser.FILEHEADER_NAME, 0); }
		public FileheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileheader; }
	}

	public final FileheaderContext fileheader() throws RecognitionException {
		FileheaderContext _localctx = new FileheaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fileheader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			match(QUOTE);
			setState(14);
			match(FILEHEADER_NAME);
			setState(15);
			match(QUOTE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\24\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\6\2\13\n\2\r\2\16\2\f\3\3\3\3\3\3\3\3\3\3\3\3\2\2"+
		"\4\2\4\2\2\2\23\2\n\3\2\2\2\4\16\3\2\2\2\6\13\5\4\3\2\7\b\5\4\3\2\b\t"+
		"\7\2\2\3\t\13\3\2\2\2\n\6\3\2\2\2\n\7\3\2\2\2\13\f\3\2\2\2\f\n\3\2\2\2"+
		"\f\r\3\2\2\2\r\3\3\2\2\2\16\17\7\3\2\2\17\20\7\4\2\2\20\21\7\5\2\2\21"+
		"\22\7\4\2\2\22\5\3\2\2\2\4\n\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}