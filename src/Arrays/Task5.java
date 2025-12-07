package Arrays;

public class Task5 {
    public int sum3(int[] nums){
        return nums[0] + nums[1] + nums[2];
    }

    public int[] middleWay(int[] a,int[] b){
        return new int []{a[1],b[1]};
    }

    public int[] makeLast(int[] nums){
       int arr[] = new int[nums.length*2];
      arr[arr.length-1] =  nums[nums.length-1];
      return arr;
    }

    public static void main(String[] args){
       Task5 t5 = new Task5();
       int result =t5.sum3(new int[] {6,6,6});
       System.out.println(result);

       int input1[] = {6,8,9};
       int input2[] = {10,20,30};
       int result1[] = t5.middleWay(input1,input2);
       for(int data : result1){
           System.out.print(data + " ");
       }
       System.out.println();
       int  result2[] = t5.makeLast(input1);
       for(int data1 : result2){
           System.out.print(data1 + " ");
       }

    }
}
