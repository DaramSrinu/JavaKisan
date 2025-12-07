package Java8Features.StreamAPI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedData {
    void meth1(){
        System.out.println("Implementing Sorted Data");
      /*  HashSet<Integer> hs = new HashSet<>();
        hs.add(23);
        hs.add(45);
        hs.add(12);
        hs.add(34);
        hs.add(8);
        hs.add(66);*/


       ArrayList<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(45);
        al.add(12);
        al.add(34);
        al.add(8);
        al.add(66);


       /* Stream<Integer> s1 = hs.stream();
        Stream<Integer> s2 = s1.sorted();
        List<Integer> li = s2.collect(Collectors.toList());
        System.out.println(li);*/

        List<Integer> li = al.stream().sorted().collect(Collectors.toList());
        System.out.println(li);

    }

    public static void main(String[] args) {
        new SortedData().meth1();
    }
}
