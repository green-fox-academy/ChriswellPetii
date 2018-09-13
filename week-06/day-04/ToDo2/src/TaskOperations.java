import java.time.LocalDateTime;
import java.util.List;

public class TaskOperations {
    private final TaskRepo taskRepo;

    TaskOperations() {
        this.taskRepo = new TaskRepo();
    }

    public void removeTask(int id) {
        Todo todo = taskRepo.findById(id);

        taskRepo.remove(todo);
    }

    public void doneTodo(int id) {
        Todo todo = taskRepo.findById(id);


        if (todo == null) {
            throw new IndexOutOfBoundsException();
        }
        todo.setCompletedAt(LocalDateTime.now());
        taskRepo.save(todo.asDone());
    }

    public void addTask(String task) {
        taskRepo.add(new Todo(task, false));
    }

    public void listAll() {
        List<Todo> todos = taskRepo.findAll();
        if (todos.isEmpty()) {
            System.out.println("No todos for today! :)");
        }

        for (Todo todo : todos) {
            System.out.println(todo);
        }
    }
}
