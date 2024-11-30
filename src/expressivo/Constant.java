package expressivo;

import java.util.Objects;

public class Constant implements Expression {
    private final double value;

    public Constant(double value) {
        this.value = value;
        checkRep();
    }

    @Override
    public String toString() {
        return String.valueOf(value);  // Returns the number as string
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Constant constant = (Constant) other;
        return Double.compare(constant.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public void checkRep() {
        // For a Constant, the rep invariant might simply be that the value is a finite number.
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Invalid constant value");
        }
    }
}