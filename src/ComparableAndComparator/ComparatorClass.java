package ComparableAndComparator;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        //return o1.getEmpID() - o2.getEmpID();
        //return o1.getEmpName().compareTo(o2.getEmpName());
        return o1.getRole().compareTo(o2.getRole());
    }
}
