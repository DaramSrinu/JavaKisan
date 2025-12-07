package StringHandling;


public class ClassA {
    void meth1() {
        String s1 = "Srinu";
        String s2 = new String("SRINU");
        char arr[] = {'j', 'a', 'v', 'a'};
        String s3 = new String(arr);
        String s4 = new String(arr, 1, 2);

        System.out.println("S1 : " + s1);
        System.out.println("S2 : " + s2);
        System.out.println("S3 : " + s3);
        System.out.println("S4 : " + s4);
    }
    void meth2()
        {
        String s1 = "Java";
        System.out.println("Before Concat: " + s1); // Java
        System.out.println("Concat Result: " + s1.concat(" Programming")); // Java Programming
        System.out.println(s1); // Java
        s1 = s1.concat(" is awesome");
        System.out.println("After concat: "  + s1); // Java is awesome
    }

    public static void main(String[] args) {
       ClassA aobj =  new ClassA();
        aobj.meth1();
        aobj.meth2();
    }
}
