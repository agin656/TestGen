// Generated from C:/Users/memoy/Desktop/desk/TestGen\TestGen.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestGenParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestGenVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestGenParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(TestGenParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(TestGenParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(TestGenParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(TestGenParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(TestGenParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLines(TestGenParser.LinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(TestGenParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(TestGenParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(TestGenParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#inparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInparams(TestGenParser.InparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#outparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutparams(TestGenParser.OutparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(TestGenParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(TestGenParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(TestGenParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#funcParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParams(TestGenParser.FuncParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#funcParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParam(TestGenParser.FuncParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGenParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(TestGenParser.FuncnameContext ctx);
}