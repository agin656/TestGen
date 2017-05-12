// this is auto generated unit test code written in c# for instructions go 
//to https://github.com/agin656/TestGen   
using System;  
  
  
 
class testMathOps{ 
 public void testDivide(MathOps x){
if( x.Divide(12.6f,3.0f) == 4.2f){ Console.Out.WriteLine("Divide 0 succeeded"); }
 else{Console.Out.WriteLine(" Divide 0 failed"); } 

}
 public void testAdd(MathOps x){
if( x.Add(12.6f,3.0f) == 3.0f){ Console.Out.WriteLine("Add 0 succeeded"); }
 else{Console.Out.WriteLine(" Add 0 failed"); } 
if( x.Add(12.6f,13.0f) == 25.6f){ Console.Out.WriteLine("Add 1 succeeded"); }
 else{Console.Out.WriteLine(" Add 1 failed"); } 

}
 public void testAddToString(MathOps x){
if( x.AddToString(6,10) == 10){ Console.Out.WriteLine("AddToString 0 succeeded"); }
 else{Console.Out.WriteLine(" AddToString 0 failed"); } 
if( x.AddToString(3,7) == 10){ Console.Out.WriteLine("AddToString 1 succeeded"); }
 else{Console.Out.WriteLine(" AddToString 1 failed"); } 

}
public static void Main(){ 
MathOps x = new MathOps();
testMathOps y = new testMathOps();
y.testDivide(x);
y.testAdd(x);
y.testAddToString(x);

}

}

