package Oops.Polymorphism;

public class MethodOverLoading {
    private void meth1(){
        System.out.println(10);
    }
    static final int meth1(int a){
        System.out.println(20);
        return a;
    }
    static public void meth1(int a, String s){
        System.out.println(30);
    }
    void meth1(String s, int a){
        System.out.println(40);
    }
    final protected String meth1(String s){
        System.out.println(50);
        return s;
    }
    static StringBuffer meth1(StringBuffer s){
        System.out.println(60);
        return  s;
    }
    void meth1(byte b){
        System.out.println(70);
    }

    public static void main(String[] args) {
        MethodOverLoading mo = new MethodOverLoading();
        mo.meth1();
        mo.meth1(1000);
        mo.meth1(1000,"Java");
        mo.meth1("Java", 1000);
        mo.meth1("Java");
        //mo.meth1(new StringBuffer("Java"));
        StringBuffer sb = new StringBuffer("Java");
        mo.meth1(sb);
        mo.meth1((byte)10);
        System.out.println("----------------");
        MethodOverLoading.main(1000);
        MethodOverLoading.main();
    }

    public static void main(int a) {
        System.out.println(" 1st main()");
    }

    public static void main() {
        System.out.println(" 2nd main()");
    }
    MethodOverLoading(){
        // this(); C.E because Recursive constructor invocation
        this(500);
        System.out.println("Default constructor");
        System.out.println("-----------------");
    }
    MethodOverLoading(int a){
        System.out.println("Parameterized constructor");
    }
}
