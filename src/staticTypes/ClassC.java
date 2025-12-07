package staticTypes;

public class ClassC {
    int x =10;
    public static void main(String[] args){
        System.out.println(new ClassC().x);
    }
    static {
        int x =30;
        System.out.println(x +" ");
    }
}
