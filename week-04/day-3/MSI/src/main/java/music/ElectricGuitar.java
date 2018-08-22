package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    private int numberOfStrings;

    public ElectricGuitar() {
        super();
        setNumberOfStrings(6);
        setName("Electric Guitar");
    }

    public ElectricGuitar(int numberOfStrings) {
        super();
        setNumberOfStrings(numberOfStrings);
        setName("Electric Guitar");
    }

    @Override
    String sound() {
        return "Twang";
    }

    @Override
    public void play() {
        System.out.println(getName() + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
