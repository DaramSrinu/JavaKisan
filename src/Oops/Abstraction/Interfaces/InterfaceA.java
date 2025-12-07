package Oops.Abstraction.Interfaces;

public interface InterfaceA {
    void meth1();

    default void meth2() // Allowed from Java 1.8v
    {
        System.out.println("default method of InterfaceA");
        this.meth4();
    }
    static void meth3() // Allowed from Java 1.8v
    {
        System.out.println("static method of InterfaceA");
        //this.meth4(); // C.E because we can't use this keyword inside a static area
    }
    private void meth4() // Allowed from Java 1.9v
    {
        System.out.println("private method of InterfaceA");
    }
    default void disply(){
        System.out.println("Interface A display()");
    }

    public static void main(String[] args) {
        System.out.println("main() of InterfaceA");
        InterfaceA.meth3();
    }
}
