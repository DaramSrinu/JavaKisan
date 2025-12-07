public class ClassA {
    public void method1(){
        System.out.println("Method1 called");
    }
    public int method2(){
        System.out.println("Method2 called");
        return 100;
    }
    public String method3(){
        System.out.println("Method3 called ");
        return "Java";
    }
    public void method4(int a, int b){
        System.out.println("Method4 called");
        System.out.println("a value is:" + a);
        System.out.println("b value is:" + b);
        System.out.println(a+b);
    }
    public int method5(int a, int b){
        System.out.println("Method5 called");
        return a+b;
    }

    public String method6(String s){
        System.out.println("Method6 called");
        return s;
    }

    public static void main(String[] args){
     ClassA obj = new ClassA();
     obj.method1();
     int r=obj.method2();
     System.out.println(r);
     String r1=obj.method3();
     System.out.println(r1);
     obj.method4(10,20);
     System.out.println(obj.method5(30,40));
     System.out.println(obj.method6("Java"));
    }
}
