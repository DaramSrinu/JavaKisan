import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseWord {
    public static void main(String[] args) {
        // Reverse each word in a sentence using JAVA Stream API
        String str = "I am learning Java from Kisan Youtube Channel";
        String result = Arrays.stream(str.trim().split("\\s"))
                .map(word->new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
