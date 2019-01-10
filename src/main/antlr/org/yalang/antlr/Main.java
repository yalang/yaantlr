package org.yalang.antlr;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        App.run(Main.class, args);

        try {
            ParserFacade parserFacade = new ParserFacade();
            AstPrinter astPrinter = new AstPrinter();
            astPrinter.print(parserFacade.parse(new File("examples/وظيفة.ي")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
