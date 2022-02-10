test : MarkdownParse.class MarkdownParseTest.class

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java
	java MarkdownParse

MarkdownParseTest.class : MarkdownParseTest.java
	javac MarkdownParseTest.java
	java MarkdownParseTest