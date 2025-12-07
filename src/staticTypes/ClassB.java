package staticTypes;

public class ClassB {
    int x = 10;
    public static void main(String[] args){
        int x =20;
        System.out.println(x);
    }
    static {
        int x =30;
        System.out.println(x + " ");
    }
}
