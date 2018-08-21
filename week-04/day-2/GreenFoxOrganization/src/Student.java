public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

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
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");

    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }
}
