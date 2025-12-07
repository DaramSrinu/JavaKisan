package staticTypes;

public class staticVariable {
    int a; // Instance Variable
    static int b;  // Static Variable

    staticVariable()
    {
        a++;
        b++;
        System.out.println("Instance Variable: " + a);
        System.out.println("Static Variable: " + b);
        System.out.println("--------------------");
    }
    public static void main(String[] args){
        new staticVariable();
        new staticVariable();
        new staticVariable();

    }

}
