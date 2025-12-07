package Java8Features.OptionalClass;

import java.util.Optional;

public class ClassA {
    void meth1(){
        System.out.println("Implementing Optional Class");
       String arr[] =  new String[5];
       arr[0] = "India";
       arr[1] = "Japan";
       arr[2] = "USA";
        System.out.println(arr[0]);
        System.out.println(arr[1].length());
        // System.out.println(arr[3].length()); // C.E NullPointerException: Cannot invoke "String.length()" because "arr[3]" is null

        Optional<String> o = Optional.ofNullable(arr[2]);
        System.out.println("===> "+o);
        if(o.isPresent()){
            System.out.println("Data is present");
            System.out.println(o.get());
            System.out.println(o.get().length());
        }else{
            System.out.println("It is empty");
        }
    }

    public static void main(String[] args) {
        new ClassA().meth1();
    }
}
