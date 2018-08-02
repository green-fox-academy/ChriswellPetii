import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        Scanner sc = new Scanner(System.in);
        System.out.println("How many girl come to the party ?");
        int userInput1 = sc.nextInt();

        System.out.println("How many boy comes to the party ?");
        int userInput2 = sc.nextInt();

        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        if (userInput1 <= 0) {
            System.out.println("Sausage party");
        }
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party

        if ((userInput1 == userInput2) && (userInput1 + userInput2) >= 20) {
            System.out.println("The party is excellent!");
        }
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1

        if ((userInput1 != userInput2) && (userInput1 + userInput2) >= 20  && (userInput1 >= 1)) {
            System.out.println("Quite cool party!");
        }
        // It should print: Average party...
        // If there are less people coming than 20

        if ((userInput1 + userInput2) < 20 && (userInput1 >= 1)) {
            System.out.println("Average party...");
        }

    }

}
