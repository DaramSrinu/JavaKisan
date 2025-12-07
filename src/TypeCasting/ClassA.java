package TypeCasting;

public class ClassA {
    void implicit()
    {
       System.out.println("Performing implcit type casting");
       byte b = 20;
       int  i = b;

       System.out.println("byte value: " + b);
       System.out.println("int value: " + i);
       System.out.println("----------------------");

       char c = 'A';
       int j = c;

        System.out.println("char value: " + c); // A
        System.out.println("int value: " + j); // 65
    }
    int meth1(){
        System.out.println("meth1() called");
        System.out.println("int & char both are compatable");
        return 'A';   // 65 ---> Ascii Value of A
    }
    void explicit()
    {
        System.out.println("Performing explicit type casting");

        int  x = 50;
        byte b1 = (byte)x;

        System.out.println("int value: " + x); // 50
        System.out.println("byte value: " + b1);  // 50
        System.out.println("----------------------");

        int x1 = 500;
        byte b2 = (byte)x1;
        System.out.println("int value: " + x1); // 500
        System.out.println("byte value: " + b2); // -12

        // [MinimumRange + (result - maximumRange - 1)]
        // -128 + (500-128) ==> -128 + (372) ==> 244
        // -128 + (244-128) ==> -128 + 116 ==> -12
        System.out.println("----------------------");

        float f = 10.9999f;
        byte b3 = (byte)f;
        System.out.println("float value : " + f); // 10.0001
        System.out.println("byte value : " + b3); // 10
    }



    public static void main(String[] args){
        ClassA aobj = new ClassA();
        aobj.implicit();
        System.out.println("==================");
        System.out.println(aobj.meth1() + 'A');
        System.out.println("==================");
        aobj.explicit();
    }
}
