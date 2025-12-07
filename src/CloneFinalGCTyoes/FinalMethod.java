package CloneFinalGCTyoes;

public class FinalMethod extends FinalVariable {
    //void meth1() // C.E because final methods can't be Overridden
        void meth10(){

            System.out.println("final method called");
    }

    public static void main(String[] args) {
        new FinalMethod().meth1();
    }
}

/*
private method:
---------------
Private methods can't be inherited so they can't be overridden

final Method:
-------------
we can inherit a final method but we can't write override a final method
 */