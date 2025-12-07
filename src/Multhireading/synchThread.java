package Multhireading;

public class synchThread extends Thread{
    public void run(){
        criticalResource();
    }
    synchronized void criticalResource(){
        String name  = Thread.currentThread().getName();
        System.out.println(name + " has entered Critical Resource");
        for(int i = 1; i <= 5; i++ ){
            System.out.println(name + " i value  : " + i);
        }
        System.out.println(name + " has completed its execution");
    }

    public static void main(String[] args) {
        synchThread  sy = new synchThread();
        Thread t1 = new Thread(sy);
        Thread t2 = new Thread(sy);

        t1.setName("First-Thread");
        t2.setName("Second-Thread");

        t1.start();
        t2.start();
    }
}
