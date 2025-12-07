package Arrays;

public class Task3 {
    public boolean firstLast6(int[] nums){
        if ((nums[0] == 6) || (nums[nums.length-1] == 6)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
       Task3 t3 = new Task3();
       int input[] = {4,8,9,6};
       boolean result  = t3.firstLast6(input);
       System.out.println(result);
    }
}
