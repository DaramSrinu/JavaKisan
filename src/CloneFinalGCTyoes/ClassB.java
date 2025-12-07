package CloneFinalGCTyoes;

public class ClassB implements Cloneable{
    int x;
    int y;

    ClassB show() throws CloneNotSupportedException{
        ClassB obj = (ClassB) super.clone();
        return obj;
    }
}
