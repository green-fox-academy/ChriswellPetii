import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    private Anagram anagram;

    @Before
    public void anagramCreator() {
        anagram = new Anagram();
    }

    @Test
    public void areAnagram() {
        anagram.s1 = "apple";
        anagram.s2 = "pleap";
        assertTrue(anagram.areAnagram(anagram.s1.toCharArray(), anagram.s2.toCharArray()));
    }
}