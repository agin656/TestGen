// Generated from X:/cos382/TestGen\TestGen.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestGenParser}.
 */
public interface TestGenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestGenParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(TestGenParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(TestGenParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(TestGenParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(TestGenParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(TestGenParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(TestGenParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(TestGenParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(TestGenParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(TestGenParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(TestGenParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(TestGenParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(TestGenParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(TestGenParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(TestGenParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(TestGenParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(TestGenParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(TestGenParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(TestGenParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(TestGenParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(TestGenParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#funcParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncParams(TestGenParser.FuncParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#funcParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncParams(TestGenParser.FuncParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#funcParam}.
	 * @param ctx the parse tree
	 */
	void enterFuncParam(TestGenParser.FuncParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#funcParam}.
	 * @param ctx the parse tree
	 */
	void exitFuncParam(TestGenParser.FuncParamContext ctx);
}