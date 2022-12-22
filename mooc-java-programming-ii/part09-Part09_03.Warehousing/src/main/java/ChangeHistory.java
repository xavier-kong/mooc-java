import java.util.*;
public class ChangeHistory {

    private ArrayList<Double> changes;

    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }

    public ChangeHistory(double initialValues) {
        this.changes = new ArrayList<>();
        this.changes.add(initialValues);
    }

    public void add(double status) {
        this.changes.add(status);
    }

    public void clear() {
        this.changes.clear();
    }

    public String toString() {
        return this.changes.toString();
    }

    public double maxValue() {
        return Collections.max(this.changes);
    }

    public double minValue() {
        return Collections.min(this.changes);
    }

    public double average() {
        return this.changes.stream().mapToDouble(d -> d).average().orElse(0.0);
    }

}
