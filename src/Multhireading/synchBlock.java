package Multhireading;

public class synchBlock extends Thread{
    public void run(){
        String name  = Thread.currentThread().getName();
        synchronized (this) {
            System.out.println(name + " has entered Critical Resource");
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " i value  : " + i);
            }
        }
            System.out.println(name + " has completed its execution");
        for(int x = 1;  x <= 5; x++ ){
            System.out.println(name + " x value  : " + x);
        }
    }

    public static void main(String[] args) {
        synchBlock sB =  new synchBlock();
        Thread t1 = new Thread(sB);
        Thread t2 = new Thread(sB);

        t1.setName("First-Thread");
        t2.setName("Second-Thread");

        t1.start();
        t2.start();
    }
}
