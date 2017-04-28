import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TestGen extends TestGenBaseListener{
    ArrayList<String> symTable = new ArrayList<String>();
    int listExits = 0;
    String Total;
    String startFunction= "[TestMethod] \n public void ";
    String assertS = "Assert.areequal(";
    String varA = "var result = ";
    String main = "public static void main(){ \n";
    String classA = "class autoGenteratedTest{ \n";
    String fileSaveAs = "autoGenteratedTest";
    String functionName = "";
    String testerfunctionName = "";
    String testerfunction = "";
    String functionCall = "";
    String testerCall = "";
    String classToBeTestedName = "";
    String file = "";


    @Override
    public void exitS(@NotNull TestGenParser.SContext ctx) {
        main = main.concat("\n}\n");
        classA = classA.concat(main);
        classA = classA.concat("}");
        System.out.print(classA);
        try{
            File out = new File("test1.txt");
            FileWriter writer = new FileWriter(out);
            writer.write(classA);
            writer.flush();
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void exitT(@NotNull TestGenParser.TContext ctx) {
        testerfunction=testerfunction.concat("}\n");
        classA=classA.concat(testerfunction);
        main=main.concat(testerCall);
        functionName = "";
        testerfunctionName = "";
        testerfunction = "";
        functionCall = "";
        testerCall = "";
    }

    @Override
    public void enterFuncname(@NotNull TestGenParser.FuncnameContext ctx) {
        String text = ctx.getText();
        functionName=functionName = text;
        testerfunctionName= testerfunctionName = "test";
        testerfunctionName= testerfunctionName.concat(text);
        testerfunction=testerfunction.concat(startFunction);
        testerfunction=testerfunction.concat(testerfunctionName);
        testerfunction=testerfunction.concat("(){");
        functionCall=functionCall.concat(functionName);
        functionCall=functionCall.concat("(");
        testerCall=testerCall.concat(testerfunctionName);
        testerCall=testerCall.concat("(");


    }

    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream("test.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputstream);

        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        TestGenLexer lexer = new TestGenLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TestGenParser parser = new TestGenParser(tokens);

        TestGen test = new TestGen();
        parser.addParseListener(test);

        ParseTree tree = parser.s(); // parse the input stream starting at rule start
        System.out.println(tree.toStringTree(parser));
    };
}