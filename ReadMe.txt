Introduction
=======
Both unit testing and writing comments are important programming practices. However, very few programmers enjoy creating unit tests or writing comments, so these practices often go undone, or put off until the end. The process of writing unit tests would be much more natural if they could be written in comments in the code file itself. This would also encourage programmers to have comments in their code, and provide a way for people looking at the code in the future to understand what each function should be doing. We set out to use ANTLR to create a translate to generate these unit tests from comments. We hope to both provide a tool that is useful and to inspire programmers to follow good programming practices. Hopefully, this DSL/translator will show people that unit tests and comments are worth the effort that must be put into creating them.

What it can be used for and how to use it
=====
This DSL can be used to create a unit test class from any c# file that follows the couple limitations and instructions bellow
This is how it is done:
Make C# file following the Instructions section below for how to write the comments in it.
Then open testgen.java and write the filename of the file that you want the unit tests auto generated.
Then run the testgen.java file and it will output a .cs file with the test[class name] as the file name. 
At this point do whatever you want with the auto generated unit test.


Instructions
=====
Our parser can be used to generate unit tests from comments placed before a function. Each unit test must be placed inside a block comment directly above its function declaration. The following symbols are used by our grammar to generate the unit tests:
- “^” is the start of a unit test
- “$” is the end of a unit test
- “|” separates the parameters given for input and the expected output
- Anything between “in:” and “|” will be used as parameters for the unit test. Use commas to separate parameters if there is more than one.
- Anything between “out:” and “$” will be the expected output that we assert in the unit test.

Limitations
=====
At this point in the DSL has a couple limitations these are:
We cannot make comments except those to test functions outside of functions however inside of functions comments can be made.
Also the Lexer does not completely parse the file without errors. However, the errors that it gets do not affect the output or any of the functionality in the translation part of the project.
Other than these two limitations we do not know of any that exist in this DSL.

Lexer 
=====
This shows the parse tree and the errors that we get but it also shows that the places we are getting errors does not matter to the rest of the project.

Output screenshot (michael)


Parser
=====


Translator
=====
The screenshot below shows us that with a rather complex input c# file with a lot of edge cases tested the output is what we expected. 

(screenshot)