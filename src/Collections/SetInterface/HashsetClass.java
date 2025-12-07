package Collections.SetInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashsetClass {
    void meth1(){
        System.out.println("Implementing Set");
        HashSet<Object> hs = new HashSet<>();
        hs.add(10);          // Insertion Order is maintained
        hs.add("Java");     // Heterogeneous data is allowed
        hs.add(null);        // null values is allowed
        hs.add(1);          // Duplicates is not allowed
        hs.add(12);         // It is available from Java 1.2v
        hs.add(86);         // Default capacity : 16, LoadFactor 12 elements % 16 capacity = 0.75, size increase by Double
        hs.add(99);        // It is Not-Synchronized
        hs.add(10);
        System.out.println(hs);
        System.out.println("Retrieving the data by using iterator");
        Iterator i = hs.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
        System.out.println();
        System.out.println("Retrieving the data by using ListIterator");
        ArrayList<Object> al = new ArrayList<Object>(hs);
        ListIterator<Object> li = al.listIterator();
        while(li.hasNext()){
            System.out.print(li.next() + " ");
        }
        System.out.println();
        while(li.hasPrevious()){
            System.out.print(li.previous() + " ");
        }

    }

    public static void main(String[] args) {
        new HashsetClass().meth1();
    }
}
