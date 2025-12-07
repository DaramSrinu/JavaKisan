package InnerClasses.StaticInnerClass;

public class ClassA {
    int a = 10; // Instance
    static int b = 20;
    void  meth1(){
        System.out.println("Outer Class Method");
    }
    static class InnerClass{
        void show(){
            System.out.println("Outer Class Instance Variable " + new ClassA().a);
            System.out.println("Outer Class Static Variable " + b);
            // this.meth1();  // C.E because we cant use 'this' keyword inside a static area
            new ClassA().meth1();
        }
        static {
            System.out.println("Inner class static block");
        }
        InnerClass(){
            System.out.println("Inner class Constructor");
        }

        public static void main(String[] args) {
            System.out.println("Inner class main() method");
            new InnerClass().show();
        }
    }
    ClassA(){
        System.out.println("------- Outer Class Constructor ---------");
    }
    static {
        System.out.println(" @@@@@@@@@@@@ Outer Class static Block @@@@@@@@@@@");
    }

    public static void main(String[] args) {
        System.out.println("Outer Class main()");
        ClassA.InnerClass iobj = new ClassA.InnerClass();
        iobj.show();
    }
}
