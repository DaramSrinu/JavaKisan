package InnerClasses.Enum;

public class EnumClass {
    void meth1(){
        System.out.println("Using Java Enum");
        Days d = Days.thursday;
        System.out.println("Today is : " + d);
        System.out.println("Implementing enum in switch");
        switch (d) {
            case monday -> System.out.println("monday got executed");
            case tuesday -> System.out.println("tuesday got executed");
            case wednesday -> System.out.println("wednesday got executed");
            case thursday -> System.out.println("thursday got executed");
            case friday -> System.out.println("friday got executed");
            case saturday -> System.out.println("saturday got executed");
            case sunday -> System.out.println("sunday got executed");
            default -> System.out.println("Invalid input");
        }
            System.out.println("--------------------");
        Days arr[]  = Days.values();
        for(Days x : arr){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        new EnumClass().meth1();
    }
}
