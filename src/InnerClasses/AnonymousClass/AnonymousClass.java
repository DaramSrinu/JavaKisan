package InnerClasses.AnonymousClass;

public class AnonymousClass {
    static OuterClass out = new OuterClass(){
        void print(){
            System.out.println("Start");
            super.print();
            System.out.println("I am in Anonymous Class");
            System.out.println("End");
        }
    };
    public static void main(String[] args) {
        out.print();
    }
}
