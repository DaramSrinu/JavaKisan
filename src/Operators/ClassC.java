package Operators;

public class ClassC {
    void meth1(int a, int b, int c){
        System.out.println("Addition: " + (a+b+c));
        //new ClassC();
        new ClassC().meth2(100,1);
    }
    void meth2(int d, int e){
        System.out.println("Sub: " + (d-e));
    }
    ClassC(){
           int a =10;
           int b =2;
          System.out.println("Division: "+(a/b));
    }
    ClassC(String s){
        System.out.println(s+(10*2));
    }
    public static void main(String[] args){
       new ClassC("Multiplication :").meth1(10,20,30);

    }
}
