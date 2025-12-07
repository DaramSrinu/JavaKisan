package Collections.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    void meth1()
    {
        System.out.println("Implementing Priority Queue Class");
        PriorityQueue<Object> pq = new PriorityQueue<>();
        pq.add(10);             // Insertion Order is not maintained
        //pq.offer("Java");     // Heterogeneous data is not allowed
        //pq.add(null);         // Null is not allowed
        pq.offer(50);        // Duplicate is allowed
        pq.add(1);              // It is available from Java 1.5V
        pq.offer(33);        // Default Capacity is : 11 ,size increases by double
        pq.add(10);             // It is Not Synchronized
        pq.offer(96);
        pq.add(100);
        pq.offer(20);
        System.out.println(pq);
        System.out.println(pq.remove()); // remove and returns the 1st element
        System.out.println(pq);
        System.out.println(pq.poll()); // remove and returns the 1st element
        System.out.println(pq);

        //pq.clear();
        //System.out.println(pq.remove());  // No Such Element Exception
        //System.out.println(pq.poll());  // null

        System.out.println(pq.peek()); // 10
        System.out.println(pq);
    }

    public static void main(String[] args) {
        new PriorityQueueClass().meth1();
    }
}
