package Java8Features.StreamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stringdata {
    void meth1(){
        System.out.println("Implementing Stream API");
        ArrayList<String> al = new ArrayList<>();
        al.add("India");
        al.add("Japan");
        al.add("Paris");
        al.add("UK");
        al.add("Russia");
        al.add("USA");

        Stream<String> s1 = al.stream();
        Stream<String> s2 = s1.filter(data->data.length() < 4);
        long number = s2.count();
        System.out.println(number);

        System.out.println("Another way ");
        long num = al.stream().filter(data->data.length() < 4).count();
        System.out.println(num);
    }

    public static void main(String[] args) {
        new Stringdata().meth1();
    }
}
