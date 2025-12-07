package ConditionalStatements;

public class IterationStatement {
    void meth1(int a){
        System.out.println("meth1() called");
        while (a <= 5){
            System.out.println("a value :" + a);
            a++;
        }
        System.out.println("meth1() executed");
    }
    void meth2(int i) // It will generate an Infinity loop
    {
        System.out.println("meth2() called");
        while(i < 5)
            //int x = 90  // C.E we should not write any declarative statements here
            System.out.println("i value :" + i);
            i++;
            System.out.println("meth2() executed");
    }
    void meth3(int i){
        System.out.println("meth3() called");
        while(true){
            System.out.println("i value :" + i);
            i++;
            break; // If the compiler came across the break statement it will come out from the loop
        }
        // System.out.println("meth3() executed); // C.E Unreachable Code
    }
    void meth4(int a){
        System.out.println("meth4() called");
        do{
            System.out.println("i value :" + a);
            a++;
        }while(a<=5);
       System.out.println("meth4() executed ====>" + a);
    }
    void task(int Start, int end){
        int i = Start;
        while(i < end) {
            System.out.println("Printing all Number from num1 to num2: "+i);
            i++;
        }
        int j =Start;
        while(j < end){
            if(j%2 == 0){
                System.out.println("Printing Even numbers: "+j);
                }
            j++;
        }
        int k=Start;
        while(k < end){
            if(k%2==1){
                System.out.println("Printing Odd Numbers: "+k);
            }
            k++;
        }
    }
    public static void main(String[] args){
        IterationStatement iter = new IterationStatement();
        iter.meth1(1);
        iter.meth2(10);
        iter.meth3(5);
        iter.meth4(1);
        iter.task(1,10);
    }

}
