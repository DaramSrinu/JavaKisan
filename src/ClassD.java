public class ClassD {
    void meth1(){
        System.out.println(10);
        System.out.println(20);
        System.out.println(30);
        return;
    }
    int meth2(int a, int b){
        System.out.println("meth2() called");
        System.out.println("a value :" + a);
        System.out.println("b value :" + b);
       return (a+b)+a;
       // System.out.println("Hello World!!!"); Compile Error unreachable statements
    }
    String meth3(int a){
        System.out.println("meth3() called");
        System.out.println("Java is awesome");
        if(a > 50){
            System.out.println("If block executed");
            return "Hi";
            // System.out.println("Java"); Compile Error unreachable statements
        }else{
            System.out.println("Else block executed");
            return "Hello";
            // System.out.println("Java"); Compile Error unreachable statements
        }
    }
    int meth4(){
        System.out.println("meth4() called");
        return 'A'; // int & char data types both are compatable
    }

    public static void main(String[] args){
        System.out.println("Start");
        ClassD dobj = new ClassD();
        dobj.meth1();
        System.out.println("------------------------");
        System.out.println("===>" + dobj.meth2(10,20));
        System.out.println("------------------------");
        System.out.println("===>" + dobj.meth3(10));
        System.out.println("------------------------");
        System.out.println("===>" + dobj.meth4());

        System.out.println("End");


    }
}
