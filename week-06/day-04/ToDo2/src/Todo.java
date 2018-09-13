import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

import static java.time.ZoneOffset.UTC;


public class Todo {
    private final long id;
    private final String name;
    private final boolean isDone;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

    Todo(String name, boolean isDone) {
        this(0, name, isDone);
    }


    public Todo(long id, String name, boolean isDone) {
        this.id = id;
        this.name = name;
        this.isDone = isDone;
        this.createdAt = LocalDateTime.now(Clock.system(UTC));
    }

    public Todo(long id, String name, boolean isDone, LocalDateTime completedAt) {
        this(id, name, isDone);
        this.completedAt = LocalDateTime.now(Clock.system(UTC));
    }

    public Todo(long id, String name, boolean isDone, LocalDateTime createdAt, LocalDateTime completedAt) {
        this(id, name, isDone);
        this.createdAt = createdAt;
        this.completedAt = completedAt;

    }

    private String labelIfDone() {
        if (isDone) {
            return "X";
        }
        return " ";
    }

    public boolean isDone() {
        return isDone;
    }

    public Todo asDone() {
        return new Todo(id, name, true, createdAt);
    }

    public Todo withId(long id) {
        return new Todo(id, name, isDone);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s - [%s] '%s' %s", id, labelIfDone(), name, completionTime(createdAt, completedAt));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return id == todo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String completionTime(LocalDateTime createdAt, LocalDateTime completedAt) {
        Duration duration = Duration.between(createdAt, completedAt);
        long absSeconds = Math.abs(duration.getSeconds());
        long hour = absSeconds / 3600;
        long min = (absSeconds % 3600) / 60;
        long day = hour / 24;

//        "%d:%02d:%02d", absSeconds / 3600, (absSeconds % 3600) / 60, absSeconds % 60);
        String durattion = day + " days, " + hour + " hours, " + min + " minutes";
        return durattion;
    }

    LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime time) {
        this.completedAt = time;
    }
}