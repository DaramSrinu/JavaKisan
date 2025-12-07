package Multhireading;

public class ClassQ {
    public static void main(String[] args) {
        ClassF fobj =  new ClassF();
        new Thread()
        { // Anonymous Inner Class Starts here
            public void run(){
                try{
                    fobj.with_draw(15000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }// Anonymous Inner Class Ends here
                .start();
        new Thread() { // Anonymous Inner Class Starts here
            public void run() {
                fobj.deposit(10000);
            }
        }// Anonymous Inner Class Starts here
                .start();
            }
}
