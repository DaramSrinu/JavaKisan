package Arrays;

import java.util.Scanner;

public class Task {
    void meth1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Tickets you need ");
        int numTickets = sc.nextInt();
        sc.nextLine();

        System.out.print("Please select your Row [A,B,C,D]: ");
        String row = sc.nextLine().toLowerCase();

        String names[] = new String[numTickets];
        System.out.println("Please enter " + numTickets + " names: ");
        for(int i = 0; i < numTickets; i++){
            System.out.println((i + 1) + ". ");
            names[i]  = sc.nextLine();
        }
        System.out.println("Your Tickets" );
        for (int i = 0; i < numTickets; i++){
            System.out.println(names[i] + "   " + row + (i + 1));
        }
    }
    public static void main(String[] args){
        new Task().meth1();
    }
}
