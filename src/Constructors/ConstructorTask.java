package Constructors;

public class ConstructorTask {
    public ConstructorTask()
    {
        System.out.println("Sunday");
        ConstructorTask ct = new ConstructorTask(10);
        System.out.println("Tuesday");
        String s = ct.display("Challange Accepted");
        System.out.println(s);
    }
    public ConstructorTask(int temp)
    {
        System.out.println("Saturday");
        new ConstructorTask(10,20);
        System.out.println("Monday");
    }
    String display(String s)
    {
        System.out.println("In the next Statement I am returning String value");
        return s;
    }
    public ConstructorTask(int data, int temp)
    {
        System.out.println("Thursday");
    }
    public static void main(String[] args)
    {
        ConstructorTask ct = new ConstructorTask();
        System.out.println("Output Verified");
    }
}
