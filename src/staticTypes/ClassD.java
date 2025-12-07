package staticTypes;

public class ClassD {
    static int x =10;
    int y=10;
    public static void main(String[] args){
        ClassD t1 = new ClassD();
        ClassD t2 = new ClassD();
        t1.x=20;
        t1.y=20;
        System.out.print(x+" ");
        System.out.println(t2.x);
        System.out.println("-------");
        System.out.print(t1.y+" ");
        System.out.println(t2.y);

    }
}
