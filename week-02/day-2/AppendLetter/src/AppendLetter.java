import java.util.*;

public class AppendLetter {
    public static void main(String... args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        //ArrayList<String> far = ArrayList<>("bo", "anacond", "koal", "pand", "zebr");
        appendA(far);
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(far);
    }

    /*public static void appendA(List<String> far) {

        for (int i = 0; i < far.size(); i++) {
            far.add(far.get(i) + "a");
        }
        //return appendA(far);
    }*/
    /*public static void appendA(List<String> far) {
        String[] farArray;
        String farString = "";
        for (String s : far) {
            farString += s + "a ";
        }
        farArray = farString.split(" ");
        far.addAll(Arrays.asList(farArray));

    }*/
    public static void appendA(List<String> far) {
        for (int i = 0; i < far.size(); i++) {
            far.set(i,(far.get(i) + "a" ));
        }
    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"