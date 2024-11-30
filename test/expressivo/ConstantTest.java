package expressivo;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConstantTest {

    @Test
    public void testConstantEquality() {
        Expression c1 = new Constant(5.0);
        Expression c2 = new Constant(5.0);
        assertTrue(c1.equals(c2));

        Expression c3 = new Constant(10.0);
        assertFalse(c1.equals(c3));
    }

    @Test
    public void testConstantToString() {
        Expression c = new Constant(3.5);
        assertEquals("3.5", c.toString());
    }

    @Test
    public void testCheckRep() {
        try {
            new Constant(Double.NaN);
            fail("Exception should have been thrown for NaN");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid constant value"));
        }

        try {
            new Constant(Double.POSITIVE_INFINITY);
            fail("Exception should have been thrown for infinite value");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid constant value"));
        }
    }
}
