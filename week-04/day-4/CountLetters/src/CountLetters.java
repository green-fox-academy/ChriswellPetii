import java.util.HashMap;
import java.util.Map;

class CountLetters {
    private String s1;
    private Map<String, Integer> letters = new HashMap<>();
    private String[] keys;

    CountLetters(String s1) {
        this.s1 = s1;
    }

    String[] keyMaker() {
        keys = s1.split("");
        return keys;
    }

    void setMap() {
        for (int i = 0; i < keys.length; i++) {
            letters.put(keys[i], occurrencesCounter(i));

        }
    }

    private int occurrencesCounter(int i) {
        int occurrences = 0;
        for (String key : keys) {
            if (keys[i].equals(key)) {
                occurrences++;
            }
        }
        return occurrences;
    }

    Map<String, Integer> getLetters() {
        return letters;
    }

    String[] getKeys() {
        return keys;
    }
}
