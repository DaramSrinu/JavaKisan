package Constructors;

public class ProgrammingConstructor {
    ProgrammingConstructor(){
        System.out.println("I Love Programming Languages" );
    }
    ProgrammingConstructor(String name){
        System.out.println("I love "+name);
    }
    void meth1(){
        System.out.println("meth1() called");
    }
    public static void main(String[] args){
        ProgrammingConstructor pc = new ProgrammingConstructor();
        pc.meth1();
        ProgrammingConstructor pc1 = new ProgrammingConstructor("Java");
    }
}
