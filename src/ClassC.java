import java.util.Arrays;

public class ClassC {
    public void Method1(int a, int b, String s){
        System.out.println("Method1 called");
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
    }
    public int Method2(String s,int[] arr){
        System.out.println(s);
        System.out.println(Arrays.toString(arr));
        return 10;
    }
    public String Method3(String s, String s1){
        System.out.println(s);
        System.out.println(s1);
        return "Java";
    }
    public static void main(String[] args){
        ClassC c1 = new ClassC();
        System.out.println("Start");
       c1.Method1(10,20,"Srinu");
       System.out.println(c1.Method2("Java", new int[]{10, 20, 30, 40, 50}));
       String ss = c1.Method3("Daram","Srinu");
       System.out.println(ss);
    }
}
