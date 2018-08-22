package main.java.music;

public class Violin extends StringedInstrument {
    private int numberOfStrings;

    public Violin() {
        super();
        setNumberOfStrings(4);
        setName("Violin");
    }

    Violin(int numberOfStrings) {
        super();
        setNumberOfStrings(numberOfStrings);
        setName("Violin");
    }


    @Override
    String sound() {
        return "Screech";
    }

    @Override
    public void play() {
        System.out.println(getName() + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
