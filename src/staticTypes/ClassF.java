package staticTypes;

public class ClassF {
    static int x = m1();
    public static void main(String[] args){
        System.out.println(ClassF.x);
    }
    static{
        System.out.println(x);
        ClassF.x = x + 20;
    }
    static int m1()
    {
        ClassF.x = 50;
        return m2();
    }
    static int m2(){
        System.out.println(ClassF.x);
        return 100;
    }
}
