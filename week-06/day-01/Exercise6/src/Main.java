import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
        cities.stream()
                .filter(string -> string.startsWith("A"))
                .filter(string -> string.endsWith("I"))
                .forEach(string -> System.out.println(string));
    }
}
