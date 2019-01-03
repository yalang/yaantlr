// Generated from Ya.g4 by ANTLR 4.7.1
package org.yalang.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YaParser}.
 */
public interface YaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YaParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(YaParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(YaParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(YaParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(YaParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(YaParser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(YaParser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(YaParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(YaParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(YaParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(YaParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(YaParser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(YaParser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void enterAsync_funcdef(YaParser.Async_funcdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void exitAsync_funcdef(YaParser.Async_funcdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(YaParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(YaParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(YaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(YaParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(YaParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(YaParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(YaParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(YaParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(YaParser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(YaParser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void enterVfpdef(YaParser.VfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void exitVfpdef(YaParser.VfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(YaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(YaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(YaParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(YaParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(YaParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(YaParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(YaParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(YaParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#annassign}.
	 * @param ctx the parse tree
	 */
	void enterAnnassign(YaParser.AnnassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#annassign}.
	 * @param ctx the parse tree
	 */
	void exitAnnassign(YaParser.AnnassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(YaParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(YaParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(YaParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(YaParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(YaParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(YaParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(YaParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(YaParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(YaParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(YaParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(YaParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(YaParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(YaParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(YaParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(YaParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(YaParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(YaParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(YaParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(YaParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(YaParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(YaParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(YaParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(YaParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(YaParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(YaParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(YaParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(YaParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(YaParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(YaParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(YaParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(YaParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(YaParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(YaParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(YaParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(YaParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(YaParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(YaParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(YaParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(YaParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(YaParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(YaParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(YaParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(YaParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(YaParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsync_stmt(YaParser.Async_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsync_stmt(YaParser.Async_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(YaParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(YaParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(YaParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(YaParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(YaParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(YaParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(YaParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(YaParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(YaParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(YaParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(YaParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(YaParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(YaParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(YaParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(YaParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(YaParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(YaParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(YaParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTest_nocond(YaParser.Test_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTest_nocond(YaParser.Test_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(YaParser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(YaParser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void enterLambdef_nocond(YaParser.Lambdef_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void exitLambdef_nocond(YaParser.Lambdef_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(YaParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(YaParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(YaParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(YaParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(YaParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(YaParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(YaParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(YaParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(YaParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(YaParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(YaParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(YaParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(YaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(YaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(YaParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(YaParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(YaParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(YaParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(YaParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(YaParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(YaParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(YaParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(YaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(YaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(YaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(YaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(YaParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(YaParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(YaParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(YaParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(YaParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(YaParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(YaParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(YaParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(YaParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(YaParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(YaParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(YaParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(YaParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(YaParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(YaParser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(YaParser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(YaParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(YaParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(YaParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(YaParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(YaParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(YaParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(YaParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(YaParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(YaParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(YaParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(YaParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(YaParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(YaParser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(YaParser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(YaParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(YaParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(YaParser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(YaParser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void enterEncoding_decl(YaParser.Encoding_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void exitEncoding_decl(YaParser.Encoding_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(YaParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(YaParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YaParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(YaParser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link YaParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(YaParser.Yield_argContext ctx);
}