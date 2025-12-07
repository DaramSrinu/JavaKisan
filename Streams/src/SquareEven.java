import java.util.List;

public class SquareEven {

    public static void main(String[] args){
        List<Integer> l1 = List.of(1,2,3,4,5,6,7,8,9,10);
       l1.stream()
               .filter(n-> n%2==0)
               .map(n-> n*n)
               .forEach(s-> System.out.println(s));
               //.forEach(System.out::println);
    }
}
