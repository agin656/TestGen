// this is auto generated unit test code writen in c# for instructions go to https://github.com/agin656/TestGen   
using System;  
using Microsoft.VisualStudio.TestTools.UnitTesting;  
using MathOps;
  
    [TestClass] 
class testMathOps{ 
[TestMethod] 
 public void testDivide(){
Assert.areequal(Divide(12.6f,3.0f), 4.2f);

}
[TestMethod] 
 public void testAdd(){
Assert.areequal(Add(12.6f,3.0f), 12.6f);
Assert.areequal(Add(12.6f,13.0f), 25.6f);

}
[TestMethod] 
 public void testAddToString(){
Assert.areequal(AddToString(6,10), "25");
Assert.areequal(AddToString(3,7), "10");

}
public static void main(){ 
MathOps x = new MathOps();
testDivide(x);
testAdd(x);
testAddToString(x);
}
}

