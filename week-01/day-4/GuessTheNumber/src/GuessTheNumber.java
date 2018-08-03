import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number:");
        int userInput1 = 0;
        int stored = 8;

        while (userInput1 != stored) {
            userInput1 = sc.nextInt();


            if (userInput1 < stored) {
                System.out.println("The stored number is higher");
            }
            if (userInput1 > stored) {
                System.out.println("The stored number is lower");
            }
            if (userInput1 == stored) {
                System.out.println("You found the number: 8");
            }
        }
    }
}

