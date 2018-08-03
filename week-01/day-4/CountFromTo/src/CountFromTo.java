import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Give two number and I can count to second number.");
        System.out.println("So give your first number!");
        int userInput1 = sc.nextInt();

        System.out.println("Give your second number!");
        int userInput2 = sc.nextInt();

        if (userInput1 > userInput2){
            System.out.println("The second number should be bigger");
        }
        if (userInput2 > userInput1) {
            while (userInput2 > userInput1) {
                userInput1++;
                System.out.println(userInput1 - 1);
            }
        }



    }
}
