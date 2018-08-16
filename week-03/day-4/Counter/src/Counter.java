public class Counter {
    public static void main(String[] args) {
        System.out.println(recCounter(5));
    }

    public static int recCounter(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + recCounter(n - 1);
        }
    }
}
