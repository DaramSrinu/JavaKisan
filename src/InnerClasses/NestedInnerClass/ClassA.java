package InnerClasses.NestedInnerClass;

public class ClassA {
    private void meth1(){
        System.out.println("I am from outer class method");
    }
    class InnerClass{
        void show(){
            System.out.println("I am from Inner Class method");
            meth1();
        }
        InnerClass(){
            System.out.println("Inner CLass Constructor");
        }
    }
    ClassA(){
        System.out.println("Outer class Constructor");
    }
    public static void main(String[] args) {
       ClassA.InnerClass iobj  =  new ClassA().new InnerClass();
       iobj.show();
       // iobj.meth1(); // C.E
        System.out.println("-------------");
       new ClassA().meth1();
    }
}
