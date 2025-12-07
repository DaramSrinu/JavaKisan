package Multhireading;

public class Threads extends Thread{
    public void run(){
        System.out.println("Threads class overriding the thread cls method");
    }

    public static void main(String[] args) {
        Threads aobj = new Threads();
         Thread t = new Thread(aobj);
         t.start();
    }
}
