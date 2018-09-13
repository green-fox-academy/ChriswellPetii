import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class FileReader {
    public static final String filename = "src/logg.txt";

    public List<Todo> load() {
        try {
            List<Todo> todos = new ArrayList<>();
            List<String> lines = Files.readAllLines(Paths.get(filename));

            for (String line : lines) {
                String[] parts = line.split(";");
                if (parts.length < 3) {
                    throw new RuntimeException("File corrupted");
                }
                Todo todo = new Todo(Long.parseLong(parts[0]), parts[1], Boolean.parseBoolean(parts[2]), LocalDateTime.parse(parts[3]), LocalDateTime.parse(parts[4]));
                todos.add(todo);
            }

            return todos;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return emptyList();
    }
}
