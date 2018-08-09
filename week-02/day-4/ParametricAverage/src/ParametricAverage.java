import java.util.ArrayList;
import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int howManyNumber = sc.nextInt();
        int sum = 0;
        int average = 0;

        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
        System.out.println("How many numbers do you ant to add ?: ");

        getNumbers(sc, numbers, howManyNumber);
        System.out.println("Sum: " + sumNumbers(numbers, sum));

        average = sumNumbers(numbers, sum) / howManyNumber;

        System.out.println("Average: " + average);

    }

    private static void getNumbers(Scanner sc, ArrayList<Integer> numbers, int howManyNumber) {
        for (int i = 0; i < howManyNumber; i++) {
            int userInput1 = sc.nextInt();
            numbers.add(i, userInput1);
        }
    }

    private static int sumNumbers(ArrayList<Integer> numbers, int sum) {
        for (Integer i : numbers) {
            sum += i;
        }
        return sum;
    }
}
