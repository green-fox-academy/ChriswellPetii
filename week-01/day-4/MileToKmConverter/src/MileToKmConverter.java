import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        double miles = 0.621371192;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the distance in kilometers and i give u back in miles :) ");
        int userInput1 = sc.nextInt();
        System.out.println(userInput1 * miles + " miles");
    }
}