package Oops.Abstraction.Interfaces;

public class ClassA extends ClassB implements InterfaceA,InterfaceB {

    public void meth1(){
        System.out.println("Interface A abstract method Overridden");
    }
    public void show(){
        System.out.println("Interface B abstract method Overridden");
    }
    public void display(){
        InterfaceA.super.disply();
        InterfaceB.super.display();
    }

    public static void main(String[] args) {
        InterfaceA aobj = new ClassA();
        aobj.meth1();
        aobj.meth2();
        //aobj.meth3(); // C.E
        InterfaceA.meth3();
        //aobj.meth4(); // C.E
        System.out.println("-----------");
        InterfaceB bobj = new ClassA();
        bobj.show();
        System.out.println("-----------");
         ClassA obj = new ClassA();
         obj.display();
         obj.msg();
    }
}

