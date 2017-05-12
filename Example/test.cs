class MathOps
{
    /*
    * ^in: 12.6f,3.0f | out: 4.2f $
    */
    public float Divide(float c, float d){
        return (c / d);
    }
    public int c(int a, int b, int c){
        return c;
     }
    public int b(int a, int b, int c){
        return b;
     }
    public int a(int a, int b, int c){
        return a;
     }
    /*
    * ^in: 12.6f,3.0f | out: 3.0f $
    * ^in: 12.6f,13.0f | out: 25.6f $
    */
    public float Add(float c, float d){
        if (c < d){
            return c + d;
        }
        /* test */
        return d;
    }
    public string helloworld(){
        return "hello world";
    }
    private void printhelloworld(){
        // this is how c# writes to console
        //ConWriteLine(helloworld());
    }
    /*
    * ^in: 10,12,14 | out: 12 $
    * ^in: 12,11,14 | out: 37 $
    */
    public int add_A_B_C(int c, int d, int f){
        if ( c < d) {
            return d;
        }
        else{
            c=(int)Add((float)c,(float)d);
         return c + d + f;
        }
    }
    /*
    * ^in: 6,10 | out: 10 $
    * ^in: 3,7 | out: 10 $
    */
    public int AddToString(int e, int f){
        return f;
    }
}