// Generated from C:/Users/memoy/Desktop/desk/TestGen\TestGen.g4 by ANTLR 4.6
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
	 * Enter a parse tree produced by {@link TestGenParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(TestGenParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(TestGenParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(TestGenParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(TestGenParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#ts}.
	 * @param ctx the parse tree
	 */
	void enterTs(TestGenParser.TsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#ts}.
	 * @param ctx the parse tree
	 */
	void exitTs(TestGenParser.TsContext ctx);
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
	 * Enter a parse tree produced by {@link TestGenParser#comment1}.
	 * @param ctx the parse tree
	 */
	void enterComment1(TestGenParser.Comment1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#comment1}.
	 * @param ctx the parse tree
	 */
	void exitComment1(TestGenParser.Comment1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#func1}.
	 * @param ctx the parse tree
	 */
	void enterFunc1(TestGenParser.Func1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#func1}.
	 * @param ctx the parse tree
	 */
	void exitFunc1(TestGenParser.Func1Context ctx);
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
	 * Enter a parse tree produced by {@link TestGenParser#inparams}.
	 * @param ctx the parse tree
	 */
	void enterInparams(TestGenParser.InparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#inparams}.
	 * @param ctx the parse tree
	 */
	void exitInparams(TestGenParser.InparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#outparams}.
	 * @param ctx the parse tree
	 */
	void enterOutparams(TestGenParser.OutparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#outparams}.
	 * @param ctx the parse tree
	 */
	void exitOutparams(TestGenParser.OutparamsContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link TestGenParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(TestGenParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(TestGenParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGenParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(TestGenParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGenParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(TestGenParser.FuncnameContext ctx);
}