public class Sum {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer
        int a = 5;
        int b = 6;
        int results = sum(a, b);

        System.out.println(results);

    }

    public static int sum(int a, int b) {
        int sum = a + b;

        return sum;
    }
}
