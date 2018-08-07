import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
        ArrayList<String> boysGirls = new ArrayList<>();
        makingMatches(girls, boys, boysGirls);

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(boysGirls);
    }

    public static void makingMatches(ArrayList<String> girls, ArrayList<String> boys, ArrayList<String> boysGirls) {

        for (int i = 0; i < (girls.size() + boys.size() % 2); i++) {
            boysGirls.add(girls.get(i));
            boysGirls.add(boys.get(i));
        }

    }

    //return makingMatches(girls, boys, boysGirls);
}
