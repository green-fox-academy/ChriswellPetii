import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        int count = 0;
        diceSet.roll();
        System.out.println("First roll: " + Arrays.toString(diceSet.getCurrent()));

        for (int i = 0; i < 6; i++) {
            while (diceSet.getCurrent(i) != 6) {
                diceSet.reroll(i);
                count++;
            }
        }
        System.out.println("I had to roll " + count + " times to get: \n" + Arrays.toString(diceSet.getCurrent()));
    }
}