public class Animal {
    int hunger;
    int thirst;

    void eat() {
        this.hunger = 50;
        this.hunger++;
    }

    void drink() {
        this.thirst = 50;
        this.thirst++;
    }

    void play() {
        this.thirst++;
        this.hunger++;
    }
}