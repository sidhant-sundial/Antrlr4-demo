grammar Hello;

// Parser Rules
program: greeting+ EOF;

greeting:
	'hello' ID '!'	# HelloGreeting
	| 'hi' ID '!'	# HiGreeting;

// Lexer Rules
ID: [a-zA-Z]+; // Match one or more letters
WS: [ \t\r\n]+ -> skip; // Skip whitespace, tabs, newlines