import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

import static java.time.ZoneOffset.UTC;


public class Todo {
    private final long id;
    private String name;
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
        this.completedAt = LocalDateTime.now(Clock.system(UTC));
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
        LocalDateTime completedAtAsDone = LocalDateTime.now(Clock.system(UTC));
        return new Todo(id, name, true, createdAt, completedAtAsDone);
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
        Duration duration = Duration.between(createdAt, completedAt);
        if (duration.getSeconds() != 0) {
            return String.format("%s - [%s] '%s' %s", id, labelIfDone(), name, completionTime(createdAt, completedAt));
        } else {
            return String.format("%s - [%s] '%s'", id, labelIfDone(), name);
        }
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
        Duration diff = Duration.between(createdAt, completedAt);
        long diffSec = Math.abs(diff.getSeconds());
        long sec = 1;
        long min = sec * 60;
        long hour = min * 60;
        long day = hour * 24;

        long days = diffSec / day;
        diffSec = diffSec % day;
        long hours = diffSec / hour;
        diffSec = diffSec % hour;
        long mins = diffSec / min;
        diffSec = diffSec % min;
        long secs = diffSec / sec;

        String durattion = days + " days, " + hours + " hours, " + mins + " minutes " + secs + " seconds";
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

    public void setCreatedAt(LocalDateTime time) {
        this.createdAt = time;
    }

    public void setName(String name) {
        this.name = name;
    }
}