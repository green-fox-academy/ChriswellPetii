public class Main {
    public static void main(String[] args) {
        Counter c = new Counter(8);
        c.add();
        c.add(500);
        c.get();
        c.reset();
        c.get();
    }
}
