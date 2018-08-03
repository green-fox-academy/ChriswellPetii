import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your number!");
        int userInput1 = sc.nextInt();

        for (int i = 1; i <= userInput1; i = i + 2) {
            int spc = (userInput1 - i) / 2;
            for (int j = 0; j < userInput1; j++) {
                if (j < spc || j >= (userInput1 - spc)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
