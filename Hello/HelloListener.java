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
	 * Enter a parse tree produced by the {@code HelloGreeting}
	 * labeled alternative in {@link HelloParser#greeting}.
	 * @param ctx the parse tree
	 */
	void enterHelloGreeting(HelloParser.HelloGreetingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HelloGreeting}
	 * labeled alternative in {@link HelloParser#greeting}.
	 * @param ctx the parse tree
	 */
	void exitHelloGreeting(HelloParser.HelloGreetingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HiGreeting}
	 * labeled alternative in {@link HelloParser#greeting}.
	 * @param ctx the parse tree
	 */
	void enterHiGreeting(HelloParser.HiGreetingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HiGreeting}
	 * labeled alternative in {@link HelloParser#greeting}.
	 * @param ctx the parse tree
	 */
	void exitHiGreeting(HelloParser.HiGreetingContext ctx);
}