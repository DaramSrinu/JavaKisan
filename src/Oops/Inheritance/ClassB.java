package Oops.Inheritance;

public class ClassB extends ClassA {
    void meth2(){
        System.out.println("Class B method");
    }
    public static void main(String[] args) {
        ClassA aobj = new ClassA(); // HAS - A - Relationship
        aobj.meth1();
        // aobj.meth2(); C.E
        System.out.println("--------------");

        ClassA aobj1 = new ClassB();
        aobj1.meth1();
        // aobj1.meth2(); C.E
        System.out.println("--------------");

        ClassB bobj = new ClassB();  // IS - A - Relationship
        bobj.meth1();
        bobj.meth2();

        // ClassB bobj1 = new ClassA(); //  Invaild we will getting Compile time Error
    }
}
