public class DivideByZero {
    public static void main(String[] args) {
        int num = 15;
        int div = 0;
        if (divide(num, div) != 0) {
            System.out.println(divide(num, div));
        } else {
            System.out.println("fail");
        }
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0
    }

    public static int divide(int num, int div) {
        div = num / 10;
        return div;
    }
}
