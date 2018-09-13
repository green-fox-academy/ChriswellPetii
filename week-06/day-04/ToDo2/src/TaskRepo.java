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

        save(todos);
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

        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).equals(todo)) {
                todos.remove(i);
                todos.add(i, todo);
            }
        }

        save(todos);
    }

    public void remove(Todo todo) {
        List<Todo> todos = findAll();

        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).equals(todo)) {
                todos.remove(i);
                i--;
            }
        }

        save(todos);
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

    private void save(List<Todo> todos) {
        writer.writeTasks(todos);
    }
}
