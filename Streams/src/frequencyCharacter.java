import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyCharacter {
    public static void main(String[] args) {
        String str = "ecommerce";
        Map<Character,Long> map = str.chars()
                .mapToObj(i->(char)i)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("original str :" + str);
        System.out.println("map " + map);

    }
}
