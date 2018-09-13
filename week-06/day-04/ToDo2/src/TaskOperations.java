import java.util.List;

public class TaskOperations {
    private final TaskRepo taskRepo;

    TaskOperations() {
        this.taskRepo = new TaskRepo();
    }

    public void removeTask(int id) {
        Task task = taskRepo.findById(id);

        taskRepo.remove(task);
    }

    public void doneTask(int id) {
        Task task = taskRepo.findById(id);

        if (task == null) {
            throw new IndexOutOfBoundsException();
        }
        taskRepo.save(task.asDone());
    }

    public void addTask(String task) {
        taskRepo.add(new Task(task, false));
    }

    public void listAll() {
        List<Task> tasks = taskRepo.findAll();
        if (tasks.isEmpty()) {
            System.out.println("No todos for today! :)");
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
