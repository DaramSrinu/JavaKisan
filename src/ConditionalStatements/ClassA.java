package ConditionalStatements;

public class ClassA {
    ClassA(int a, int b){
        if (a > b){
            System.out.println(a +" is bigger than b");
        }else{
            System.out.println(b + " is bigger than a ");
        }
    }
    void meth1(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("Hi");
                System.out.println(a + " is biggest among the three");
            } else {
                System.out.println(c + " is biggest among the three");
            }
        } else {
            if (b > c) {
                System.out.println("Hello");
                System.out.println(b + " is biggest amoong three");
            } else {
                System.out.println(c + " is biggest among three");
            }
        }
    }
    // WAP Take values of length and breadth of a rectangle from parameterized method and check if it is square or not.
    void meth2(int length, int breadth){
        if (length == breadth) {
            System.out.println("It is a square");
        }else{
            System.out.println("It is a rectangle");
        }
    }
    // A shop will give discount of 10% if the cost of purchased quanity is equal to or more than 100.
    // Take a parameterized method which gives the quantity(units). Suppose, one unit will cost 100.Judge and print total cost of user.
    void meth3(int units){
        int final_price = units * 100;
        if(final_price >= 1000){
            //int discount =(int) (final_price * 0.1)
            int discount = (final_price * 10)/100;
            System.out.println("Your final bill is " + (final_price-discount));
            System.out.println("You have saved " + discount + " rs");
        }else{
            System.out.println("Your Final bill is" + final_price);
        }
    }
    //A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
    // Take a parameterized method which takes users salary and year of service and print bonus amount & Updated Salary
    void meth4(int Salary, int experience){
        int bonus  = (Salary * 5)/100;
        if(experience > 5){
            System.out.println("Your bonus is : " + bonus);
            System.out.println("Your Updated Salary is: " + (Salary + bonus));
        }else{
            System.out.println("Your salary is" + Salary);
        }
    }

    // A student will not be allowed to sit in exam if his/her attendance is less than 75%.
    // Take a parameterized method which takes
         // ===> Number of classes held
         // ---> Number of classes attended.
    //  And Percentage of class attended. Is student is allowed to sit in exam or not.
    void Student(int classes_held, int classes_attended){
        double attendencePercentage = ((double) classes_attended/classes_held) * 100;
        System.out.println("Attendence Percentage: " +  attendencePercentage);
        if(attendencePercentage  >= 75){
            System.out.println("He is  allowed to sit in the exam ");
        }else{
            System.out.println(" He is not allowed to sit in the exam");
        }
    }

    //Write a program to check whether an entered character is lowercase (a to z) or uppercase (A to Z).
    // Take a parameterized method which takes a single "character" as input.
    void CharMethod(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character '" + ch + "' is UPPERCASE.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character '" + ch + "' is lowercase.");
        } else {
            System.out.println("The character '" + ch + "' is not an alphabet letter.");
        }
    }
 /*
 *  if (Character.isUpperCase(ch)) {
            System.out.println("The character '" + ch + "' is UPPERCASE.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("The character '" + ch + "' is lowercase.");
        } else {
            System.out.println("The character '" + ch + "' is not an alphabet letter.");
        }
    }
*/

        public static void main(String[] args){
            ClassA aobj = new ClassA(10, 20);
            System.out.println("--------------");
            aobj.meth1(10, 1000, 100);
            System.out.println("--------------");
            aobj.meth2(10, 10);
            System.out.println("--------------");
            aobj.meth3(12);
            System.out.println("--------------");
            aobj.meth4(25000, 6);
            System.out.println("--------------");
            aobj.Student(100, 72);
            System.out.println("--------------");
            aobj.CharMethod('S');
        }
}
