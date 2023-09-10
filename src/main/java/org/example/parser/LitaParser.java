// Generated from docs/grammar/Lita.g4 by ANTLR 4.13.0
package org.example.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LitaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, NOMERIKA=19, ISA=20, TEBOKA=21, NL=22, ADD=23, SUB=24, MULT=25, 
		DIV=26, GT=27, GTE=28, LT=29, LTE=30, EQ=31, NA=32, SY=33, VOAMBOLANA=34, 
		WS=35;
	public static final int
		RULE_programa = 0, RULE_marika_baiko = 1, RULE_isa_ampidirina = 2, RULE_isa_avoaka = 3, 
		RULE_baiko = 4, RULE_rafitrisa = 5, RULE_vina = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "marika_baiko", "isa_ampidirina", "isa_avoaka", "baiko", 
			"rafitrisa", "vina"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'BAIKO:'", "'ISA AMPIDIRINA:'", "'ISA AVOAKA:'", "'Raiso'", "'ka soloy'", 
			"'Forony'", "'ho'", "'Ataovy'", "'raha mbola'", "'Raha'", "'dia'", "'tapaho'", 
			"'``'", "''''", "'('", "')'", "'marina'", "'diso'", null, null, "'.'", 
			null, "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'='", 
			"'na'", "'sy'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NOMERIKA", "ISA", "TEBOKA", 
			"NL", "ADD", "SUB", "MULT", "DIV", "GT", "GTE", "LT", "LTE", "EQ", "NA", 
			"SY", "VOAMBOLANA", "WS"
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
	public String getGrammarFileName() { return "Lita.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LitaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public Isa_ampidirinaContext isa_ampidirina() {
			return getRuleContext(Isa_ampidirinaContext.class,0);
		}
		public Marika_baikoContext marika_baiko() {
			return getRuleContext(Marika_baikoContext.class,0);
		}
		public Isa_avoakaContext isa_avoaka() {
			return getRuleContext(Isa_avoakaContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(LitaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(LitaParser.NL, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			isa_ampidirina();
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				match(NL);
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(20);
			marika_baiko();
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				match(NL);
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(26);
			isa_avoaka();
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
	public static class Marika_baikoContext extends ParserRuleContext {
		public List<BaikoContext> baiko() {
			return getRuleContexts(BaikoContext.class);
		}
		public BaikoContext baiko(int i) {
			return getRuleContext(BaikoContext.class,i);
		}
		public Marika_baikoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marika_baiko; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitMarika_baiko(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Marika_baikoContext marika_baiko() throws RecognitionException {
		Marika_baikoContext _localctx = new Marika_baikoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_marika_baiko);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				baiko();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 13648L) != 0) );
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
	public static class Isa_ampidirinaContext extends ParserRuleContext {
		public TerminalNode NOMERIKA() { return getToken(LitaParser.NOMERIKA, 0); }
		public Isa_ampidirinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isa_ampidirina; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitIsa_ampidirina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Isa_ampidirinaContext isa_ampidirina() throws RecognitionException {
		Isa_ampidirinaContext _localctx = new Isa_ampidirinaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_isa_ampidirina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__1);
			setState(35);
			match(NOMERIKA);
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
	public static class Isa_avoakaContext extends ParserRuleContext {
		public RafitrisaContext rafitrisa() {
			return getRuleContext(RafitrisaContext.class,0);
		}
		public Isa_avoakaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isa_avoaka; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitIsa_avoaka(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Isa_avoakaContext isa_avoaka() throws RecognitionException {
		Isa_avoakaContext _localctx = new Isa_avoakaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_isa_avoaka);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__2);
			setState(38);
			rafitrisa(0);
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
	public static class BaikoContext extends ParserRuleContext {
		public BaikoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baiko; }
	 
		public BaikoContext() { }
		public void copyFrom(BaikoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlaceholderContext extends BaikoContext {
		public List<TerminalNode> NL() { return getTokens(LitaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(LitaParser.NL, i);
		}
		public List<BaikoContext> baiko() {
			return getRuleContexts(BaikoContext.class);
		}
		public BaikoContext baiko(int i) {
			return getRuleContext(BaikoContext.class,i);
		}
		public PlaceholderContext(BaikoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitPlaceholder(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends BaikoContext {
		public VinaContext vina() {
			return getRuleContext(VinaContext.class,0);
		}
		public BaikoContext baiko() {
			return getRuleContext(BaikoContext.class,0);
		}
		public IfStmtContext(BaikoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends BaikoContext {
		public TerminalNode TEBOKA() { return getToken(LitaParser.TEBOKA, 0); }
		public BreakContext(BaikoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends BaikoContext {
		public TerminalNode VOAMBOLANA() { return getToken(LitaParser.VOAMBOLANA, 0); }
		public RafitrisaContext rafitrisa() {
			return getRuleContext(RafitrisaContext.class,0);
		}
		public TerminalNode TEBOKA() { return getToken(LitaParser.TEBOKA, 0); }
		public AssignContext(BaikoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareContext extends BaikoContext {
		public TerminalNode VOAMBOLANA() { return getToken(LitaParser.VOAMBOLANA, 0); }
		public RafitrisaContext rafitrisa() {
			return getRuleContext(RafitrisaContext.class,0);
		}
		public TerminalNode TEBOKA() { return getToken(LitaParser.TEBOKA, 0); }
		public DeclareContext(BaikoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStmtContext extends BaikoContext {
		public BaikoContext baiko() {
			return getRuleContext(BaikoContext.class,0);
		}
		public VinaContext vina() {
			return getRuleContext(VinaContext.class,0);
		}
		public TerminalNode TEBOKA() { return getToken(LitaParser.TEBOKA, 0); }
		public DoWhileStmtContext(BaikoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitDoWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaikoContext baiko() throws RecognitionException {
		BaikoContext _localctx = new BaikoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_baiko);
		int _la;
		try {
			int _alt;
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__3);
				setState(41);
				match(VOAMBOLANA);
				setState(42);
				match(T__4);
				setState(43);
				rafitrisa(0);
				setState(44);
				match(TEBOKA);
				}
				break;
			case T__5:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__5);
				setState(47);
				match(VOAMBOLANA);
				setState(48);
				match(T__6);
				setState(49);
				rafitrisa(0);
				setState(50);
				match(TEBOKA);
				}
				break;
			case T__7:
				_localctx = new DoWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(T__7);
				setState(53);
				baiko();
				setState(54);
				match(T__8);
				setState(55);
				vina(0);
				setState(56);
				match(TEBOKA);
				}
				break;
			case T__9:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(T__9);
				setState(59);
				vina(0);
				setState(60);
				match(T__10);
				setState(61);
				baiko();
				}
				break;
			case T__11:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				match(T__11);
				setState(64);
				match(TEBOKA);
				}
				break;
			case T__12:
				_localctx = new PlaceholderContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(T__12);
				setState(66);
				match(NL);
				setState(67);
				baiko();
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(69); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(68);
							match(NL);
							}
							}
							setState(71); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NL );
						setState(73);
						baiko();
						}
						} 
					}
					setState(78);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(79);
				match(NL);
				setState(80);
				match(T__13);
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
	public static class RafitrisaContext extends ParserRuleContext {
		public RafitrisaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rafitrisa; }
	 
		public RafitrisaContext() { }
		public void copyFrom(RafitrisaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericContext extends RafitrisaContext {
		public TerminalNode NOMERIKA() { return getToken(LitaParser.NOMERIKA, 0); }
		public NumericContext(RafitrisaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitNumeric(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentContext extends RafitrisaContext {
		public TerminalNode VOAMBOLANA() { return getToken(LitaParser.VOAMBOLANA, 0); }
		public IdentContext(RafitrisaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends RafitrisaContext {
		public Token op;
		public List<RafitrisaContext> rafitrisa() {
			return getRuleContexts(RafitrisaContext.class);
		}
		public RafitrisaContext rafitrisa(int i) {
			return getRuleContext(RafitrisaContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LitaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LitaParser.SUB, 0); }
		public AddSubContext(RafitrisaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedRafitrisaContext extends RafitrisaContext {
		public RafitrisaContext rafitrisa() {
			return getRuleContext(RafitrisaContext.class,0);
		}
		public ParenthesizedRafitrisaContext(RafitrisaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitParenthesizedRafitrisa(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivContext extends RafitrisaContext {
		public Token op;
		public List<RafitrisaContext> rafitrisa() {
			return getRuleContexts(RafitrisaContext.class);
		}
		public RafitrisaContext rafitrisa(int i) {
			return getRuleContext(RafitrisaContext.class,i);
		}
		public TerminalNode MULT() { return getToken(LitaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LitaParser.DIV, 0); }
		public MultDivContext(RafitrisaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RafitrisaContext rafitrisa() throws RecognitionException {
		return rafitrisa(0);
	}

	private RafitrisaContext rafitrisa(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RafitrisaContext _localctx = new RafitrisaContext(_ctx, _parentState);
		RafitrisaContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_rafitrisa, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOMERIKA:
				{
				_localctx = new NumericContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(85);
				match(NOMERIKA);
				}
				break;
			case VOAMBOLANA:
				{
				_localctx = new IdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(VOAMBOLANA);
				}
				break;
			case T__14:
				{
				_localctx = new ParenthesizedRafitrisaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(T__14);
				setState(88);
				rafitrisa(0);
				setState(89);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AddSubContext(new RafitrisaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rafitrisa);
						setState(93);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(94);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						rafitrisa(3);
						}
						break;
					case 2:
						{
						_localctx = new MultDivContext(new RafitrisaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rafitrisa);
						setState(96);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(97);
						((MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						rafitrisa(2);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VinaContext extends ParserRuleContext {
		public VinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vina; }
	 
		public VinaContext() { }
		public void copyFrom(VinaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisoContext extends VinaContext {
		public DisoContext(VinaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitDiso(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedVinaContext extends VinaContext {
		public VinaContext vina() {
			return getRuleContext(VinaContext.class,0);
		}
		public ParenthesizedVinaContext(VinaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitParenthesizedVina(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends VinaContext {
		public Token cop;
		public List<RafitrisaContext> rafitrisa() {
			return getRuleContexts(RafitrisaContext.class);
		}
		public RafitrisaContext rafitrisa(int i) {
			return getRuleContext(RafitrisaContext.class,i);
		}
		public TerminalNode GT() { return getToken(LitaParser.GT, 0); }
		public TerminalNode GTE() { return getToken(LitaParser.GTE, 0); }
		public TerminalNode LT() { return getToken(LitaParser.LT, 0); }
		public TerminalNode LTE() { return getToken(LitaParser.LTE, 0); }
		public TerminalNode EQ() { return getToken(LitaParser.EQ, 0); }
		public List<VinaContext> vina() {
			return getRuleContexts(VinaContext.class);
		}
		public VinaContext vina(int i) {
			return getRuleContext(VinaContext.class,i);
		}
		public TerminalNode NA() { return getToken(LitaParser.NA, 0); }
		public TerminalNode SY() { return getToken(LitaParser.SY, 0); }
		public ComparisonContext(VinaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MarinaContext extends VinaContext {
		public MarinaContext(VinaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LitaVisitor ) return ((LitaVisitor<? extends T>)visitor).visitMarina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VinaContext vina() throws RecognitionException {
		return vina(0);
	}

	private VinaContext vina(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VinaContext _localctx = new VinaContext(_ctx, _parentState);
		VinaContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_vina, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new MarinaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(105);
				match(T__16);
				}
				break;
			case 2:
				{
				_localctx = new DisoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(T__17);
				}
				break;
			case 3:
				{
				_localctx = new ComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				rafitrisa(0);
				setState(108);
				((ComparisonContext)_localctx).cop = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
					((ComparisonContext)_localctx).cop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(109);
				rafitrisa(0);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesizedVinaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(T__14);
				setState(112);
				vina(0);
				setState(113);
				match(T__15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparisonContext(new VinaContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_vina);
					setState(117);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(118);
					((ComparisonContext)_localctx).cop = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==NA || _la==SY) ) {
						((ComparisonContext)_localctx).cop = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(119);
					vina(3);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return rafitrisa_sempred((RafitrisaContext)_localctx, predIndex);
		case 6:
			return vina_sempred((VinaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rafitrisa_sempred(RafitrisaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean vina_sempred(VinaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0004\u0000"+
		"\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u0017\b\u0000\u000b\u0000\f\u0000\u0018\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0004\u0001\u001f\b\u0001\u000b\u0001\f\u0001"+
		" \u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"F\b\u0004\u000b\u0004\f\u0004G\u0001\u0004\u0005\u0004K\b\u0004\n\u0004"+
		"\f\u0004N\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004S\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\\\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005d\b\u0005\n\u0005\f\u0005"+
		"g\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006t\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"y\b\u0006\n\u0006\f\u0006|\t\u0006\u0001\u0006\u0000\u0002\n\f\u0007\u0000"+
		"\u0002\u0004\u0006\b\n\f\u0000\u0004\u0001\u0000\u0017\u0018\u0001\u0000"+
		"\u0019\u001a\u0001\u0000\u001b\u001f\u0001\u0000 !\u0088\u0000\u000e\u0001"+
		"\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000"+
		"\u0000\u0000\u0006%\u0001\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000"+
		"\n[\u0001\u0000\u0000\u0000\fs\u0001\u0000\u0000\u0000\u000e\u0010\u0003"+
		"\u0004\u0002\u0000\u000f\u0011\u0005\u0016\u0000\u0000\u0010\u000f\u0001"+
		"\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014\u0001"+
		"\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0017\u0005"+
		"\u0016\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0003"+
		"\u0006\u0003\u0000\u001b\u0001\u0001\u0000\u0000\u0000\u001c\u001e\u0005"+
		"\u0001\u0000\u0000\u001d\u001f\u0003\b\u0004\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"#\u0005\u0002"+
		"\u0000\u0000#$\u0005\u0013\u0000\u0000$\u0005\u0001\u0000\u0000\u0000"+
		"%&\u0005\u0003\u0000\u0000&\'\u0003\n\u0005\u0000\'\u0007\u0001\u0000"+
		"\u0000\u0000()\u0005\u0004\u0000\u0000)*\u0005\"\u0000\u0000*+\u0005\u0005"+
		"\u0000\u0000+,\u0003\n\u0005\u0000,-\u0005\u0015\u0000\u0000-S\u0001\u0000"+
		"\u0000\u0000./\u0005\u0006\u0000\u0000/0\u0005\"\u0000\u000001\u0005\u0007"+
		"\u0000\u000012\u0003\n\u0005\u000023\u0005\u0015\u0000\u00003S\u0001\u0000"+
		"\u0000\u000045\u0005\b\u0000\u000056\u0003\b\u0004\u000067\u0005\t\u0000"+
		"\u000078\u0003\f\u0006\u000089\u0005\u0015\u0000\u00009S\u0001\u0000\u0000"+
		"\u0000:;\u0005\n\u0000\u0000;<\u0003\f\u0006\u0000<=\u0005\u000b\u0000"+
		"\u0000=>\u0003\b\u0004\u0000>S\u0001\u0000\u0000\u0000?@\u0005\f\u0000"+
		"\u0000@S\u0005\u0015\u0000\u0000AB\u0005\r\u0000\u0000BC\u0005\u0016\u0000"+
		"\u0000CL\u0003\b\u0004\u0000DF\u0005\u0016\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0003\b\u0004\u0000JE\u0001\u0000"+
		"\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"OP\u0005\u0016\u0000\u0000PQ\u0005\u000e\u0000\u0000QS\u0001\u0000\u0000"+
		"\u0000R(\u0001\u0000\u0000\u0000R.\u0001\u0000\u0000\u0000R4\u0001\u0000"+
		"\u0000\u0000R:\u0001\u0000\u0000\u0000R?\u0001\u0000\u0000\u0000RA\u0001"+
		"\u0000\u0000\u0000S\t\u0001\u0000\u0000\u0000TU\u0006\u0005\uffff\uffff"+
		"\u0000U\\\u0005\u0013\u0000\u0000V\\\u0005\"\u0000\u0000WX\u0005\u000f"+
		"\u0000\u0000XY\u0003\n\u0005\u0000YZ\u0005\u0010\u0000\u0000Z\\\u0001"+
		"\u0000\u0000\u0000[T\u0001\u0000\u0000\u0000[V\u0001\u0000\u0000\u0000"+
		"[W\u0001\u0000\u0000\u0000\\e\u0001\u0000\u0000\u0000]^\n\u0002\u0000"+
		"\u0000^_\u0007\u0000\u0000\u0000_d\u0003\n\u0005\u0003`a\n\u0001\u0000"+
		"\u0000ab\u0007\u0001\u0000\u0000bd\u0003\n\u0005\u0002c]\u0001\u0000\u0000"+
		"\u0000c`\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000f\u000b\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000hi\u0006\u0006\uffff\uffff\u0000it\u0005\u0011"+
		"\u0000\u0000jt\u0005\u0012\u0000\u0000kl\u0003\n\u0005\u0000lm\u0007\u0002"+
		"\u0000\u0000mn\u0003\n\u0005\u0000nt\u0001\u0000\u0000\u0000op\u0005\u000f"+
		"\u0000\u0000pq\u0003\f\u0006\u0000qr\u0005\u0010\u0000\u0000rt\u0001\u0000"+
		"\u0000\u0000sh\u0001\u0000\u0000\u0000sj\u0001\u0000\u0000\u0000sk\u0001"+
		"\u0000\u0000\u0000so\u0001\u0000\u0000\u0000tz\u0001\u0000\u0000\u0000"+
		"uv\n\u0002\u0000\u0000vw\u0007\u0003\u0000\u0000wy\u0003\f\u0006\u0003"+
		"xu\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{\r\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000\u000b\u0012\u0018 GLR[cesz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
