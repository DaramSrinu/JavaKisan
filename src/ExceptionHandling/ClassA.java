package ExceptionHandling;

import java.util.Scanner;

public class ClassA {
    void meth1(){
        System.out.println(10);
        try{
            System.out.println("try block executed");
            Scanner sc = new Scanner(System.in);
            System.out.println(20/sc.nextInt());
            System.out.println("Java");
        }catch (Exception e){
            System.out.println("catch block executed");
           // System.out.println(e.getMessage()); // Reason of an exception
            //System.out.println(e.toString()); // Name of the exception
            e.printStackTrace(); // Gives the complete info of the exception
        }finally {
            System.out.println("finally block executed");
        }
        System.out.println(30);
    }
    public static void main(String[] args) {
        new ClassA().meth1();
    }
}
