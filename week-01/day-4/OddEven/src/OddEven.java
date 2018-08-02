import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your number and i can tell you it is odd or even.");
        int userInput1 = sc.nextInt();
        if (userInput1 % 2 == 0 ){
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }
}
