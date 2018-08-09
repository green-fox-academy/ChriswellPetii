import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        System.out.println("Hi, type 5 number: ");
        int userInput1 = sc.nextInt();
        int userInput2 = sc.nextInt();
        int userInput3 = sc.nextInt();
        int userInput4 = sc.nextInt();
        int userInput5 = sc.nextInt();

        double sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
        System.out.println("Sum : " + (int)sum);
        System.out.println("Average: " + (sum / 5));


    }
}
