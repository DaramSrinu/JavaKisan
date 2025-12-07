package Arrays;

public class ClassA {

    void meth1(){
        int arr1[];
        arr1 = new int[5];
        int arr2[] = new int[4];
        int arr3[] = {100,200,300};
        int arr4[] = new int[] {11,12,13,14,15};

        String s = "Java";

        // Getting the length of an array
        System.out.println("arr1 length :" + arr1.length);
        System.out.println("arr2 length :" + arr2.length);
        System.out.println("arr3 length :" + arr3.length);
        System.out.println("arr4 length :" + arr4.length);

        System.out.println("String length :" + s.length());
        System.out.println("--------------------");

        // Reteriving the data from Array
        System.out.println(arr1[2]);

        // If I am printing arr1 data ==> 0 25 0 35 45

        arr1[1] = 25;
        arr1[3] = 35;
        arr1[arr1.length-1] = 45; // Passing the data at 4th index position

        // Retriving the data from arr1 by using for-loop
        for(int i = 0; i <= arr1.length-1; i++){
            System.out.println("arr1 data :" + i + " ");
        }
        System.out.println();

        // Retriving the data from arr1 in reverse order by using for-loop
        for(int i= arr1.length-1; i>=0; i--){
            System.out.println("arr1 data :" + i + " ");
        }
        System.out.println();
        // Reteriving the data from arr1 by using foreach-loop
        for(int data:arr1){
            System.out.println(data + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        System.out.println(arr3[arr1.length-arr2.length]); // 200
        try {
            System.out.println(arr3[3]); // ArrayIndexOutOfBoundException
            // If we are trying to access an index position which is
            // not available in our array we will be getting AIOB Exception
        }catch(ArrayIndexOutOfBoundsException aiob){
            System.out.println(aiob);
        }
    }
    public static void main(String[] args){
        new ClassA().meth1();
    }
}
