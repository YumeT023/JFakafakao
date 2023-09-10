// Generated from docs/grammar/Lita.g4 by ANTLR 4.13.0
package org.example.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LitaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LitaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LitaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LitaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LitaParser#marika_baiko}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarika_baiko(LitaParser.Marika_baikoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LitaParser#isa_ampidirina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsa_ampidirina(LitaParser.Isa_ampidirinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LitaParser#isa_avoaka}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsa_avoaka(LitaParser.Isa_avoakaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link LitaParser#baiko}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LitaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declare}
	 * labeled alternative in {@link LitaParser#baiko}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(LitaParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link LitaParser#baiko}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStmt(LitaParser.DoWhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link LitaParser#baiko}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(LitaParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link LitaParser#baiko}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(LitaParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Placeholder}
	 * labeled alternative in {@link LitaParser#baiko}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholder(LitaParser.PlaceholderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Numeric}
	 * labeled alternative in {@link LitaParser#rafitrisa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(LitaParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ident}
	 * labeled alternative in {@link LitaParser#rafitrisa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(LitaParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LitaParser#rafitrisa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(LitaParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedRafitrisa}
	 * labeled alternative in {@link LitaParser#rafitrisa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedRafitrisa(LitaParser.ParenthesizedRafitrisaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link LitaParser#rafitrisa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(LitaParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Diso}
	 * labeled alternative in {@link LitaParser#vina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiso(LitaParser.DisoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedVina}
	 * labeled alternative in {@link LitaParser#vina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedVina(LitaParser.ParenthesizedVinaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link LitaParser#vina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(LitaParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Marina}
	 * labeled alternative in {@link LitaParser#vina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarina(LitaParser.MarinaContext ctx);
}
