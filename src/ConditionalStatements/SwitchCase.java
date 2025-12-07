package ConditionalStatements;

public class SwitchCase {
    // int, byte , short, char
    void meth1(){
        System.out.println("Implementing switch case");
        int a = 300;
        byte b  = 65;
        final int x = 50;
        switch(b - 55)  // Key
        {
            //System.out.println("Hello World"); // C.E
            case 10:
                System.out.println("case 10 executed");
                SwitchCase sc =new SwitchCase();
                int i = 40;
                if(i<45){
                    System.out.println("If block executed");
                    sc.meth2();
                }else{
                    System.out.println("Else block executed");
                    sc.meth3();
                }
                break;
            case 20:
                System.out.println("case 20 executed");
                break;
            case 'A':
                System.out.println("case 65 executed");
                System.out.println("int & char both are compatable");
                break;
            case 300-270:
                System.out.println("case 30 executed");
                System.out.println("Expressions are allowed in switch");
                break;
            case 40:
                System.out.println("case 40 executed");
                //x++;
                // ++x ; final variable are constants
                break;
            case x : // Every case lable should be COMPILE TIME CONSTANT.
                System.out.println("case 50 executed");
                break;
            default:
                System.out.println("Invalid Input");
                System.out.println("Default case will be executed only if no case matched");
                break;
        }
        System.out.println("Compiler came out from Switch case");
    }
    void meth2(){
        System.out.println("meth2() called");
        System.out.println("Java is awesome");
    }
    void meth3(){
        System.out.println("meth3() called");
        System.out.println("Inside switch case lables we can write any VAILD java statements");
    }
    void task(){
        int input = 4;
        switch(input){
            default:
                System.out.println(4);
            case 1:
                System.out.println("1");
                //break;
            case 2:
                System.out.println("2");
        }
    }
    // WAP using switch statement that takes inputs from  the method as parameters:operator(+,-,/,*) and 2 numbers.
    // It performs calculation based on numbers and operator entered. Then the result is displayed on the screen.
    void calculation(int num1, int num2, char operator){

        switch(operator){
            case '+' :
                System.out.println("Addition of two numbers : "+(num1+num1));
                break;
            case '-' :
                System.out.println("Subtraction of two numbers : " + (num1-num2));
                break;
            case '*' :
                System.out.println("Multiplication of two numbers : "+(num1*num2));
                break;
            case '/' :
                System.out.println("Division of two numbers : "+(num1/num2));
                break;
            default:
                System.out.println("Invaild Input");
        }
    }
    void week(String weekDay){
        switch(weekDay){
            case "Sunday" :
                System.out.println("You have entered Sunday of the 1st day of the week");
                break;
            case "Monday" :
                System.out.println("You have entered Monday of the 2nd day of the week");
                break;
            case "Tuesday" :
                System.out.println("You have entered Tuesday of the 3rd day of the week");
                break;
            case "Wednesday" :
                System.out.println("You have entered Wednesday of the 4th day of the week");
                break;
            case "Thursday" :
                System.out.println("You have entered Thursday of the 5th day of the week");
                break;
            case "Friday" :
                System.out.println("You have entered Friday of the 6th day of the week");
                break;
            case "Saturday" :
                System.out.println("You have entered Saturday of the 7th day of the week");
                break;
            default:
                System.out.println("Invaild Input");
                break;
        }
    }
    public static void main(String[] args){
        SwitchCase sc = new SwitchCase();
        sc.meth1();
        sc.task();
        sc.calculation(20,10,'/');
        sc.week("Friday");
    }
}
