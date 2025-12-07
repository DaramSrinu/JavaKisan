package Datatypes_Variables;

public class dataTypes {
    int i;
    short s;
    byte b;
    long l;
    float f;
    double d;
    char c;
    boolean bl;
    void meth1(){
        System.out.println("int default value of i: " +i);
        System.out.println("short default value of s: " +s);
        System.out.println("byte default value of b: " +b);
        System.out.println("long default value of l: " +l);
        System.out.println("float default value of f: " +f);
        System.out.println("double default value of d: " +d);
        System.out.println("char default value of c: " +c); // for char we have take only 1 byte storage with single quotes.
        System.out.println("boolean default value of bl: " +bl);
    }
    void meth2(){
        int a = 100;
        int b = 100;
        int c = a+b;
        System.out.println(c);

        float f1 = 10.9f;
        System.out.println(f1);

        long l1 = 253563236L;
        System.out.println(l1);

        char c1 = 'D';
        System.out.println(c1);

        boolean b1= true;
        System.out.println(b1);
    }
    public static void main(String[] args){
        dataTypes aobj = new dataTypes();
        aobj.meth1();
        aobj.meth2();
    }
}
