grammar Calculator;

// Parser Rules
program: expr EOF;

expr:
	expr op = ('*' | '/') expr		# MulDiv
	| expr op = ('+' | '-') expr	# AddSub
	| '(' expr ')'					# Parens
	| NUMBER						# Number;

// Lexer Rules
NUMBER: [0-9]+ ('.' [0-9]+)?; // Match integers or decimals
WS: [ \t\r\n]+ -> skip; // Skip whitespace, tabs, newlines