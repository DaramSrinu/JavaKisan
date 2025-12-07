package Oops.Abstraction.Interfaces;

public interface InterfaceB {
    void show();
    default void display()
    {
        System.out.println("Interface B display()");
    }
}
