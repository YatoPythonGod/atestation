package toy_store;

public class ToyCar extends Toy implements Soundable{
    private String brand;
    private String model;

    public ToyCar(String name, int quantity, double fallFrequency, String brand, String model) {
        super(name, quantity, fallFrequency);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ToyCar{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", quantity=" + getQuantity() +
                ", fallFrequency=" + getFallFrequency() +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Vroom vroom!");
    }
}
