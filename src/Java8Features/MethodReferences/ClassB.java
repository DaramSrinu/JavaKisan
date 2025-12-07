package Java8Features.MethodReferences;

import java.util.Arrays;
import java.util.Scanner;

public class ClassB {
    void m1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the length of the array");
        int arr[] = new int[sc.nextInt()];
        System.out.println("please enter" + arr.length + " int data");
        for(int i =0 ; i <= arr.length-1 ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    static void m2(){
        System.out.println("this is static method referencing");
    }
    ClassB(){
        System.out.println("Constructor method referencing");
    }
}
