grammar Hello;

// Parser Rules
program: statement+ EOF;

statement: greeting | farewell | question;

greeting: simpleGreeting | compoundGreeting;

simpleGreeting:
	'hello' ID '!'	# SimpleHello
	| 'hi' ID '!'	# SimpleHi;

compoundGreeting:
	'hello' ID ',' greeting	# CompoundHello
	| 'hi' ID ',' greeting	# CompoundHi;

farewell:
	'goodbye' ID '!'				# SimpleGoodbye
	| 'bye' ID '!'					# SimpleBye
	| 'goodbye' ID ',' greeting '!'	# CompoundGoodbye;

question:
	'how' 'are' 'you' ID '?'		# HowAreYou
	| 'what' 'is' 'your' 'name' '?'	# WhatIsYourName;

// Lexer Rules
ID: [a-zA-Z]+; // Match one or more letters
WS: [ \t\r\n]+ -> skip; // Skip whitespace, tabs, newlines
COMMENT: '//' ~[\r\n]* -> skip; // Skip single-line comments