package Constructors;

public class Student {
    Student(){
        System.out.println("Unknown");
    }
    Student(String s){
        System.out.println(s);
    }
    public static void main(String[] args){
        Student s = new Student();
        Student s1 = new Student("Java");

    }
}
