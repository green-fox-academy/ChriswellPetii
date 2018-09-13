import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileWriter {
    public void writeTasks(List<Task> tasks) {
        try {
            Files.write(Paths.get(FileReader.filename), serializeTasks(tasks));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> serializeTasks(List<Task> tasks) {
        List<String> result = new ArrayList<>();

        for (Task task : tasks) {
            result.add(String.format("%s;%s;%s", task.getId(), task.getName(), task.isDone()));
        }

        return result;
    }
}
