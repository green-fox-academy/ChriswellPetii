import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class myClassTest {
    private myClass myClass;

    @Before
    public void tester() {
        myClass = new myClass();
    }

    @Test
    public void sum() {
        myClass.listFiller();
        assertEquals(10, myClass.sum());
    }

    @Test
    public void sumEmpty() {
        assertEquals(0, myClass.sum());
    }

    @Test
    public void sumOneElement() {
        myClass.integerList.add(4);
        assertEquals(4, myClass.sum());
    }

    @Test
    public void sumMultipleElement() {
        myClass.integerList.add(4);
        myClass.integerList.add(3);
        myClass.integerList.add(9);
        myClass.integerList.add(10);
        assertEquals(26, myClass.sum());
    }

}