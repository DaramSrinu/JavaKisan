package Datatypes_Variables;

public class Variables {
    int a = 10; // Instance Variable
    static int b = 20; // Static VAriables

    // static String a = "Java"; // C.E [Because we can't write same name for instance &static variables]
    int x; //Instance Variable
    static int y; // Static Variable

    boolean flag; // Instance Variable

    void meth1(){
        System.out.println("meth()1 called");
        int c = 30; // Local Variable
        System.out.println("Instance Variable a :" + a);
        System.out.println("Instance Variable a :" + new Variables().a);
        System.out.println("------------------------------");
        System.out.println("Static Variable b :" + b);
        System.out.println("Static Variable b :" + new Variables().b);
        System.out.println("Static Variable b: " + Variables.b );
        System.out.println("------------------------------");
        System.out.println("Local Variable c : " + c );
    }
    void meth2(){
        System.out.println("meth2() called");
        int z; //local variable
        System.out.println("Instance Variable x :" + x);
        System.out.println("Instance Variable flag :" + flag);
        System.out.println("Static Variable y :" + y);
       // System.out.println("Local Variable z :" + z); Compile Time Error , Because inside a method need to be initialized.
    }
    void meth3(){
        System.out.println("meth3 called");
        int a = 100;
        int b = 200;
        int c = 300;
        System.out.println("Instance Variable a: " + new Variables().a); // 10
        System.out.println("Static Variable b:" + Variables.b); // 20
        System.out.println("Local variable a : " + a );
        System.out.println("Local variable b : " + b );
        System.out.println("Local variable c : " + c );
    }
    public static void main(String[] args){
        Variables v = new Variables();
        v.meth1();
        System.out.println("=====================");
        v.meth2();
        System.out.println("=====================");
        v.meth3();
    }
}
