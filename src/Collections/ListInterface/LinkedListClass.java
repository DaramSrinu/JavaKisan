package Collections.ListInterface;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {
    void meth1(){
        System.out.println("Implementing Linked List");
        LinkedList ll = new LinkedList();
        ll.add(10);        // Insertion order is maintained
        ll.add("Java");    // Heterogeneous data is allowed
        ll.add(null);      // Null values is allowed
        ll.add(1);         // It is available from Java 1.2v
        ll.add(99);        // Default Capacity is : 0 [It's size increases by double ]
        ll.add(35);         // Duplicates are allowed
        ll.add(10);         // It is Not Synchronized
        System.out.println(ll);
        System.out.println("----------------------");
        ListIterator<Object> l1 = ll.listIterator();
        while(l1.hasNext()){
            System.out.print(l1.next()+" ");
        }
        System.out.println();
        while(l1.hasPrevious()){
            System.out.print(l1.previous() + " ");
        }
        System.out.println();
        // In Linked List data will be stored in the form of Nodes
    }

    public static void main(String[] args) {
        new LinkedListClass().meth1();
    }
}
