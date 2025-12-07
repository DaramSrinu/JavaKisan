package Oops.Abstraction;

public abstract class ClassA {
    abstract void meth1();
    abstract String meth1(String s);

    void meth2(){
        System.out.println("meth2() called");
    }
    static void meth3(){
        System.out.println("meth3() called");
    }
    ClassA(){
        System.out.println("Abstract class constructor called");
    }

    public static void main(String[] args) {
        System.out.println("Abstract class main() called");
        // ClassA aobj = new ClassA(); C.E ClassA' is abstract; cannot be instantiated
        ClassA.meth3();
    }
}
