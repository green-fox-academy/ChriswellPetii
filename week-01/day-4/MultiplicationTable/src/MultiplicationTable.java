import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number and i give you that numbers multiplication table!");
        int userInput1 = sc.nextInt();
        int a = 1;
        while (a <= 10) {
            System.out.println(a + " * " + userInput1 + " = " + (a * userInput1));
            a++;
        }
    }
}
