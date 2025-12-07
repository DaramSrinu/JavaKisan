package IOStreams.ObjectStreams;

import java.io.*;

public class ClassC {
    public static void main(String[] args) throws Exception
    {
        System.out.println("Implementing Object Streams");
        ClassA aobj1 = new ClassA();
        ClassB bobj1 = new ClassB();

        System.out.println(aobj1.a + " " + aobj1.b);
        System.out.println(bobj1.x + " " + bobj1.y);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\srini\\OneDrive\\Documents\\Data.ser"));
        System.out.println("Connection Created");

        oos.writeObject(aobj1);
        oos.writeObject(bobj1);

        oos.close();
        System.out.println("Serialization Completed");

        System.out.println("De-Serialization Completed");
       ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("C:\\Users\\srini\\OneDrive\\Documents\\Data.ser"));

        ClassA aobj2 = (ClassA)ois.readObject();
        ClassB bobj2 = (ClassB)ois.readObject();

        System.out.println(aobj2.a + " " + aobj2.b);  //0 20 because 0 in a is we make a as transient
        System.out.println(bobj2.x + " " + bobj2.y);

        ois.close();
    }
}
