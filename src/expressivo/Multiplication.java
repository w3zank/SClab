package expressivo;
import java.util.Objects;

public class Multiplication implements Expression {
    private final Expression left;
    private final Expression right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
        checkRep();
    }

    @Override
    public String toString() {
        return left.toString() + " * " + right.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Multiplication multiplication = (Multiplication) other;
        return left.equals(multiplication.left) && right.equals(multiplication.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    @Override
    public void checkRep() {
        if (left == null || right == null) {
            throw new IllegalArgumentException("Left or right expression cannot be null");
        }
    }
}
