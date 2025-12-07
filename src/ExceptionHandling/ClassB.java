package ExceptionHandling;

import java.util.Scanner;

public class ClassB {
    void meth1(){
        Scanner sc = new Scanner(System.in);
        String s = null;
        System.out.println(10);
        try{
            System.out.println("try block executed");
            System.out.println("Please enter a number");
            System.out.println("====>" + 20/sc.nextInt());
            System.out.println("length : " + s.length());
            System.out.println("Helloworld");
        }
        //System.out.println("hi"); C.E
     /*   catch(ArithmeticException e)
        {
            System.out.println("1st catch block executed");
            e.printStackTrace();
        }
        catch (NullPointerException en){
            System.out.println("2nd catch bloc executed");
            en.printStackTrace();
        }*/
        catch (ArithmeticException | NullPointerException e){
            System.out.println("catch block executed");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println(e);
        }

        finally {
            System.out.println("finally block executed");
        }
        System.out.println(30);
    }

    public static void main(String[] args) {
        new ClassB().meth1();
    }
}
