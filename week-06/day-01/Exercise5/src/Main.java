import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String word = "SomEThinG";

        word.chars()
                .filter(Character::isUpperCase)
                .mapToObj(string -> Character.toString((char) string))
                .forEach(string -> System.out.println(string));
    }
}
