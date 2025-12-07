package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ByteStreams {
    void fileOperations1() throws Exception{
        System.out.println("Reading the data from the file");
        FileInputStream fis = new FileInputStream("C:\\Users\\srini\\OneDrive\\Documents\\file2.txt");
        System.out.println("Connection Created");
        int i;
        while((i=fis.read()) != -1){
            System.out.print((char)i);
        }
        System.out.println();
        System.out.println("Data Retrieved");
        fis.close();
    }
    void fileOperations2() throws Exception{
        System.out.println("Writing the data into the file");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\srini\\OneDrive\\Documents\\file2.txt");
        System.out.println("Connection Created");
        Scanner sc= new Scanner(System.in);
        System.out.println("Waiting for the User Input Data");
        String data = sc.nextLine();
        byte arr[] = data.getBytes();
        fos.write(arr);
        System.out.println();
        System.out.println("Data written");
        fos.close();
    }
    void fileOperations3() throws Exception{
        System.out.println("Copying the data from One file to Another file");
        FileInputStream fis = new FileInputStream("C:\\Users\\srini\\OneDrive\\Documents\\file2.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\srini\\OneDrive\\Documents\\file3.txt");
        System.out.println("Connection Created");
        int i;
        while((i=fis.read()) != -1){
            fos.write(i);
        }
        System.out.println();
        System.out.println("Data Copied");
        fis.close();
        fos.close();
    }

    public static void main(String[] args) throws Exception {
        ByteStreams aobj = new ByteStreams();
        //aobj.fileOperations1();
        //aobj.fileOperations2();
        aobj.fileOperations3();
    }
}
