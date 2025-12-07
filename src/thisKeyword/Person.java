package thisKeyword;

public class Person {
    String name;

    Person(){
        this("Srinu");
        this.display();
    }
    Person(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Person Name is= " + name);
    }
    public static void main(String[] args){
        Person p = new Person();
    }
}
