package Constructors;

public class Employee {
    int Emp_Id;
    String Emp_name;
    String Emp_address;

    Employee(int id, String name, String address){
        Emp_Id=id;
        Emp_name=name;
        Emp_address=address;
    }
    public static void main(String[] args){
        Employee e = new Employee(101,"Srinu","DVP");
        Employee e1 = new Employee(102,"DSR","AP");
        Employee e2 = new Employee(103,"DaramSrinu","Ongole");

        System.out.println(e.Emp_name +" " + e.Emp_Id + " " + e.Emp_address );
        System.out.println(e1.Emp_name + " " + e1.Emp_Id + " " + e.Emp_address);
        System.out.println(e2.Emp_name + " " + e2.Emp_Id + " " + e2.Emp_address);
    }
}

// Instance Variable for every Instance/Object a separate copy will be created.
