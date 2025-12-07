package Multhireading;

public class ClassCD {
    public static void main(String[] args) throws InterruptedException {
        ClassC cobj = new ClassC();
        cobj.start();

        cobj.join();

        for(int i = 1; i<=5 ; i++){
            System.out.println("ClassCD main() : " + i);
        }
    }
}
