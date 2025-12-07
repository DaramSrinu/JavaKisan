package Multhireading;

public class ClassF {
    int amount = 10000;
    synchronized void with_draw (int amount) throws InterruptedException //15000
    {
        if(this.amount < amount) // 10000 < 15000
        {
            System.out.println("Insufficient balance");
            wait(10000,500);
            System.out.println("Amount Credited");
            this.amount -= amount; // 20000 - 15000 = 5000
            System.out.println("with draw successful \nBalance is " +this.amount);
        }
        else{
            this.amount -= amount;
            System.out.println("with draw successful \nBalance is " + this.amount);
        }
    }
    synchronized void deposit(int amount) // 10000
    {
        this.amount += amount;
        System.out.println("Deposited successfully \nBalance is " + this.amount);
        //notify();
        //notifyAll();
    }
}
