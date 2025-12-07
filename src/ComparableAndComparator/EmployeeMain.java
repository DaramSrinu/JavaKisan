package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeMain {
    void meth1(){
       ArrayList<Employee> al = new ArrayList<>();
       al.add(new Employee(2582828,"Srinu","Java"));
       al.add(new Employee(2582324,"Tharun","FullStackDeveloper"));
       al.add(new Employee(2560546,"Jadhav","Mainframe"));
       al.add(new Employee(2523467,"Mohan","Devops"));
        System.out.println("Before Sorting Employee : ");
        Iterator<Employee> i1 = al.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        Collections.sort(al, new ComparatorClass());
        System.out.println("After Sorting Employees : ");
        Iterator<Employee> i2 = al.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
        Collections.sort(al, new ComparatorClass());
    }

    public static void main(String[] args) {
        new EmployeeMain().meth1();
    }
}
