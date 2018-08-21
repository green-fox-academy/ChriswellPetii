public class Person {
    private String name;
    private int age;
    private String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + ".");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getGender() {
        return this.gender;
    }
}
