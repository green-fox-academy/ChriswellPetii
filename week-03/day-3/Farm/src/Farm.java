import java.util.ArrayList;
import java.util.Collections;

public class Farm {
    static ArrayList<String> listOfAnimals = new ArrayList<>(10);
    static ArrayList<Integer> listOfHungriness = new ArrayList<>(10);


    static void slaughter() {
        int maxIndex = listOfHungriness.indexOf(Collections.max(listOfHungriness));
        listOfAnimals.remove(listOfAnimals.get(maxIndex));
    }
}