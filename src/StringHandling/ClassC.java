package StringHandling;

import java.util.Arrays;

public class ClassC {
    void meth1()
    {
        String date = "21/Oct/2025";
        String arr1[] = date.split("/");
        System.out.println("Arr1 ===> " + Arrays.toString(arr1));
        String arr3[] = date.split("/",2);
        System.out.println("Arr3 ===> " + Arrays.toString(arr3));
        String msg = "I love India";
        String arr2[] = msg.split(" ");
        System.out.println("Arr2 ===> " + Arrays.toString(arr2));

        System.out.println("------------------------------" );

        String s = "ABCDEF";
        byte arr4[] = s.getBytes();
        System.out.println("Arr4 ===> " + Arrays.toString(arr4));
        System.out.println("Retrieving the data by using for each loop " );
        for(byte x : arr4){
           // System.out.print(x + " "); // 65 66 67 68 69 70
            System.out.print((char)x + " ");  // A B C D E F

        }
    }

    public static void main(String[] args) {
        new ClassC().meth1();
    }
}
