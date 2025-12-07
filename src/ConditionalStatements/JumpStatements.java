package ConditionalStatements;

public class JumpStatements {
    void meth1()
    {
        System.out.println("Implementing Jump Statements");
        for(int i=0; i<=10; i++){
            if(i==2){
                //break;
                //continue;
                return;
            }
            System.out.println("i value :" + i);
        }
        System.out.println("Compiler came out from for loop");

    }
    void task(int b){
        int a = 10;
        while(a<=20){
            if(a==15){
                while(b<=30){
                    if(b==25){
                        break;
                    }
                    System.out.println("b value: " + b);
                    b++;
                }
            }
            System.out.println("a value: " + a);
            a++;
        }
    }
    void task1(){
        int a = 10;
        for(int k =(a++ + new JumpStatements().meth2(5)) + (++a+3) + (++a+3);k>10;k++)
        {
            System.out.println(k+6);
            break;
        }
    }
    int meth2(int a){
        return new JumpStatements().meth3(10+1,15-3) + (a*2);
    }
    int meth3(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println("Start");
       JumpStatements js =new JumpStatements();
        js.meth1();
        // break; // C.E [Because we can use break statement ONLY inside "switch", loops]
        // continue; //C.E [Because we can use continue statement inside "loops"]
        System.out.println("------");
        js.task(20);
        System.out.println("------");
        js.task1();
        System.out.println("End");
    }
}
