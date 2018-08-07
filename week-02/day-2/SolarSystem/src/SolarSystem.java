import java.util.*;

public class SolarSystem{
    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
        putSaturn(planetList);
        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        System.out.println(planetList);
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
    }
    public static void putSaturn(ArrayList<String> planetList){
        planetList.add("Saturn");
        //return putSaturn(planetList);

    }
}