package Oops.Inheritance;

public class SuperClass extends Superdifference {
    void meth2(){
        System.out.println("Super Class meth2() called");
    }
    void display(){
        System.out.println("Hello");
    }
    SuperClass(){
        System.out.println("Super class default Constructor");
    }
    SuperClass(String a){
        //this();  // we cannot use this() and super() both inside a single constructor
        super("Hello World");
        super.show();
        this.display();
        System.out.println("Super Class Parameterized called : " + a);
    }

    public static void main(String[] args) {
        SuperClass sC = new SuperClass("Java");
        sC.meth2();
    }
}
