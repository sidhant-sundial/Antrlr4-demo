# ANTLR4 Demo

This repository contains a demonstration of ANTLR4 (ANother Tool for Language Recognition), a powerful parser generator for reading, processing, executing, or translating structured text or binary files.

## What is ANTLR4?

ANTLR4 is a powerful parser generator that can be used to build languages, tools, and frameworks. It generates a parser that can build and walk parse trees. ANTLR4 is widely used in academia and industry to build all sorts of languages, tools, and frameworks.

## Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- Maven (for Java projects)
- ANTLR4 Tool

## Installation Steps

### 1. Install ANTLR4 Tool

#### For macOS (using Homebrew):

```bash
brew install antlr
```

```bash
cd /usr/local/lib
sudo curl -O https://www.antlr.org/download/antlr-4.13.1-complete.jar
export CLASSPATH=".:/usr/local/lib/antlr-4.13.1-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.13.1-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
```

### 2. Verify Installation

To verify your ANTLR4 installation, run:

```bash
antlr4
```

You should see the ANTLR4 help message.

## Project Structure

```
.
├── src/
│   ├── main/
│   │   ├── antlr/    # ANTLR grammar files (.g4)
│   │   └── java/     # Generated parser and lexer files
├── pom.xml           # Maven configuration (if using Java)
└── README.md
```

## Basic Usage

1. Create a grammar file (`.g4`) in your project
2. Generate parser and lexer:

```bash
antlr4 YourGrammar.g4
```

3. Compile the generated Java files:

```bash
javac *.java
```

4. Test your grammar:

```bash
grun YourGrammar startRule -gui
```

## Common ANTLR4 Commands

- Generate parser and lexer: `antlr4 Grammar.g4`
- Generate parser and lexer with visitor: `antlr4 -visitor Grammar.g4`
- Test grammar with GUI: `grun Grammar startRule -gui`
- Test grammar with tokens: `grun Grammar startRule -tokens`

## Resources

- [Official ANTLR4 Website](https://www.antlr.org/)
- [ANTLR4 Documentation](https://github.com/antlr/antlr4/blob/master/doc/index.md)
- [ANTLR4 GitHub Repository](https://github.com/antlr/antlr4)

## Contributing

Feel free to submit issues and enhancement requests!

## License

This project is licensed under the MIT License - see the LICENSE file for details.
