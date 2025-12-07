package Collections.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Time {
    private static Object arr[];
    static{
        arr = new Object[100000];
        for(int i = 0; i< arr.length; i++){
            arr[i] = new Object();
        }
    }
    void ArrayListTime(){
        long start;
        long end;
        ArrayList<Object> al = new ArrayList<>();
        start = System.currentTimeMillis();
        //System.out.println("Start :" + start);

        for(Object obj1 : arr){
            al.add(obj1);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList Construction Time" + (end-start));
    }
    void LinkedListTime(){
        long start, end;
        LinkedList<Object>  ll = new LinkedList<>();
        start = System.currentTimeMillis();
        for(Object obj2 : arr){
            ll.add(obj2);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList Construction Time " + (end-start));
    }
    void meth1(){
        for(Object o :  arr){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        LinkedList_Time lt = new LinkedList_Time();
        lt.ArrayListTime();
        lt.LinkedListTime();
        //lt.meth1();
    }
}
