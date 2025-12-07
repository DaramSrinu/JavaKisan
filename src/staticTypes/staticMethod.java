package staticTypes;

public class staticMethod {
    int a =10;
    static int b = 20;

    void meth1(){
        System.out.println("--------------Normal Method----------");
        System.out.println("Instance Variable: " + a);
        System.out.println("Static Variable: " + b);
    }
    static void meth2(){
        System.out.println("--------------Static Method----------");
        System.out.println("Instance Variable: " +new staticMethod().a);
        System.out.println("Static Variable: " + b);
    }

            public static void main(String[] args){
        staticMethod sm = new staticMethod();
        sm.meth1();
        meth2();
        //sm.meth2();
        //staticMethod.meth2();
            }
}
