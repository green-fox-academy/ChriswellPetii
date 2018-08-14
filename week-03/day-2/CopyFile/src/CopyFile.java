import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        Path ori = Paths.get("my-file.txt");
        Path copy = Paths.get("copied-my-file.txt");
        List<String> file = new ArrayList<>();
        print(ori, copy, file);
    }

    private static void print(Path ori, Path copy, List<String> file) {
        if (copyTextFile(ori, copy, file)) {
            System.out.println("Successful copy.");
        }else {
            System.out.println("Something wrong.");
        }
    }

    private static boolean copyTextFile(Path ori, Path copy, List<String> file) {
        try {
            file = Files.readAllLines(ori);
        } catch (IOException e) {
            System.out.println("Unable to read the file!");
            return false;
        }
        try {
            Files.write(copy,file);
            return true;
        } catch (IOException e) {
            System.out.println("Unable to copy the file!");
            return false;
        }
    }
}
