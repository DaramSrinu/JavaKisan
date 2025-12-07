package TypeCasting;

public class ClassC {
    void display()
    {
        byte x;
        int a = 270;
        double b = 128.128;
        x = (byte)a;
        System.out.println("a and x " + a + " " + x);
        a = (int)b;
        System.out.println("b and a " + b + " " + a);
        x = (byte) b;
        System.out.println("b and x " + b + " " + x);
    }
    public static void main(String[] args){
        ClassC c = new ClassC();
        c.display();
    }
}
