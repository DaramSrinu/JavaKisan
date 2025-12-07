package Constructors;

public class ClassC {
    void meth1(){
        System.out.println("meth1() called");
        return;
    }
    public ClassC(int i){
        System.out.println("Parameterized Constructor: " + i);
        new ClassC();
        return;
    }
    private ClassC(){
        System.out.println("Default Constructor");
        return;
    }
    public static void main(String[] args){
        ClassC aobj = new ClassC(50);
        aobj.meth1();
    }
}
