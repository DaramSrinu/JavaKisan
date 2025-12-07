package StringHandling;

public class StringBufferMethods {
    void meth1(){
        StringBuffer sb = new StringBuffer();
        System.out.println("capacity:" + sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println("sb : " + sb);
        System.out.println("capacity after append:" + sb.capacity());
        System.out.println("length():" + sb.length());
        sb.append("q");
        System.out.println("capacity after appending q :" + sb.capacity());
        // (currentcapacity+1) * 2 = 17 * 2
        System.out.println("length() after appending q :" + sb.length());
        sb.append("r");
        System.out.println("capacity after appending r :" + sb.capacity());
        System.out.println("length() after appending r :" + sb.length());

        System.out.println("charAt : " + sb.charAt(sb.length()-2));
        System.out.println("charAt : " + sb.charAt(sb.length()-1));

        sb.setCharAt(0,'A');
        System.out.println("sb after SetcharAt : " + sb);
        System.out.println(sb.delete(0,2));
        System.out.println("reverse : " + sb.reverse());
        System.out.println("sb : " + sb);
        System.out.println("insert : " + sb.insert(sb.length(),'b'));
        System.out.println(sb.subSequence(4,9));
    }

    public static void main(String[] args) {
        new StringBufferMethods().meth1();
    }
}
