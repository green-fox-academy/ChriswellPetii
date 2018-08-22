package main.java.music;

abstract public class Instrument {
    private String name;

    abstract public void play();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
