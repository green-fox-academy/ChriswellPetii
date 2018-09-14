import java.time.LocalDateTime;
import java.util.List;

public class TaskRepo {
    private final FileReader reader;
    private final FileWriter writer;

    public TaskRepo() {
        reader = new FileReader();
        writer = new FileWriter();
    }

    public List<Todo> findAll() {
        return reader.load();
    }

    public void add(Todo todo) {
        List<Todo> todos = findAll();

        long nextId = findNextId(todos);
        todos.add(todo.withId(nextId));

        saveAll(todos);
    }

    public Todo findById(long id) {
        List<Todo> todos = findAll();
        Todo todoFound = null;

        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todoFound = todo;
            }
        }

        return todoFound;
    }

    public void save(Todo todo) {
        List<Todo> todos = findAll();
        LocalDateTime currentCreatedAt;
        LocalDateTime currentCompletedAt;
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).equals(todo)) {
                currentCreatedAt = todos.get(i).getCreatedAt();
//                currentCompletedAt = todos.get(i).getCompletedAt();
                todos.remove(i);
                todos.add(i, todo);
                todos.get(i).setCreatedAt(currentCreatedAt);
//                todos.get(i).setCompletedAt(currentCompletedAt);
            }
        }

        saveAll(todos);
    }

    public void remove(Todo todo) {
        List<Todo> todos = findAll();

        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).equals(todo)) {
                todos.remove(i);
                i--;
            }
        }

        saveAll(todos);
    }

    private long findNextId(List<Todo> todos) {
        long largestID = 0;

        for (Todo todo : todos) {
            if (todo.getId() > largestID) {
                largestID = todo.getId();
            }
        }

        return largestID + 1;
    }

    private void saveAll(List<Todo> todos) {
        writer.writeTasks(todos);
    }
}
