import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %   %
        // %   %
        // %   %
        // %   %
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number");
        int userInput1 = sc.nextInt();
        int a;
        int b;

        for (a = 0; a < userInput1; a++) {
            System.out.println();

            for (b = 0; b < userInput1; b++) {

                if (b == 0 || b == (userInput1 -1) || a == 0 || a == (userInput1 -1)) {
                    System.out.print("%");
                } else {

                    System.out.print(" ");
                }
            }
        }
    }
}


