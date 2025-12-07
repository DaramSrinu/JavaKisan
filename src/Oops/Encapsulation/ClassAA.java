package Oops.Encapsulation;

import java.util.Scanner;

public class ClassAA {
    void meth1() {
        ClassA aobj = new ClassA();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the roll number : ");
        //aobj.studentRollNumber = sc.nextInt(); // C.E  we can't access private fields directly
        aobj.setStudentRollNumber(sc.nextInt());
        System.out.println("Please enter the studentName: ");
        //aobj.studentName = sc.next(); // C.E we can't access private fields directly
        aobj.setStudentName(sc.next());


        //System.out.println("Student rollNumber :" + aobj.studentRollNumber); // C.E
        System.out.println("Student Roll Number : " + aobj.getStudentRollNumber());
        //System.out.println("Student name : " + aobj.studentName); // C.E
        System.out.println("Student Name : " + aobj.getStudentName());
    }

    public static void main(String[] args) {

        new ClassAA().meth1();
    }
}