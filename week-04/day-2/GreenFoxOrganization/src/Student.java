public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    Student() {
        super();
        this.previousOrganization = "The School of Life";
    }

    Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");

    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }
}
