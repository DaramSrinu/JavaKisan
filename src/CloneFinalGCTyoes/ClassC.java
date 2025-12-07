package CloneFinalGCTyoes;

public class ClassC {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Implementing Clone");
        ClassA aobj1 = new ClassA();
        aobj1.a = 10;
        aobj1.b = 20;

        System.out.println(aobj1.a +" " + aobj1.b);

        ClassA aobj2 = aobj1;
        aobj2.b = 200;
        System.out.println(aobj1.a +" " + aobj1.b + " " + aobj2.b);
        System.out.println("---------------------------");

        ClassB bobj1 = new ClassB();
        bobj1.x = 100;
        bobj1.y = 200;
        System.out.println(bobj1.x +" " + bobj1.y); // 100,200

        // Cloned
        ClassB bobj2 = (ClassB)bobj1.show();
        bobj2.y = 999;
        System.out.println(bobj1.x +" " + bobj1.y + " " + bobj2.y +" "+ bobj2.x);  // 100,200, 999, 100

        // Not Cloned
        ClassB bobj3 = new ClassB();
        bobj3.y = 888;
        System.out.println(bobj1.x +" " + bobj1.y + " " + bobj3.y +" "+ bobj3.x);  // 100, 200, 888, 0



    }
}
