package thisKeyword;

public class thisConstructor {
    thisConstructor() {
        this("Java");
        System.out.println("Default Constructor");
    }

    thisConstructor(int a) {
        this();
        System.out.println("Parametrized Constructor: " + a);
        //this(); // C.E Because we need to call this() in first statement in the constructor
        this.meth1();
    }
    thisConstructor(String s){
        System.out.println(s);
    }

    void meth1() {
        System.out.println("meth1() called");
        //this();//C.E Because 'this()' only allowed in constructor body
    }

    String meth2(String s) {
        System.out.println("meth2 called");
        return s;
    }

    public static void main(String[] args){
        thisConstructor tc = new thisConstructor(10);
        //tc.meth1();
        String s1 = tc.meth2("Java is awesome!");
        System.out.println(s1);
    }
}
