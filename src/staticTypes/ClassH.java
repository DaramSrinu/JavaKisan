package staticTypes;

public class ClassH {
    int x = 12;
    static int y = 45;
    void m1(){
        System.out.println("instance method m1()");
    }
    void m2(){
        System.out.println(x);
        new ClassH(500).m1();
        System.out.println(y);
        m3();
        System.out.println("Instance method m2()");
    }
    static void m3(){
        System.out.println("static method m3()");
    }
    ClassH(int a){
        y = a;
    }
    ClassH(){
        y=50-38;
    }
    public static void main(String[] args){
        System.out.println(y);
        m3();
        ClassH h = new ClassH();
        System.out.println(h.x);
        h.m2();
    }
}
