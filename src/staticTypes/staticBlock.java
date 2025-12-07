package staticTypes;

public class staticBlock {
    final static int i;
    void meth1()
    {
        // i = 50 // C.E // We can't initilize a final static variable inside a normal method.
    }
    static void meth2()
    {
        // i = 50 // C.E // We can't initilize a final static variable inside a static method.
    }
    static
    {
        i=50;
        System.out.println("1st static block called : " + i);
    }
    public static void main(String[] args)
    {
        System.out.println("main() called : " + i);
    }
    static {
        //i=45;  //C.E // final variable are CONSTANTS
        System.out.println("2st static block called : " + i);

    }
}
