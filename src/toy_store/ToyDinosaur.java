package toy_store;

public class ToyDinosaur extends Toy implements Soundable {
    private String species;
    private boolean roar;

    public ToyDinosaur(String name, int quantity, double fallFrequency, String species, boolean roar) {
        super(name, quantity, fallFrequency);
        this.species = species;
        this.roar = roar;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean canRoar() {
        return roar;
    }

    public void setRoar(boolean roar) {
        this.roar = roar;
    }

    @Override
    public String toString() {
        return "ToyDinosaur{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", quantity=" + getQuantity() +
                ", fallFrequency=" + getFallFrequency() +
                ", species='" + species + '\'' +
                ", roar=" + roar +
                '}';
    }

    @Override
    public void makeSound() {
        if (canRoar()) {
            System.out.println("ROAR!!!");
        } else {
            System.out.println("raw!");
        }
    }
}