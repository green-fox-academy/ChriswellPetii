import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner sc = new Scanner(System.in);
        System.out.println("How many chickens has the farmer ?");
        int userInput1 = sc.nextInt();
        System.out.println("Okay");
        System.out.println("How many pigs has the farmer ?");
        int userInput2 = sc.nextInt();
        int pigslegs = 4, chickslegs = 2;
        System.out.println("Farmer has " + (userInput1 * chickslegs +  userInput2 * pigslegs) + " animal legs in the farm.");

    }
}