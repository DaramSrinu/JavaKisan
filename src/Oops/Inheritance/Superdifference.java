package Oops.Inheritance;

public class Superdifference {
    void meth1(){
        System.out.println("Super difference called");
    }
    void show(){
        System.out.println("Hii");
    }
    Superdifference(){
        System.out.println("Super difference default constructor");
    }
    Superdifference(String s){
        this();
        System.out.println("Super difference parameterized constructor : " + s);
    }
}
