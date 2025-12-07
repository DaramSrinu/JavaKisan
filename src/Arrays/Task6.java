package Arrays;

public class Task6 {
    public int[] maxEnd3(int[] nums){
      int max;
      if(nums[0] > nums[2]){
          max = nums[0];
      }else{
          max = nums[2];
      }
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;
    }
    public static void main(String[] args){
        Task6 t6 = new Task6();
          int result1[] = t6.maxEnd3(new int[]{1,2,3});
          for(int data : result1){
              System.out.println(data);
          }
    }
}
