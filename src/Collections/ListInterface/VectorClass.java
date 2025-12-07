package Collections.ListInterface;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {
    void meth1(){
        System.out.println("Implementing Vector class");
         //Vector v = new Vector();
        Vector<Object> v = new Vector<>();

         v.add(10);        // Insertion Order is allowed
         v.add("Java");    // Heterogeneous data is allowed
         v.add(null);      // null values is allowed
         v.add(1);         // Duplicates is allowed
         v.add(99);        // It is available from Java 1.0[Legacy Class]
         v.add(12);         // Default capacity is 10 [It's size increases by double]
         v.add(10);        // It is synchronized
        System.out.println(v);
        System.out.println("--------------------------");
        System.out.println("Capacity :" + v.capacity());  // 10
        System.out.println("Size() : " + v.size() ); // 7
        v.add(1,500);
        v.add(1000);
        v.add(2,"Hi");
        v.add(2000);
        System.out.println("Capacity :" + v.capacity()); // 20
        System.out.println("Size() : " + v.size() ); // 11
        System.out.println("----------------------");
        for(Object o : v){
            System.out.println(o);
        }
        System.out.println();
        System.out.println("--------------------------");
        Enumeration<Object> e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }

    public static void main(String[] args) {
        new VectorClass().meth1();
    }
}
