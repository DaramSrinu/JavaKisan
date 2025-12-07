package InnerClasses;

public class MethodLocalInnerClasses {
    void meth1(){
        String s = "Java";
        class InnerClass{
            void show(){
                String data = s.concat(" is awesome");
                System.out.println(data);
            }
            InnerClass(){
                System.out.println("Inner class Constructor");
            }
        }
        InnerClass iobj = new InnerClass();
        iobj.show();
    }
    public static void main(String[] args) {
        new MethodLocalInnerClasses().meth1();
    }
}
