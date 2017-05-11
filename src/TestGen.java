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
    String assertS = "";
    String assertS1 = "Assert.areequal(";
    String varA = "var result = ";
    String main = "public static void main(){ \n";
    String classA = "// unit test code  \n" +
            "using System;  \n" +
            "using Microsoft.VisualStudio.TestTools.UnitTesting;  \n" +
            "  \n" +
            "namespace BankTests  \n" +
            "{  \n" +
            "    [TestClass] \n";
    String fileSaveAs = "";
    String functionCallInput = "";
    String functionName = "";
    String testerfunctionName = "";
    String testerfunction = "";
    String functionCall = "";
    String testerCall = "";
    String classToBeTestedName = "";
    String file = "";
    String functionCallOutput = "";
    String createInstanceClass ="";


    @Override
    public void exitS(@NotNull TestGenParser.SContext ctx) {
        main = main.concat("\n}\n");
        classA = classA.concat(main);
        classA = classA.concat("\n}\n");
        classA = classA.concat("using ");
        classA = classA.concat(classToBeTestedName);
        classA = classA.concat(";\n }");
        try{
            File out = new File(fileSaveAs);
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
        testerfunction=testerfunction.concat(assertS);
        testerfunction=testerfunction.concat("\n}\n");
        classA=classA.concat(testerfunction);
        main=main.concat(testerCall);
        functionName = "";
        testerfunctionName = "";
        testerfunction = "";
        functionCall = "";
        testerCall = "";
        functionCallOutput = "";
        functionCallInput = "";
        assertS ="";

    }

    @Override
    public void enterClassName(@NotNull TestGenParser.ClassNameContext ctx) {
        String text = ctx.getStart().getText();
        classToBeTestedName = classToBeTestedName.concat(text);
        createInstanceClass = createInstanceClass.concat(text);
        createInstanceClass = createInstanceClass.concat(" x = new ");
        createInstanceClass = createInstanceClass.concat(text);
        createInstanceClass = createInstanceClass.concat(";\n");
        main = main.concat(createInstanceClass);
        fileSaveAs = fileSaveAs.concat("test");
        fileSaveAs = fileSaveAs.concat(text);
        fileSaveAs =fileSaveAs.concat(".cs");
        classA = classA.concat("class ");
        classA = classA.concat("test");
        classA = classA.concat(text);
        classA = classA.concat("{ \n");
    }

    @Override
    public void enterFuncname(@NotNull TestGenParser.FuncnameContext ctx) {
        String text = ctx.getStart().getText();
        functionName = text;
        testerfunctionName = "test";
        testerfunctionName= testerfunctionName.concat(text);
        testerfunction=testerfunction.concat(startFunction);
        testerfunction=testerfunction.concat(testerfunctionName);
        testerfunction=testerfunction.concat("(){\n");
        functionCall=functionCall.concat(functionName);
        functionCall=functionCall.concat("(");
        functionCall=functionCall.concat(functionCallInput);
        assertS = assertS.concat( assertS1);
        assertS = assertS.concat(functionCall);
        assertS = assertS.concat(",");
        assertS = assertS.concat(functionCallOutput);
        assertS = assertS.concat(");\n");
        testerCall=testerCall.concat(testerfunctionName);
        testerCall=testerCall.concat("(x);\n");


    }

    @Override
    public void enterInparams(@NotNull TestGenParser.InparamsContext ctx) {
        String text = ctx.getStart().getText();
        //System.out.println(text);
        functionCallInput = functionCallInput.concat(text);
        functionCallInput = functionCallInput.concat(")");
    }

    @Override
    public void enterOutparams(@NotNull TestGenParser.OutparamsContext ctx) {
        String text = ctx.getStart().getText();
        System.out.println(text);
        functionCallOutput = functionCallOutput.concat(text);
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
    }
}