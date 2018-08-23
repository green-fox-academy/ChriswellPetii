import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
    private Apples apple;

    @Before
    public void createApple() {
        apple = new Apples();
    }

    @Test
    public void getApple() {
        assertEquals("apple", apple.getApple());
    }
}