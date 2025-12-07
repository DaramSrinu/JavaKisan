package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassC {
    int avl_amt = 10000;
    void meth1(int wd_amt){
        if(avl_amt < wd_amt)
        {
         throw new RuntimeException("Insufficient Funds");
        }else
        {
            System.out.println("Transaction Success");
        }
    }
    void meth2() throws FileNotFoundException {
        System.err.println("------------meth2()---------------");
        FileInputStream file = new FileInputStream("C:\\Users\\srini\\OneDrive\\Desktop\\JCL Notes 1.txt");
        System.out.println("Connection Created");


    }

    public static void main(String[] args) throws FileNotFoundException {
        ClassC cobj = new ClassC();
        //cobj.meth1(15000);
        cobj.meth2();
    }
}
