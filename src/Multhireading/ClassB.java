package Multhireading;

public class ClassB extends Thread{
    public void run(){
       String name =  Thread.currentThread().getName();
       int priority = Thread.currentThread().getPriority();
        for(int i = 1; i <= 5; i++){
            System.out.println(name + "(" + priority + ")"  +  " has executed run method :" + i + " running" );
        }
    }

    public static void main(String[] args) {
      ClassB  bobj = new ClassB();
      Thread t1 = new Thread(bobj);
      Thread t2 = new Thread(bobj);
      t1.setName("First-Thread");
      t2.setName("Second-Thread");

      t1.setPriority(MIN_PRIORITY);
      t2.setPriority(10);
      t1.start();
      t2.start();
    }
}
/*
Thread Schedular:
-----------------
It will decide which Thread should start its execution basing upon two things
 ====> Thread Priorites
 ====> Underlying OS (Hardware apparatus )

Thread Priorites:
-----------------
Thread Priorites varies between 1 to 10
          Minimum Priority : 1
          Normal Priority  : 5
          Maximum Priority : 10

 */
