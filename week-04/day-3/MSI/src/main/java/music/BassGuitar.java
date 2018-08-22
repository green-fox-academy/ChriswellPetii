package main.java.music;

public class BassGuitar extends StringedInstrument {
    private int numberOfStrings;

    public BassGuitar() {
        super();
        setNumberOfStrings(4);
        setName("Bass Guitar");
    }

    public BassGuitar(int numberOfStrings) {
        super();
        setNumberOfStrings(numberOfStrings);
        setName("Bass Guitar");
    }


    @Override
    String sound() {
        return "Duum-duum-duum";
    }

    @Override
    public void play() {
        System.out.println(getName() + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
