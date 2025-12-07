package Arrays;

public class Task4 {
    public boolean sameFirstLast(int[] nums){
        if(nums.length >=1 && nums[0] == nums[nums.length-1]){
            return true;
        }
        return false;
    }
    public boolean commonEnd(int[] a, int[] b){
               if(a[0] == b[0] || a[a.length-1] == b[b.length-1]){
                   return true;
               }
               return false;
           }

    public static void main(String[] args){
          Task4   t4 = new Task4();
          int input[] = {6,9,2,1};
        //boolean result = t4.sameFirstLast(input);
        //System.out.println(result);
        int input1[] = {9,3,2,1};
        boolean result1 = t4.commonEnd(input,input1);
          System.out.println(result1);
    }
}
