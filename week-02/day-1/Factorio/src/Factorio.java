public class Factorio {
    public static void main(String[] args) {

        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial
        int a = 5;
        int b = 6;
        int results = factorio(a , b);

        System.out.println(results);

    }
    public static int factorio(int a, int b) {
        int factorio = a * b;

        return factorio;
    }
}
