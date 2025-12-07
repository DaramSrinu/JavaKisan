package Java8Features.MethodReferences;

public class ClassA {
    void show(){
        System.out.println("Implementing Method References");
        //InterfaceA x = new ClassB().m1(); // C.E
        //InterfaceA x = new ClassB()::m1(); // C.E
        //InterfaceA x = new ClassB()::m1; // Non-static method Referencing
       // InterfaceA x = ClassB::m2;  // Static method Referencing
       InterfaceA x = ClassB::new; // Constructor method Referencing
        x.meth1();
    }
    public static void main(String[] args) {
        new ClassA().show();
    }
}
