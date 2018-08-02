import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, You!");
        System.out.println("Please give me your name!");
        String userInput1 = sc.nextLine();
        System.out.println("Hello bello, " + userInput1 + "!");

    }
}