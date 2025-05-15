// Generated from Hello.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#greeting}.
	 * @param ctx the parse tree
	 */
	void enterGreeting(HelloParser.GreetingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#greeting}.
	 * @param ctx the parse tree
	 */
	void exitGreeting(HelloParser.GreetingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleHello}
	 * labeled alternative in {@link HelloParser#simpleGreeting}.
	 * @param ctx the parse tree
	 */
	void enterSimpleHello(HelloParser.SimpleHelloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleHello}
	 * labeled alternative in {@link HelloParser#simpleGreeting}.
	 * @param ctx the parse tree
	 */
	void exitSimpleHello(HelloParser.SimpleHelloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleHi}
	 * labeled alternative in {@link HelloParser#simpleGreeting}.
	 * @param ctx the parse tree
	 */
	void enterSimpleHi(HelloParser.SimpleHiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleHi}
	 * labeled alternative in {@link HelloParser#simpleGreeting}.
	 * @param ctx the parse tree
	 */
	void exitSimpleHi(HelloParser.SimpleHiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundHello}
	 * labeled alternative in {@link HelloParser#compoundGreeting}.
	 * @param ctx the parse tree
	 */
	void enterCompoundHello(HelloParser.CompoundHelloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundHello}
	 * labeled alternative in {@link HelloParser#compoundGreeting}.
	 * @param ctx the parse tree
	 */
	void exitCompoundHello(HelloParser.CompoundHelloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundHi}
	 * labeled alternative in {@link HelloParser#compoundGreeting}.
	 * @param ctx the parse tree
	 */
	void enterCompoundHi(HelloParser.CompoundHiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundHi}
	 * labeled alternative in {@link HelloParser#compoundGreeting}.
	 * @param ctx the parse tree
	 */
	void exitCompoundHi(HelloParser.CompoundHiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleGoodbye}
	 * labeled alternative in {@link HelloParser#farewell}.
	 * @param ctx the parse tree
	 */
	void enterSimpleGoodbye(HelloParser.SimpleGoodbyeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleGoodbye}
	 * labeled alternative in {@link HelloParser#farewell}.
	 * @param ctx the parse tree
	 */
	void exitSimpleGoodbye(HelloParser.SimpleGoodbyeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleBye}
	 * labeled alternative in {@link HelloParser#farewell}.
	 * @param ctx the parse tree
	 */
	void enterSimpleBye(HelloParser.SimpleByeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleBye}
	 * labeled alternative in {@link HelloParser#farewell}.
	 * @param ctx the parse tree
	 */
	void exitSimpleBye(HelloParser.SimpleByeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundGoodbye}
	 * labeled alternative in {@link HelloParser#farewell}.
	 * @param ctx the parse tree
	 */
	void enterCompoundGoodbye(HelloParser.CompoundGoodbyeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundGoodbye}
	 * labeled alternative in {@link HelloParser#farewell}.
	 * @param ctx the parse tree
	 */
	void exitCompoundGoodbye(HelloParser.CompoundGoodbyeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HowAreYou}
	 * labeled alternative in {@link HelloParser#question}.
	 * @param ctx the parse tree
	 */
	void enterHowAreYou(HelloParser.HowAreYouContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HowAreYou}
	 * labeled alternative in {@link HelloParser#question}.
	 * @param ctx the parse tree
	 */
	void exitHowAreYou(HelloParser.HowAreYouContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhatIsYourName}
	 * labeled alternative in {@link HelloParser#question}.
	 * @param ctx the parse tree
	 */
	void enterWhatIsYourName(HelloParser.WhatIsYourNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhatIsYourName}
	 * labeled alternative in {@link HelloParser#question}.
	 * @param ctx the parse tree
	 */
	void exitWhatIsYourName(HelloParser.WhatIsYourNameContext ctx);
}