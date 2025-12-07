package Oops.Polymorphism.MethodOverriding;

public class ClassA {
    void meth1(){
        System.out.println("Class A meth1() called");
    }
    void meth2(int a){
        System.out.println("Hii");
    }
    void meth3(String s){
        System.out.println("Hii " + s);
    }
    ClassA meth4(){
        System.out.println("Class A meth4() ");
        return new ClassA();
    }
    static void meth5(){
        System.out.println("Class A static method");
    }
}
