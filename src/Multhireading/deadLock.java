package Multhireading;

public class deadLock {
    public static void main(String[] args) {
        final String A = "Java";
        final String B = "Python";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (A) {
                    System.out.println("Thread 1 locked on A");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println("Threa 1 locked on B");
                    }
                }
                System.out.println("no dead lock");

            }
        };
            Thread t2 = new Thread() {
                public void run() {
                    synchronized (B) {
                        System.out.println("Thread 2 locked on B");
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        synchronized (A) {
                            System.out.println("Thread 2 locked on A");
                        }
                    }
                        System.out.println("no dead lock");
                    }
                };
        t1.start();
        t2.start();
            }
        }

 /*
 ⚠️ Why Deadlock Can Occur
A deadlock happens when:
- Thread 1 holds lock A and waits for lock B.
- Thread 2 holds lock B and waits for lock A.
If both threads acquire their first lock and then try to acquire the second, they’ll be stuck waiting for each other — forever.

  */