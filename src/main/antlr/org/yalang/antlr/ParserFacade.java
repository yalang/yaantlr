package org.yalang.antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class ParserFacade {

    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }

    public YaParser.File_inputContext parse(File file) throws IOException {
        String code = readFile(file, Charset.forName("UTF-8"));
        YaLexer lexer = new YaLexer(CharStreams.fromString(code));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        YaParser parser = new YaParser(tokens);


        YaBaseListener extractor = new YaBaseListener();
        ParseTreeWalker.DEFAULT.walk(extractor, parser.file_input());

        return parser.file_input();
    }
}
