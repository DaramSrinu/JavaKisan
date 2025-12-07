package thisKeyword;

public class ClassB {
    void meth1() {
        System.out.println("meth1() called");
        meth2(10,90).meth3();
    }

    ClassB meth2(int a, int b) {
        System.out.println("meth2() called");
        return this;
    }
    void meth3(){
        System.out.println("meth3() called");
        this.meth4();
        // we can access static methods also with the help of 'this'
        // But we can't use 'this' inside a static area/context.
    }
    static void meth4(){
        System.out.println("meth4() called");
    }

public static void main(String[] args){
       new ClassB().meth1();
    }
}
