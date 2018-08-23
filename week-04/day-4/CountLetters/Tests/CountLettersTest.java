import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CountLettersTest {
    CountLetters countLetters;
    Map<String, Integer> letters;
    Map<String, Integer> exLetters;

    @Before
    public void tester() {
        countLetters = new CountLetters("labda");
        letters = countLetters.getLetters();
        countLetters.getKeys();
        countLetters.keyMaker();
        countLetters.setMap();

        exLetters = new HashMap<>();
        exLetters.put("l", 1);
        exLetters.put("a", 1);
        exLetters.put("b", 1);
        exLetters.put("d", 1);
        exLetters.put("a", 2);
    }
    
    @Test
    public void valami() {
        assertThat(exLetters, is(letters));
    }
}