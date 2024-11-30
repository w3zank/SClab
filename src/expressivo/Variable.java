package expressivo;
import java.util.Objects;

public class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
        checkRep();
    }

    @Override
    public String toString() {
        return name;  // Returns the name of the variable
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Variable variable = (Variable) other;
        return name.equals(variable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public void checkRep() {
        // Variable name must be a non-empty sequence of letters
        if (name == null || name.isEmpty() || !name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Invalid variable name");
        }
    }
}