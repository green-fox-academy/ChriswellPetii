import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        Path path = Paths.get("my-file.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name here: ");
        String userInput1 = sc.nextLine();
        List<String> wLines = Arrays.asList(userInput1);
        try {
            Files.write(path, wLines);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }


    }
}
