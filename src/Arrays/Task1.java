package Arrays;

public class Task1 {
    void meth1(){
        System.out.print("Java is ");
        System.out.println(" awesome");
        System.out.print("So I ");
        System.out.println("love it");
        System.out.println("Java is Object Oriented");
    }
    int[] meth2(){
        int arr[] = {3,2,3};
        for(int i =0; i < arr.length-1; i++){
            if(arr[i] == 2 && arr[i+1] == 3)
                arr[i+1] =0;
        }
            return arr;
        }
    int meth3(int[] arr){
       if(arr.length >= 2){
           return arr[0] + arr[1];
       }else if (arr.length == 1){
           return arr[0];
       }else {
           return 0;
       }
    }
    public static void main(String[] args){
        Task1 t1=new Task1();
        //t1.meth1();

        int result[]=t1.meth2();
        for(int data : result){
            System.out.print(data + " ");
        }
        int input[] = {40,50,60,70};
        int result2 = t1.meth3(new int[] {40,50,60,70});
        int result1 = t1.meth3(input);
        System.out.println(result1);
    }
}
