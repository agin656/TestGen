class testMathOps{ 
[TestMethod] 
 public void testAdd(){
Assert.areequal(Add(4),10);

}
[TestMethod] 
 public void testDivide(){
Divide(12.6f,3.0f),4.2f);

}
[TestMethod] 
 public void testAddToString(){
AddToString(6),"10");

}
public static void main(){ 
MathOps x = new MathOps;
testAdd(x);
testDivide(x);
testAddToString(x);

}

}