import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.FileInputStream;
import java.util.ArrayList;

public class TestGen {
    ArrayList<String> symTable = new ArrayList<String>();
    int listExits = 0;
    String Total;
    String start = "[TestMethod] \n public static void";
    String assertS = "Assert.areequal(";
    String varA = "var result = ";
    String functionName;
    String testerfunctionName;
    String testerfunction;
    String functionCall;
    String testerCall;


    @Override
    public void exitt(@NotNull TestGenParser.SContext ctx) {


    }

    @Override
    public void enterFuncname(@NotNull TestGenParser.SContext ctx) {
        String text = ctx.getText();
        functionName = text;
        testerfunctionName = "test";
        testerfunctionName.concat(text);
        testerfunction.concat(start);
        testerfunction.concat(testerfunctionName);
        testerfunction.concat("(){");
        functionCall.concat(functionName);
        functionCall.concat("(");
        testerCall.concat(testerfunctionName);
        testerCall.concat("(");


    }

    @Override
    public void exitS(@NotNull TestGenParser.SContext ctx) {
        Total.concat(start);

    }

    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream("test.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputstream);

        //ANTLRInputStream input = new ANTLRInputStream(System.in);

        TestGenLexer lexer = new TestGenLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TestGenParser parser = new TestGenParser(tokens);
        parser.s(); // parse the input stream starting at rule s
    };
}