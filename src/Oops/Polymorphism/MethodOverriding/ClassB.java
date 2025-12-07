package Oops.Polymorphism.MethodOverriding;

public class ClassB extends ClassA{
    void meth1(){
        System.out.println("Class B method() called");
    }

    void meth2(int a) {
        System.out.println("Hello");
    }
    void meth3(String s){
        System.out.println("Hello " + s);
    }
    ClassB meth4(){
        System.out.println("Co-varient return types");
        return new ClassB();
    }
    static void meth5(){
        System.out.println("ClassB Static method called");
    }

    public static void main(String[] args) {
       ClassA aobj = new ClassB();
       aobj.meth1();  // Class B method will executed
        aobj.meth2(10);
       aobj.meth3("Java");
        aobj.meth4();
        aobj.meth5();
      ClassA aobjA = new ClassA();
      aobjA.meth1(); // Class A method wil executed
      aobjA.meth2(20);
      aobjA.meth3("java");

    }
}
