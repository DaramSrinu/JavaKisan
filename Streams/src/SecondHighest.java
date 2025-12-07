import java.util.List;
import java.util.Optional;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(12,23,2,45,56,32,7,88,76);
        Optional<Integer> i = l1.stream()
                .sorted((a, b) -> b.compareTo(a))
                .skip(1)
                .findFirst();
        System.out.println(i.get());
    }
}
