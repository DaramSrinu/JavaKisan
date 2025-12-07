package Collections.SetInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    void meth1(){
        System.out.println("Implementing LinkedHashSet");
        LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
        lhs.add(10); // Insertion order is maintained
        lhs.add("Java"); // Heterogeneous data is allowed
        lhs.add(null);  // null is allowed
        lhs.add(1);   // Duplicate data is not allowed
        lhs.add(21);   // It is available from Java 1.4
        lhs.add(99);    //Default capacity : 16, LoadFactor is 12 % 16 = 0.75, size increase by double
        lhs.add(65);
        lhs.add(10);
        System.out.println(lhs);
        System.out.println("Retrieving the data by using iterator");
        Iterator<Object> i = lhs.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
    }

    public static void main(String[] args) {
        new LinkedHashSetClass().meth1();
    }
}
