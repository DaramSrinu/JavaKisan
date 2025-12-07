package ConditionalStatements;

public class forLoop {
    void meth1(){
        System.out.println("Meth1() called");
        for(int i =0; i <= 3; i++){
            System.out.println("i value :" + i);
        }
        System.out.println("meth1() execution completed");
    }
    void meth2(){
        System.out.println("Meth2() called");
        for(int i =0; i <= 10; i++){
            System.out.println("i value :" + ++i);
            //i++;
        }
        System.out.println("meth2() execution completed");
    }
    void meth3(){
        System.out.println("Meth3() called");
        int i = 1;
        for(; i <= 5;){
            System.out.println("i value :" + i);
            i++;
        }
        System.out.println("meth3() execution completed");
    }
    void meth4() //Generates an infinte loop
    {
        System.out.println("Meth4() called");
        int i = 1;
        for(; i <= 5;)
            //int x = 90; // C.E because we should not write any declerative statements here
            System.out.println("i value :" + i);
            i++;
        System.out.println("meth4() execution completed");
    }
    void meth5(){
        int i = meth7();
        for( System.out.println("Meth5() called"); i <= 5; meth6()){
            System.out.println("i value :" + i);
            i++;
        }
        System.out.println("meth5() execution completed");
    }
    static void meth6(){
        System.out.println("------------------");
    }
    static int meth7(){
        System.out.println("Java is awesome");
        return 100-99;
    }
    void meth8() // Generates an infinte loop
    {
        System.out.println("Meth8() called");
        int i = 1;
        for(;;){
            System.out.println("i value :" + i);
            i++;
        }
        //System.out.println("meth8() execution completed"); // C.E (because unreachable code)
    }
   /* void meth9(){
        System.out.println("Meth9() called");
        int i = 1;
        for(System.out.print("Java "),System.out.println(" is awesome");
        i <= 5;System.out.println("Hi"),System.out.println("-----------"))
        {
            System.out.println("i value :" + i);
            i++;
        }
        System.out.println("meth3() execution completed");
    }*/

    public static void main(String[] args){
        forLoop fl = new forLoop();
        fl.meth1();
        fl.meth2();
        fl.meth3();
        //fl.meth4();
        fl.meth5();
        //fl.meth8();
        //fl.meth9();
    }
}
