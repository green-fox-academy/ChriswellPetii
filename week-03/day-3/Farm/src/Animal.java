public class Animal {
    String name;
    int hunger;
    int thirst;

    Animal(String name) {
        this.name = name;
        Farm.listOfAnimals.add(name);
        this.hunger = 50;
        Farm.listOfHungriness.add(this.hunger);
        this.thirst = 50;
    }

    void eat() {
        modifyHunger();
    }

    void drink() {
        this.thirst--;
    }

    void play() {
        this.thirst--;
        modifyHunger();
    }

    private void modifyHunger() {
        this.hunger--;
        Farm.listOfHungriness.set(Farm.listOfAnimals.indexOf(this.name), this.hunger);
    }
}