package Multhireading;

public class MyThread  implements Runnable
{
    @Override
    public void run() {
        System.out.println("MyThread Class implements Runnable Interface");
    }

    public static void main(String[] args) {
        MyThread aobj = new MyThread();
      Thread t = new Thread(aobj);
      t.start();
    }
}
