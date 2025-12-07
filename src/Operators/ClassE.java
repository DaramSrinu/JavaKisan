package Operators;

public class ClassE {
    void examEligibility(int age)
        {
        System.out.println("Person age is:" + age);

        if (age > 21 && age <=35) // 50>21 t && 50 <= 35 F ====> false
        {
            System.out.println("Person is eligible for exam");
        }else{
            System.out.println("Person is NOT eligible for exam");
        }
    }

    void meth1(int i){
        if(!(i>50))   // =====> true --> false
        {
            System.out.println("If block executed");
        }else{
            System.out.println("Else Block Executed");
        }
    }
    void hostelFee(int days)
    {
        if ((days < 10) || (days > 15))
        {
            System.out.println("You have to Pay Full Hostel Fee");
        }
        else
        {
            System.out.println("You have to Pay Day by Day Fee");
        }
    }
    void Attendance(double hours){
        if(hours > 4){
            System.out.println("You can check out");
        }
        else{
            System.out.println("You have to maintain minimum 4 hours to check out");
        }
    }

    public static void main(String[] args){
        ClassE ce = new ClassE();
        ce.examEligibility(50);
        System.out.println("------------------");
        ce.meth1(34);
        System.out.println("------------------");
        ce.hostelFee(12);
        System.out.println("------------------");
        ce.Attendance(3.5);
    }
}


// Logical AND ====> && If both condtitions are true then it will get true , otherwise if one condition is false then false.
// Logical OR  ====> ||
// Logical NOT ====> !