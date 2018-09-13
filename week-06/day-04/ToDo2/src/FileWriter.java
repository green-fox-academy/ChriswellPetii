import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileWriter {
    public void writeTasks(List<Todo> todos) {
        try {
            Files.write(Paths.get(FileReader.filename), serializeTasks(todos));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> serializeTasks(List<Todo> todos) {
        List<String> result = new ArrayList<>();

        for (Todo todo : todos) {
            String asd = String.format("%s;%s;%s;%s;%s", todo.getId(), todo.getName(), todo.isDone(), todo.getCreatedAt(), todo.getCompletedAt());
            result.add(asd);
        }

        return result;
    }
}
