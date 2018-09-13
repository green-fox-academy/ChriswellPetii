import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class FileReader {
    public static final String filename = "log.txt";

    public List<Task> load() {
        try {
            List<Task> tasks = new ArrayList<>();
            List<String> lines = Files.readAllLines(Paths.get(filename));

            for (String line : lines) {
                String[] parts = line.split(";");
                if (parts.length < 3) {
                    throw new RuntimeException("File corrupted");
                }
                Task task = new Task(Long.parseLong(parts[0]), parts[1], Boolean.parseBoolean(parts[2]));
                tasks.add(task);
            }

            return tasks;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return emptyList();
    }
}
