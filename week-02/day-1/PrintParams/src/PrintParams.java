public class PrintParams {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `printParams`
        //   which prints the input String parameters
        // - It can have any number of parameters

        // Examples
        // printParams("first")
        // printParams("first", "second")
        // printParams("first", "second", "third", "fourth")

        printParams("first");
        printParams("first", "second");
        printParams("first", "second", "third");
        printParams("first", "second", "third", "fourth");

    }

    public static void printParams(String... args) {

        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();

    }
}
