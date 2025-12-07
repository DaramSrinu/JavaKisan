package ConditionalStatements;

public class SelectionStatement {
    void meth1(int a){
        System.out.println("meth1() called");
        if(a <= 5) {
            System.out.println("If block executed");
            System.out.println("Hi : "+ a);
        }
        System.out.println("meth1() executed completed");
    }
    void meth2(int a){
        System.out.println("meth2() called");
        if(a >= 5)
            System.out.println("Hii");
            System.out.println("Hello");
            System.out.println("meth2() executed completed");
    }
    void meth3(int a){
        System.out.println("meth3() called");
        if(a>=5)
            //int x = 100; // C.E
            /*
            * If we are not writing flower braces in if condition only one statement is dependent on the if-statement
            * and in that single statement also we should not write any declerative statements.
            * */
            System.out.println("Hi");
            System.out.println("Hello");
            System.out.println("meth3() executed completed");
    }
    void meth4(int a){
        System.out.println("meth4() called");
        if(false){
            System.out.println("If block executed");
            System.out.println("Hi : "  + a);
        }
        System.out.println("meth4() execution completed");
    }
    void meth5(int a){
        System.out.println("meth5() called");
        if(a<=10){
            System.out.println("If block executed");
            System.out.println("Hi");
        }
        else {
            System.out.println("Else block executed");
            System.out.println("Hello");
        }
        System.out.println("meth5() execution completed");
    }
    void meth6(int a){
        System.out.println("meth6() called");
        if(a<=10)
            System.out.println("If block executed");
        else
            System.out.println("Else block executed");
        System.out.println("hi");
        System.out.println("meth6() execution completed");
    }
    void meth7(int a){
        System.out.println("meth7() called");
        if(a>0){
            System.out.println(a + "is a positive number");
        }else if(a<0){
            System.out.println(a + "is a negative number");
        }else{
            System.out.println(a + " is equal to 0");
        }
        System.out.println("meth7() execution completed");
    }
    public static void main(String[] args){
        SelectionStatement ss = new SelectionStatement();
        ss.meth1(300);
        ss.meth2(3);
        ss.meth3(2);
        ss.meth4(1000);
        ss.meth5(25);
        ss.meth6(60);
        ss.meth7(0);
    }
}
