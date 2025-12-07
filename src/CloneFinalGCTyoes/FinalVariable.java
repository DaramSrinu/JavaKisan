package CloneFinalGCTyoes;

public class FinalVariable   // if a class mark as final that classes can't be Inherited
     {
    final int a = 10;
    final void meth1(){
        System.out.println(" meth1() called");
       // System.out.println(a++);
        // System.out.println(++a); // C.E because we final variables are constant
    }

    public static void main(String[] args) {
        new FinalVariable().meth1();
    }
}
