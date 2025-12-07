package Java8Features.LambdaExpressions;

public class ClassA {
    void show(){
        System.out.println("Implementing Lambda Expressions");
        InterfaceA x = () -> System.out.println("HelloWorld!");
        x.meth1();
        InterfaceB y = (int m, int n) -> System.out.println("Add :" +(m+n));
        y.meth2(10,20);
        InterfaceC z = (int i, int j) ->{
          if(i > j){
              System.out.println("If block executed");
              return  i +100;
          }else{
              System.out.println("Else block executed");
              return  j + 50;
          }
        };
        System.out.println("z value : "+z.meth3(10,5));
        InterfaceD aobj = (s) -> System.out.println(s);
        aobj.meth1(10);
    }
    public static void main(String[] args) {
        new ClassA().show();
    }
}
