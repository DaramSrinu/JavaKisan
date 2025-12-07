package staticTypes;

public class ClassG {
    static int a =0;
    int b =0;
    ClassG(){
        a++;
        b++;
        System.out.println("Static variable====> " + a);
        System.out.println("Instance variable ====>" + b);
        System.out.println("-----------");
    }
    void display(){
        System.out.println("*****Accessing static variable*****");
        System.out.println(ClassG.a);
        System.out.println(a);
        System.out.println(new ClassG().a);
    }
    public static void main(String[] args){
        new ClassG();
        new ClassG();
        new ClassG();
        System.out.println("#######################");
        new ClassG().display();
    }
}
