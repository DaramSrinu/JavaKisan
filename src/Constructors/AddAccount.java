package Constructors;

public class AddAccount {
    int amount = 500;

    AddAccount(){
        System.out.println("Balance is " + amount);
    }
    AddAccount(int deposit){
        System.out.println("Updated Balance is: "+(amount + deposit));
    }
    public static void main(String[] args){
       AddAccount a = new AddAccount();
       AddAccount a1 = new AddAccount(1000);
    }
}
