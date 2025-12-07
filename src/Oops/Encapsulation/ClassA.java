package Oops.Encapsulation;

public class ClassA {
    private int studentRollNumber;
    private String studentName;

    public int getStudentRollNumber() {

        return studentRollNumber;
    }

    public void setStudentRollNumber(int studentRollNumber) {
        System.out.println("We are calling from ClassAA");
        this.studentRollNumber = studentRollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
