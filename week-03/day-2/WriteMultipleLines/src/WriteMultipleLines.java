import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        // Create a function that takes 3 parameters: a path, a word and a number,
        // than it should write to a file.
        // The path parameter should be a string, that describes the location of the file.
        // The word parameter should be a string, that will be written to the file as lines
        // The number paramter should describe how many lines the file should have.
        // So if the word is "apple" and the number is 5, than it should write 5 lines
        // to the file and each line should be "apple"
        // The function should not raise any error if it could not write the file.
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a file path: ");
        String path = sc.nextLine();
        System.out.println("Give me a word: ");
        String word = sc.nextLine();
        System.out.println("Number of lines: ");
        int number = sc.nextInt();
        fileWriter(word, path, number);
    }

    private static void fileWriter(String word, String path, int number) {
        List<String> wordList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            wordList.add(i, word);
        }
        Path fPath = Paths.get(path);
        try {
            Files.write(fPath, wordList);
        } catch (IOException e) {
            System.out.println("Unable to write the file");
        }
    }
}
