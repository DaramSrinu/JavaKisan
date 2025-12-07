package IOStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharacterStreams {
    void fileOperations1() throws Exception
    {
        System.out.println("Reading the data by using Character Streams ");
        FileReader fr = new FileReader("C:\\Users\\srini\\OneDrive\\Documents\\file1.txt");
        System.out.println("Connection Created");
        int i;
        while((i=fr.read()) != -1){
            System.out.print((char)i);
        }
        System.out.println();
        System.out.println("Data Retrieved");
        fr.close();
    }
    void fileOperations2() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Data writing");
        FileWriter fw = new FileWriter("C:\\Users\\srini\\OneDrive\\Documents\\file4.txt", true);
        System.out.println("Connection Created");
        System.out.println("Please say how do you feel about Java?");
        String data = sc.nextLine();
        fw.write(data);
        System.out.println("Data entered");
        sc.close();
        fw.close();
    }
    void fileOperations3() throws Exception{
        FileReader fr = new FileReader("C:\\Users\\srini\\OneDrive\\Documents\\file4.txt");
        FileWriter fw = new FileWriter("C:\\Users\\srini\\OneDrive\\Documents\\file5.txt");
        System.out.println("Connection Created");
        int i;
        while((i=fr.read()) != -1){
            fw.write(i);
        }
        System.out.println();
        System.out.println("Data Copied");
        fr.close();
        fw.close();
    }
    public static void main(String[] args) throws Exception {
        CharacterStreams cs = new CharacterStreams();
        //cs.fileOperations1();
        //cs.fileOperations2();
        cs.fileOperations3();
    }
}
