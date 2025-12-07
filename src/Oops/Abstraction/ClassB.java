package Oops.Abstraction;

public class ClassB extends ClassA{
    @Override
    void meth1() {
        System.out.println("Abstract method Overridden");
    }
    @Override
    String meth1(String s) {
        System.out.println("Abstract methods can be overloaded");
        return s;
    }
    ClassB(){
        super();
        System.out.println("Class B constructor");
    }
    public static void main(String[] args) {
        ClassA aobj = new ClassB();
        aobj.meth1();
        System.out.println(aobj.meth1("Java is awesome"));
        System.out.println("-----------------");
        aobj.meth2();
    }
}
