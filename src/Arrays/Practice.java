package Arrays;
import java.util.Arrays;

public class Practice {
    void meth1(){
        int [] arr = {10,2,5,23,8,43,12};
        Arrays.sort(arr);
       for(int i=0; i < arr.length-1; i++){
           System.out.print(arr[i] + " ");
       }
    }

    public static void main(String[] args) {
        new Practice().meth1();
    }
}
