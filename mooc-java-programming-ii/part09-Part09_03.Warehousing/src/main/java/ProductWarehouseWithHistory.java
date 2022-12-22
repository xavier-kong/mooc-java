
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changes;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);

        this.changes = new ChangeHistory(super.getBalance());
    }

    public String history() {
        return this.changes.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changes.add(this.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double amt = super.takeFromWarehouse(amount);
        this.changes.add(this.getBalance());
        return amt;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.changes);
        System.out.println("Largest amount of product: " + this.changes.maxValue());
        System.out.println("Smallest amount of product: " + this.changes.minValue());
        System.out.println("Average: " + this.changes.average());
    }

}
