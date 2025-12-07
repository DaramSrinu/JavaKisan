package StringHandling;

public class StringHandlingTypes {
    void meth1(){
        String s1 = new String("Java");
        StringBuffer buffer1 = new StringBuffer("Java");
        StringBuilder builder1 = new StringBuilder("Java");

        s1.concat(" is awesome");
        //s1 = s1.concat(" is awesome");
        buffer1.append(" is awesome");
        builder1.append(" is awesome");

        System.out.println("String data : " + s1);
        System.out.println("StringBuffer data : " + buffer1);
        System.out.println("StringBuilder data : " + builder1);
    }
    void meth2(){
        String s1 = new String("Java");
        StringBuffer buffer1 = new StringBuffer("Java");
        StringBuilder builder1 = new StringBuilder("Java");

        String s2 = new String("Java");
        StringBuffer buffer2 = new StringBuffer("Java");
        StringBuilder builder2 = new StringBuilder("Java");

        /*
          String Constant Pool is a special memory allocated only for String class Objects.
          Whenever we are using StringBuffer and StringBuilder class objects, they are created in Heap Memory
         */

        // using equals() method to compare the objects
        System.out.println("Comparing String Class : " + s1.equals(s2));
        System.out.println("Comparing StringBuffer Class : " + buffer1.equals(buffer2));
        System.out.println("Comparing StringBuilder Class : " + builder1.equals(builder2));

        // using "==" operator to compare the objects
        System.out.println("Comparing String Class : " + (s1 == s2));
        System.out.println("Comparing StringBuffer Class : " + (buffer1 == buffer2));
        System.out.println("Comparing StringBuilder Class : " + (builder1 == builder2));

        // How to check the content of StringBuffer and String Builder objects?
        System.out.println("Comparing StringBuffer Class using toString() : " + buffer1.toString().equals(buffer2.toString()));
        System.out.println("Comparing StringBuilder Class using toString() : " + builder1.toString().equals(builder2.toString()));
    }

    public static void main(String[] args) {
        StringHandlingTypes sht = new StringHandlingTypes();
       // sht.meth1();
        sht.meth2();
    }
}
