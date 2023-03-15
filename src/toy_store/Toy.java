package toy_store;

public abstract class Toy implements Cloneable{
    private static int nextId = 1;
    private int id;
    private String name;
    private int quantity;
    private double fallFrequency;

    public Toy(String name, int quantity, double fallFrequency) {
        this.id = nextId++;
        this.name = name;
        this.quantity = quantity;
        this.fallFrequency = fallFrequency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getFallFrequency() {
        return fallFrequency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFallFrequency(double fallFrequency) {
        this.fallFrequency = fallFrequency;
    }

    @Override
    public Toy clone() {
        try {
            return (Toy) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen
            throw new InternalError(e);
        }
    }
}
