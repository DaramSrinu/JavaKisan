package Operators;

public class RelationalOperator {
    void meth1(int a){
        if(a>= 50){
            System.out.println("If block executed");
        }else{
            System.out.println("Else Block Executed");
        }
    }
    void person(int age){
        if(age > 18){
            System.out.println("Person is eligible to Vote");
        }else{
            System.out.println("Not eligible to Vote");
        }
    }

    public static void main(String[] args){
      RelationalOperator ro =new RelationalOperator();
      ro.meth1(23);
      ro.person(34);
    }
}
