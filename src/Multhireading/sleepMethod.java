package Multhireading;

public class sleepMethod {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("J");
        Thread.sleep(3000);
        System.out.println("A");
        Thread.sleep(3000);
        System.out.println("V");
        Thread.sleep(3000, 500);
        System.out.println("A");
    }
}
