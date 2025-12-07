package StringHandling;

public class ClassD {

    public String helloName(String name){
        return "Hello " + name + "! ";
    }
    public String makeAbba(String a, String b){
        return a + b + b + a;
    }
    public void meth1(String name){
        String reverse = "";
        for(int i = name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println(reverse);
        if(name.equals(reverse)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
    public String makeOutWord(String out, String word){
        return out.substring(0,2) + word + out.substring(2);
    }
    public static void main(String[] args){
        ClassD dobj = new ClassD();
        System.out.println(dobj.helloName("srinu"));
        System.out.println(dobj.makeAbba("Hii","Bye"));
        dobj.meth1("madam");
        System.out.println(dobj.makeOutWord("<<>>","Java"));
    }
}
