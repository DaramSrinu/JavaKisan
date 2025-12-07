package CloneFinalGCTyoes;

public class GarbageCollector {
    void meth1(){
        System.out.println("meth1() called");
        ClassA obj = new ClassA(); // 3rd way All Objects created inside method
    }
    /*protected void finalize(){
        System.out.println("Garbage has been collected");
    }*/

    public static void main(String[] args) {
        GarbageCollector gc1 = new GarbageCollector(); // 1st Object
        GarbageCollector gc2 = new GarbageCollector(); // 2nd Object

        gc1.meth1();

        gc2 = gc1; // 1st way by Re-assigning the reference variable
        gc1 = null; // 2nd way by Nullifying the reference variable
        gc1.meth1(); // It will generate null pointer exception
        System.gc(); // It is used to call the garbage Collector manually

        Runtime r = Runtime.getRuntime();
        r.gc();
    }
}
