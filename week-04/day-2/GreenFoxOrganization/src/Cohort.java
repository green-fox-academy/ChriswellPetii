import java.util.ArrayList;

public class Cohort {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Mentor> mentors = new ArrayList<>();

    Cohort(String name) {
        this.students.clear();
        this.mentors.clear();
        this.name = name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addMentor(Mentor mentor) {
        this.mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + this.students.size() + " students and " + this.mentors.size() + " mentors.");
    }
}
