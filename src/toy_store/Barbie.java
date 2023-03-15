package toy_store;

public class Barbie extends Toy {
    private String hairColor;

    public Barbie(String name, int quantity, double fallFrequency, String hairColor) {
        super(name, quantity, fallFrequency);
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Barbie{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", quantity=" + getQuantity() +
                ", fallFrequency=" + getFallFrequency() +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
