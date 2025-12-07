package Multhireading;

public class ClassA extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("run method called : " + i );
        }
    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
       Thread t1 = new Thread(aobj);
       Thread t2 = new Thread();
       t1.start();  // A new thread will be created and that new thread is responsible for running the run() method present in ClassA
       t1.run();  // No new Thread will be created, we are directly calling the run() method present in Thread class but ClassA run() will be executed because of Overriding
       t2.start(); // A new thread will be created and that new thread is responsible & it will run() method present in Thread Class
       t2.run();  // No new Thread will be created, we are directly calling the run() present in Thread class
    }
}
