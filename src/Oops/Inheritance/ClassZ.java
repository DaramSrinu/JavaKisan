package Oops.Inheritance;

public class ClassZ extends ClassY {
    void meth3(){
        System.out.println("Class Z called");
    }

    public static void main(String[] args) {
         ClassZ zobj = new ClassZ();
         zobj.meth1();
         zobj.meth2();
         zobj.meth3();
    }
}
