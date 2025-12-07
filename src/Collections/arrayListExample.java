package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListExample {
    void meth1(){
        System.out.println("Implementing ArrayList class");
        //ArrayList al = new ArrayList(); // heterogeneous way
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);             // Insertion order is maintained
        //al1.add("Java");       // Heterogeneous data is allowed
        //al1.add(null);         // Null values are allowed
        al1.add(1);              // Duplicates are allowed
        al1.add(12);             // It is available from Java 1.2v
        al1.add(86);             // It's default capacity is 10 [It's size increases by half]
        al1.add(99);             // It is NOT-Synchronized by default
        al1.add(10);
        System.out.println("ArrayList : "+al1);
        System.out.println("get() :" + al1.get(4));
        System.out.println("get() : " + al1.get(al1.size()-1)); //10
        System.out.println("size() : " + al1.size());

        System.out.println("Reteriving the data by using for loop");
        for(int i=0; i<al1.size(); i++){
            System.out.print(al1.get(i)+ " ");
        }
        System.out.println();
        System.out.println("Retrieving the data in reverse order by using for loop");
        for(int i=al1.size()-1; i>=0; i--){
            System.out.print(al1.get(i) + " ");
        }
        System.out.println();
        System.out.println("Retrieving the data by using for-each loop");
        //for(Object data : al1) // 10 null 1 12 86 99 10
        for(int data : al1)   // 10 1 12 86 99 10
        {
            System.out.print(data +" ");
        }
        System.out.println();
        System.out.println("Retrieving the data by using Iterator Interface");
        Iterator i = al1.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
        System.out.println();
        System.out.println("-------------- methods()-------------");
        System.out.println();
        al1.add(al1.size(),100);
        System.out.println(al1);
        al1.add(0,500);
        System.out.println(al1);
        System.out.println("isEmpty() : " + al1.isEmpty());  // false
        //al1.clear();
        //System.out.println("isEmpty() : " + al1.isEmpty());  // true
        System.out.println("contains : " + al1.contains(99));  // true
        System.out.println("-----------remove()------------");
        al1.remove((Object)100);
        System.out.println(al1);
        System.out.println("===>"  + al1.remove(1));
        System.out.println(al1);
        System.out.println("===>" + al1.remove((Object)100)); // false
        System.out.println(al1);
    }

    public static void main(String[] args) {
        new arrayListExample().meth1();
    }
}
