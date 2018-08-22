package main.java.music;

abstract public class StringedInstrument extends Instrument {
    private int numberOfStrings;

    StringedInstrument() {
    }

    abstract String sound();
}
