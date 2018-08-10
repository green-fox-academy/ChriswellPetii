import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        String[] fromLit = new String[list.size()];
        String outList = "";
        String outList2 = "";
        ArrayList<String> newList = new ArrayList<String>(Arrays.asList(fromLit));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        //System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
        outList = outListCreator(list, fromLit, outList);
        swapper(list, newList);
        outList2 = outListCreator(list, fromLit, outList);
        System.out.println(outList);
    }

    private static void swapper(ArrayList<String> list, ArrayList<String> newList) {
        newList.add(0, list.get(2));
        newList.add(1, list.get(5));
        list.set(5, newList.get(0));
        list.set(2, newList.get(1));
    }

    private static String outListCreator(ArrayList<String> list, String[] fromLit, String outList) {
        for (int i = 0; i < list.size(); i++) {
            fromLit[i] = list.get(i);
            outList += fromLit[i] + " ";
        }
        fromLit = outList.split(" ");
        return outList;
    }

   /* public static ArrayList<String> quoteSwap(ArrayList<String> list) {
        Collections.swap(list, list.indexOf("do"), list.indexOf("cannot"));
        return list;
    }*/
}