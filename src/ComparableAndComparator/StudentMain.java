package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentMain {
    void meth1(){
        ArrayList<Student> al = new ArrayList<>();
        Student s = new Student(101,"Srinu","CSE");
        al.add(s);
        al.add(new Student(103,"Tharun","ECE"));
        al.add(new Student(102,"Dinesh","EEE"));
        al.add(new Student(104,"Sai","Mech"));
        System.out.println("Before Sorting ArrayList"+al);
        Collections.sort(al);
        Iterator<Student> i1 = al.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("After Sorting ArrayList"+al);
    }

    public static void main(String[] args) {
        new StudentMain().meth1();
    }
}
