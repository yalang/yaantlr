package org.yalang.antlr;

import org.antlr.v4.runtime.CharStream;

public class Main {
    public static void main(String[] args) {
//        App.run(Main.class, args);

        String javaClassContent = "print('hello worl')";
        Python3Lexer java8Lexer = new Python3Lexer(javaClassContent);
    }
}
