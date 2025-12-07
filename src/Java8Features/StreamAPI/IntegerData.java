package Java8Features.StreamAPI;

import java.util.ArrayList;

public class IntegerData {
    void meth1(){
        System.out.println("Implementing Stream API");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(42);
        al.add(37);
        al.add(8);
        al.add(22);
        al.add(56);
        //System.out.println(al);
     /* Iterator<Integer> i = al.iterator();
       while(i.hasNext()){
           System.out.print(i.next() + " ");
       }*/
       al.forEach(s-> System.out.println(s));
    }

    public static void main(String[] args) {
        new IntegerData().meth1();
    }
}
