package TypeCasting;

public class ClassB {
    void implicit() {
        byte b = 10;
        System.out.println("byte value is " + b); // 10
        short s = b;
        System.out.println("short value is " + s); // 10
        s++;
        int i = s++;
        System.out.println("int value is " + i); // 11
        System.out.println("short value is " + s); // 12
        long l = i; // 11
        System.out.println("long value is " + (--l)); // 10
        float f = l; // 10.0
        System.out.println("float value is " + (f + b));  // 10.0 + 10.0 = 20.0
        double d = (--f);
        System.out.println("double value is " + d); // 9.0
        show();
        if (!(d == f)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
        public static void main(String[]  args){
               ClassB b = new ClassB();
               b.implicit();
        }
        static void show(){
        char c = 'A';
        int a = ++c;
        System.out.println(a);
        ClassB obj = new ClassB();
        String s = obj.meth1();
        System.out.println(s);
        }
        String meth1(){
        String S = "Implicit casting is done by the compiler automatically";
        return S;
        }
}
