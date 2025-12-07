package Multhireading;

public class ThreadInterrupt extends Thread{
    public void run(){
        System.out.println("I am ready for attending interviews");
        for(int i =1 ; i <=5 ; i++){
            System.out.println("This is my " + i +" interview" );
        }
        System.out.println("I got placed NOW i can relax");
        try{
            Thread.sleep(10000);
        }catch(Exception e){
            System.out.println("My sleep got disturbed");
        }
        System.out.println("Time to go to office");
    }
    public static void main(String[] args){
         ThreadInterrupt tI =new ThreadInterrupt();
         Thread t = new Thread(tI);
         t.start();
         t.interrupt();
    }
}
