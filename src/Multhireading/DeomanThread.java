package Multhireading;

public class DeomanThread  extends  Thread{
    public void run(){
        int i = 0;
        while(true){
            i = i+1;
            System.out.println(" Daemon : " + i);
        }
    }

    public static void main(String[] args) {
        DeomanThread dt = new DeomanThread();
        Thread t = new Thread(dt);

        t.setDaemon(true);
        t.start();

        for(int i = 0; i < 20; i++){
            System.out.println(" main : " + i);
        }
        System.out.println(" end of main");
    }
}
