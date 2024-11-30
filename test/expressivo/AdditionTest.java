package expressivo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void testEquals() {
        Expression e1 = new Constant(3.0);
        Expression e2 = new Constant(3.0);
        assertTrue(e1.equals(e2));

        Expression e3 = new Variable("x");
        Expression e4 = new Variable("x");
        assertTrue(e3.equals(e4));

        Expression e5 = new Addition(new Constant(1.0), new Variable("x"));
        Expression e6 = new Addition(new Constant(1.0), new Variable("x"));
        assertTrue(e5.equals(e6));
    }

    @Test
    public void testNotEquals() {
        Expression e1 = new Constant(3.0);
        Expression e2 = new Constant(4.0);
        assertFalse(e1.equals(e2));

        Expression e3 = new Variable("x");
        Expression e4 = new Variable("y");
        assertFalse(e3.equals(e4));

        Expression e5 = new Addition(new Constant(1.0), new Variable("x"));
        Expression e6 = new Addition(new Constant(2.0), new Variable("x"));
        assertFalse(e5.equals(e6));
    }

    @Test
    public void testToString() {
        Expression e1 = new Constant(3.0);
        assertEquals("3.0", e1.toString());

        Expression e2 = new Variable("x");
        assertEquals("x", e2.toString());

        Expression e3 = new Addition(new Constant(1.0), new Variable("x"));
        assertEquals("1.0 + x", e3.toString());

        Expression e4 = new Multiplication(new Constant(2.0), new Variable("y"));
        assertEquals("2.0 * y", e4.toString());
    }

    @Test
    public void testHashCode() {
        Expression e1 = new Constant(3.0);
        Expression e2 = new Constant(3.0);
        assertEquals(e1.hashCode(), e2.hashCode());

        Expression e3 = new Variable("x");
        Expression e4 = new Variable("x");
        assertEquals(e3.hashCode(), e4.hashCode());
    }
}

