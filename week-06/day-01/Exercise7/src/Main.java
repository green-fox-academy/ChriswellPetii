import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String toWords = "Write a Stream Expression to find the frequency of characters in a given string!";

        Map<String, Long> frequentChars = Arrays.stream(toWords.toLowerCase().split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        frequentChars.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
