import java.util.Arrays;
import java.util.ArrayList;

public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        System.out.println("Quote: " + quote);


        String[] quoteArray;
        String newQuote = "";
        quoteArray = quote.split(" ");


        ArrayList<String> quoteArrayList = new ArrayList<String>(Arrays.asList(quoteArray));
        quoteArrayList.add(3,"always takes longer than");
        for (String s : quoteArrayList){
            newQuote += s + " ";
        }

        /*System.out.println("ArrayList: " + quoteArrayList);
        System.out.println("Quote ArrayList: " + Arrays.toString(quoteArray));
        System.out.println("Quote length: " + quoteArray.length);*/


        System.out.println("New Quote: " + newQuote);

    }
}