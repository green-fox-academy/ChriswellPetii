import java.util.List;

public class TaskRepo {
    private final FileReader reader;
    private final FileWriter writer;

    public TaskRepo() {
        reader = new FileReader();
        writer = new FileWriter();
    }

    public List<Task> findAll() {
        return reader.load();
    }

    public void add(Task task) {
        List<Task> tasks = findAll();

        long nextId = findNextId(tasks);
        tasks.add(task.withId(nextId));

        save(tasks);
    }

    public Task findById(long id) {
        List<Task> tasks = findAll();
        Task taskFound = null;

        for (Task task : tasks) {
            if (task.getId() == id) {
                taskFound = task;
            }
        }

        return taskFound;
    }

    public void save(Task task) {
        List<Task> tasks = findAll();

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(task)) {
                tasks.remove(i);
                tasks.add(i, task);
            }
        }

        save(tasks);
    }

    public void remove(Task task) {
        List<Task> tasks = findAll();

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(task)) {
                tasks.remove(i);
                i--;
            }
        }

        save(tasks);
    }

    private long findNextId(List<Task> tasks) {
        long largestID = 0;

        for (Task task : tasks) {
            if (task.getId() > largestID) {
                largestID = task.getId();
            }
        }

        return largestID + 1;
    }

    private void save(List<Task> tasks) {
        writer.writeTasks(tasks);
    }
}
