package Constructors;

public class Constructor {
    Constructor() //1st constructor
    {
        new Constructor(100).meth2();
       System.out.println("I am from Non-Parameterized Constructor");
    }
    Constructor(int a) //2nd constructor with 1 parameter
    {
        System.out.println("Parameterized Constructor: " +a);
        new Constructor(99,1).meth3();

    }
    Constructor(int a, int b)  //3rd constructor which is having 2 int data types a parameter
    {
        System.out.println("Addition : "+ (a+b));
    }
    void meth1(){
        System.out.println("meth1 called");
    }
    void meth2(){
        System.out.println("meth2 called");
    }
    void meth3(){
        System.out.println("meth3 called");
    }

    public static void main(String[] args){
        System.out.println("Start");
        Constructor c = new Constructor();
        c.meth1();
        System.out.println("End");
    }
}
