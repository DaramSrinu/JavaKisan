package Java8Features.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerStream {
    void meth1(){
        System.out.println("Implementing Stream API");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(45);
        al.add(75);
        al.add(5);
        al.add(12);
        al.add(1);
        //System.out.println(al);
        Stream<Integer> s1 = al.stream();
       Stream<Integer> s2 =  s1.map(x-> x * 2);
      List<Integer> s3 = s2.collect(Collectors.toList());
        System.out.println(s3);

        System.out.println("Another way");
        List<Integer> s = al.stream().map(x->x * 2).collect(Collectors.toList());
        System.out.println(s);
    }

    public static void main(String[] args) {
        new IntegerStream().meth1();
    }
}
