package Collections.QueueInterface;

import java.util.LinkedList;
import java.util.List;

public class QueueLinkedList {
    void meth1(){
        System.out.println("Implementing Queue LinkedList");
        List<Object> l1 =  new LinkedList<>();   // 1st LinkedList Object
        LinkedList<Object> l2 = new LinkedList<>();  // 2nd LinkedList Object
        l1.add(10);
        // l1.offer(20);  // C.E because we are accessing Queue Interface methods
        l2.add(100);
        l2.offer(200);
        l2.add(300);
        l2.offer(400);
        System.out.println(l2);
    }

    public static void main(String[] args) {
        new QueueLinkedList().meth1();
    }
}
