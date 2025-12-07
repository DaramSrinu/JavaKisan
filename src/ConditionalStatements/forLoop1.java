package ConditionalStatements;

public class forLoop1 {
    void meth1(){
        int arr[] = {10,20,30,40,50};
        System.out.println("Elements present at 0th index : " + arr[0]);
        System.out.println("Elements present at 1st index : " + arr[1]);
        System.out.println("Elements present at 2nd index : " + arr[2]);
        System.out.println("Elements present at 3rd index : " + arr[3]);
        System.out.println("Elements present at 4th index : " + arr[4]);
        System.out.println("------------------------------------------");

        System.out.println("Reteriving the data from the Array by using for-loop");

        for(int index = 0; index <= 4; index++){
            System.out.println(arr[index]);
        }
        System.out.println("------------------------------------------");

        System.out.println("Reteriving the data from Array in REVERSE ORDER by using for-loop");
        for (int index = 4; index >=0 ; index--){
            System.out.println(arr[index]);
        }
        System.out.println("------------------------------------------");
        System.out.println("Reteriving the data from Array  by using foreach-loop");

        for(int data : arr){
            System.out.println(data);
        }
        //for -loop will be using index values to reterive data from array
        // foreach-loop will be working on STREAMING data to reterive the data from array
    }
    void meth2(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(num +" * "+ i + " = " +(num*i));
        }
    }
    void meth3(int num){
        int factorial =1;
        for(int i = 1; i <=num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial value of " + num +" is = " +factorial);
    }
    void display(){
        int a = 10;
        for(int k=(a++) + (++a) +(++a);k>10;k++){
            System.out.println(k);
            break;
        }
    }
    void task(){
        for(int i=1; i<=5;i++)
        {
            for(int j = 1; j <=5; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void task1(){
        for(int i = 1; i<=5;i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void task2(){
        for(int i = 1; i<=5;i++){
            for(int j=i; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void task3(int n){
        int i,j;
        for(i = 0; i < n;i++){
            for(j=2*(n-i); j>=0;  j--){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        forLoop1 fl1 = new forLoop1();
        //fl1.meth1();
        //fl1.meth2(5);
        fl1.meth3(5);
        fl1.display();
        System.out.println("----------");
        fl1.task();
        System.out.println("----------");
        fl1.task1();
        System.out.println("----------");
        fl1.task2();
        System.out.println("----------");
        fl1.task3(5);

    }
}
