package Oops.Tasks;

import java.util.Scanner;

public class Task1A {
    void meth1(){
     Task1 t1  = new Task1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the EmpName :");
        t1.setEmpName(sc.next());

        System.out.println("Please enter the Employee Experience : ");
        t1.setEmpExp(sc.nextInt());

        System.out.println("Please enter the Employee Salary");
        t1.setEmpSalary(sc.nextDouble());

        System.out.println("Employee name : " + t1.getEmpName());
        System.out.println("Employee Experience : " + t1.getEmpExp());

        double bonus = (t1.getEmpSalary() * 10)/100;
        if(t1.getEmpExp() > 10){
            System.out.println("Employee Bouns : " + bonus);
            System.out.println("Employee Updated Salary : " + (t1.getEmpSalary() + bonus));
        }else{
            System.out.println("Employee Salary : " + t1.getEmpSalary());
        }
    }

    public static void main(String[] args) {
        new Task1A().meth1();
    }
}
