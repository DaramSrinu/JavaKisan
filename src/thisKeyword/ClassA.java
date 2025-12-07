package thisKeyword;

public class ClassA {
    int a = 10;
    static int b = 20;

    void meth1(){
        int a =1000;
        int b = 30;
        System.out.println("meth1() called");
        System.out.println("Instance Variable : " +this.a);
        System.out.println("Static Variable : " +ClassA.b);
        System.out.println("Static Variable : " +this.b);

        System.out.println("Local Variable: " + b);
    }
    void meth2(){
        System.out.println("meth2() called");
        //new ClassA().meth3();
        this.meth3();
        //meth3(); // Compiler will by default add this keyword for calling meth3()
    }
    void meth3(){
        System.out.println("meth3() called");
    }
    ClassA meth4(){
        System.out.println("meth4() called");
        //return new ClassA();
        return this;
    }
    ClassA meth5(){
        System.out.println("meth5() called");
        return this;
    }
    int meth6(){
        System.out.println("meth6() called");
        return 99;
    }

    public static void main(String[] args){
        ClassA aobj = new ClassA();
        //aobj.meth1();
        //aobj.meth2();
        //this.meth2(); // C.E Because we can't use 'this' keyword inside a static area
        int result = aobj.meth5().meth4().meth6();
        System.out.println(result);
    }

}
