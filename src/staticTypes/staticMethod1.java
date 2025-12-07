package staticTypes;

public class staticMethod1 {
    static int a = staticMethod1.meth1();
    static int b = staticMethod1.meth2();

    static int meth1()
    {
        System.out.println("static meth1() called");
        return 100;
    }
    static int meth2()
    {
        System.out.println("static meth2() called");
        return 200;
    }
    static
    {
        System.out.println("1st static block executed: " +a);
    }
    public static void main(String[] args)
    {
        System.out.println("main() called: " + (a+b));
    }
    static
    {
        System.out.println("1st static block executed: " +b);
    }

}
