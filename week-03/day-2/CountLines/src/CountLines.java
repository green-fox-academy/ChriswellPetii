import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        List<String> fileString = new ArrayList<>();
        Path path = Paths.get("my-file.txt");
        try {
            fileString = Files.readAllLines(path);
            System.out.println(lineCounter(fileString));
        } catch (NoSuchFileException smt) {
            System.out.println(" No file");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static int lineCounter(List<String> fileString) {
        int counter = 0;
        for (int i = 0; i < fileString.size(); i++) {
            counter++;
        }
        return counter;
    }
}
