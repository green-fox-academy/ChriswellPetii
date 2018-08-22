package animals;

abstract public class Animal {
    String name;
    int age;
    String gender;

    public String getName() {
        return this.name;
    }

    abstract public String breed();
}
