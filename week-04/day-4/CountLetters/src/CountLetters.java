import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    private String s1;
    private Map<String, Integer> letters = new HashMap<>();
    private String[] keys;

    public CountLetters(String s1) {
        this.s1 = s1;
    }

    public String[] keyMaker() {
        keys = s1.split("");
        return keys;
    }

    public void setMap() {
        for (int i = 0; i < keys.length; i++) {
            letters.put(keys[i], occurrencesCounter(i));

        }
    }

    public int occurrencesCounter(int i) {
        int occurrences = 0;
        for (String key : keys) {
            if (keys[i].equals(key)) {
                occurrences++;
            }
        }
        return occurrences;
    }

    public Map<String, Integer> getLetters() {
        return letters;
    }

    public String[] getKeys() {
        return keys;
    }
}
