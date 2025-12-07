package Collections.SetInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
    void meth1(){
        System.out.println("Implementing Tree Set");
        TreeSet<Object> ts = new TreeSet<>();
        ts.add(10);  // Insertion order is not maintained but sorted order(Ascending)
        //ts.add("Java");  // Heterogeneous data is not allowed
        //ts.add(null);  // null is not allowed
        ts.add(1);    // Duplicates is not allowed
        ts.add(21);   // It is available from Java 1.2v
        ts.add(99);   // Default Capacity : 16, LoadFactor is 12 % 16 = 0.75, size is increase by DOUBLE
        ts.add(65);   // It is NOT Synchronized
        ts.add(10);
        System.out.println(ts);
        System.out.println("Retrieving the data by using iterator");
        Iterator<Object> i = ts.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("---------------------------");
        Iterator<Object>  i1 = ts.descendingIterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("------------------------------");
        System.out.println(ts.headSet(65));  // 1,10,21
        System.out.println(ts.tailSet(65));  // 65, 99
    }

    public static void main(String[] args) {
        new TreeSetClass().meth1();
    }
}
