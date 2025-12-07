package IOStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreams {
    void fileOperations() throws Exception
    {
        System.out.println("Implementing DataStreams");
       DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\srini\\OneDrive\\Documents\\file8.txt"));
        System.out.println("Connection Created");
        dos.writeInt(1000);
        dos.writeChar('A');
        dos.writeBoolean(true);
        dos.writeInt(2000);
        System.out.println("Data Entered");
        dos.close();
        System.out.println("--------------------------");

        DataInputStream dis =  new DataInputStream(new FileInputStream("C:\\Users\\srini\\OneDrive\\Documents\\file8.txt"));
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readInt());
        System.out.println("Data Retrieved");
    }
    public static void main(String[] args) throws Exception {
        DataStreams ds = new DataStreams();
        ds.fileOperations();
    }
}
