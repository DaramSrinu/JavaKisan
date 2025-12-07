package Collections.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassB {
    void meth1(){
        System.out.println("Passing userdefined Object into ArrayLsit");
        ArrayList<ClassA> al = new ArrayList<ClassA>();
        ClassA aobj1 = new ClassA("Srinu",101,"Java");
        ClassA aobj2 = new ClassA("Dinesh",102,"Mainframe");
        ClassA aobj3 = new ClassA("Vijay", 103, "Testing");

        al.add(aobj1);
        al.add(aobj2);
        al.add(aobj3);
        al.add(new ClassA("Daram",104, "JavaFSD"));
        al.add(new ClassA("Ashok",105,"BA"));

        System.out.println("Objects inserted into our ArrayList");
        System.out.println();
        System.out.println(al);
        System.out.println();
        System.out.println("Retrieving the data by using Iterator");
        Iterator i =  al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static void main(String[] args) {
        new ClassB().meth1();
    }
}
