public class Sponsor extends Person {
    String company;
    int hiredStudents;

    Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " who represents " + this.company + " and hired " + this.hiredStudents + " students so far.");
    }

    public void hire() {
        this.hiredStudents++;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

}
