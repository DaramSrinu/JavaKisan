package IOStreams;

import java.io.*;
import java.util.Scanner;

public class BufferStreams {
    void fileOperations1() throws Exception{
        System.out.println("Reading the data from the file");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\srini\\OneDrive\\Documents\\file4.txt"));
        System.out.println("Connection Created");
        int i;
        while((i=bis.read()) != -1){
            System.out.print((char)i);
        }
        System.out.println();
        bis.close();
    }
    void fileOperations2() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Writing the data to the file");
        BufferedOutputStream  bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\srini\\OneDrive\\Documents\\file6.txt"));
        String data = sc.nextLine();
        byte arr[] = data.getBytes();
        bos.write(arr);
        System.out.println();
        System.out.println("Data written");
        bos.close();
    }
   void fileOperations3() throws Exception{
       System.out.println("Reading the from the file");
       BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\srini\\OneDrive\\Documents\\file4.txt"));
       System.out.println("Connection Created");
       int i;
       while((i=br.read()) != -1){
           System.out.print((char)i);
       }
       System.out.println();
       System.out.println("Data Retrieved");
       br.close();
   }
   void fileOperations4() throws Exception{
        Scanner sc =  new Scanner(System.in);
       System.out.println("Writing the data to the file");
       BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\srini\\OneDrive\\Documents\\file7.txt"));
       String data = sc.nextLine();
       bw.write(data);
       System.out.println();
       System.out.println("Data Written");
       bw.close();
   }

    public static void main(String[] args) throws Exception {
        BufferStreams bs = new BufferStreams();
        bs.fileOperations1();
        bs.fileOperations2();
        bs.fileOperations3();
        bs.fileOperations4();
    }
}
