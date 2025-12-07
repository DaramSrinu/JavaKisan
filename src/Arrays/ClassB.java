package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ClassB {
    void meth1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many tickers you need ?");
        String names[] = new String[sc.nextInt()];
        System.out.println("You need " + names.length + " tickets");
        System.out.println("Please enter "+ names.length + " names");
        for(int i=0; i < names.length; i++){
            names[i] = sc.next();
        }
        System.out.println("Data present in array is: " + names);
        System.out.println("Data present in array is: " + Arrays.toString(names));
        System.out.println("Retrieving data from an array using for-each loop: ");
        for(String s : names){
            System.out.println(s + " ");
        }
        System.out.println();
        // Retrieving  the last but one element if the length of the array is >= 2
        if(names.length >= 2){
            System.out.println("====>" + names[names.length - 2]);
        }else{
            System.out.println("====>" + names[names.length-1]);
        }
    }
    public static void main(String[] args){
        new ClassB().meth1();
    }
}
