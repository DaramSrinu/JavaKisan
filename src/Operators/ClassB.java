package Operators;

public class ClassB {
    void meth1() {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;  //c=3 b=3
        d = a++;  //d=1, a=2
        c++; // c=4
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int e = 10;
        int f = e++ + ++e;  //f = 10  + 12 = 22
        System.out.println(e);
        System.out.println(f);

        int a1 = 34;  //34
        int b1 = 21;   // 21
        int c1 = a1++   +  ++b1;   // 34  +  22 = 56
        int d1 = --a1 + --b1 + c1--; // 34 + 21 + 56 = 111
        int e1 = a1 +  +b1 + +c1 + d1--; // 34 + 21 + 55 + 111 =221
        int f1 = -a1 + b1 -- + -c1 - d1++; // -34 + 21 - 55 - 110 = -178
        int sum = a1 + b1 + c1 + d1 + e1 + f1; // 34 + 20 + 55 + 111 + 221 - 178 = 263
        System.out.println("sum = " + sum);



    }
    public static void main(String[] args){
        new ClassB().meth1();
    }
}