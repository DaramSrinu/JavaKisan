public class ClassB {
    public void method1(){
        System.out.println("Method1 called");
    }
    public int add(int a, int b){
        System.out.println("Adding two numbers");
        return a+b;
    }
    public String getName(String s){
        System.out.println("User Name: " +s);
        return s;
    }
    public boolean checking(int a, int b){
        System.out.println("b value:" + b);
        if(a > 10){
            return true;
        }else{
            return false;
        }
    }
    public String callingName(int id, String name){
        System.out.println("Id of memeber: " + id);
        return name;
    }
    public static void main(String[] args){
        ClassB objB = new ClassB();
        System.out.println("Start");
        objB.method1();
        int r = objB.add(10,20);
        System.out.println(r);
        System.out.println(objB.getName("Java"));
        boolean r1 = objB.checking(11,20);
        System.out.println(r1);
        System.out.println(objB.callingName(101,"Srinu"));
        System.out.println("End");
    }
}
