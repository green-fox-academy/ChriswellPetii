public class Domino implements Comparable<Domino> {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Domino o) {
        if (this.values[0] == o.values[0]) {
            return this.values[1] - o.values[1];
        }
        return this.values[0] - o.values[0];
    }
}