package StringHandling;

import java.util.Scanner;

public class ClassB {
    void meth1(){
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = new String("Java");

        // equals()  : In String class equals() method is used to compare the content of two strings.
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equals(s3));  // t
        System.out.println(s2.equals(s4));  // t
        System.out.println("Java".equals("Java"));  // t
        System.out.println("JAVA".equals(s1)); // flase
        System.out.println("====>"+ "JAVA".equalsIgnoreCase(s1));  // true

        //   ==      : In String class == is used to check address locations of two Strings.
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);
        System.out.println(s2 == s4);
        System.out.println(s1 == s3);
        System.out.println("Java" == s1);
        System.out.println("Java" == "Java");
        System.out.println("Java" == new String("Java"));

        System.out.println("---------------------------------------");

        //System.out.println("length(): " + s1.length); // C.E because it is used for getting the length of an array
        System.out.println("length(): " + s1.length()); // 4
        System.out.println("length(): " + s1.concat(" is awesome")); //  Java is awesome
        System.out.println("length(): " + s1.concat(" is awesome").length()); // 15
        System.out.println("s1 : " + s1); // Java
        System.out.println("charAt : " + s1.charAt(0));  // J
        System.out.println("charAt : " + s1.charAt(s1.length()-1)); // a
        System.out.println("charAt : " + s1.charAt(s1.length()-2)); // v
        System.out.println("---------------------------------------");
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Gender M/F ");
        String data = sc.next();
        char gender = data.charAt(0);
        switch (gender) {
            case 'M':
                System.out.println("User is Male");
                break;
            case 'F':
                System.out.println("User is Female ");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }*/
        System.out.println("---------------------------------------");
        System.out.println("startsWith() : " + s1.startsWith("J"));
        System.out.println("startsWith() : " + "Java is awesome".startsWith(s1));
        System.out.println("startsWith() : " + "Java is awesome".startsWith(" ".concat(s1)));
        System.out.println("toLowerCase() : " + s1.toLowerCase());
        System.out.println("s1() : " + s1);
        System.out.println("toUpperCase() : " + s1.toUpperCase());
        String s5 = "I love India";
        System.out.println("subString(int a) : " + s5.substring(2));
        System.out.println("subString(int a, int b) : " + s5.substring(2,5));
        System.out.println("replace() : " + s1.replace("a","o"));
        System.out.println("s1() : " + s1);
        String s6 = " Hello World ";
        System.out.println(s6.length()); // 13
        System.out.println("trim() : " + s6.trim().length());  // 11
        System.out.println("indexOf() : " + s1.indexOf("a")); // Java // 1
        System.out.println("lastIndexOf() : " + s1.lastIndexOf("a")); // Java // 3








    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.meth1();
    }
}
