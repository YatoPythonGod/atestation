package toy_store;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store {
    private List<Toy> toys;
    private List<Toy> prizeToys;

    public Store() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void changeWeight(int index, double newWeight) {
        toys.get(index).setFallFrequency(newWeight);
    }

    public List<Toy> getToys(){
        return toys;
    }

    public List<Toy> getPrizeToys(){
        return prizeToys;
    }


    public void addPrizeToy(int index, int quantity) {
        if ( index < 0 || index >= toys.size()) {
            System.out.println("Invalid index");
            return;
        }

        int remains = toys.get(index).getQuantity() - quantity;
        if (remains < 0) {
            System.out.printf("Invalid quantity, have only %s pieces!", toys.get(index).getQuantity());
            return;
        }
        if (remains == 0) {
            Toy prizeToy = toys.get(index).clone();
            toys.remove(index);
            prizeToys.add(prizeToy);
        }
        else {
            toys.get(index).setQuantity(remains);
            Toy prizeToy = toys.get(index).clone();
            prizeToy.setQuantity(quantity);
            prizeToys.add(prizeToy);
        }
    }

    public Toy selectPrizeToy() {
        int totalQuantity = prizeToys.stream().mapToInt(Toy::getQuantity).sum();
        if (totalQuantity == 0) {
            return null;
        }
        if (prizeToys.size() == 1) {
            prizeToys.get(0).setQuantity(prizeToys.get(0).getQuantity() - 1);
            Toy toy = prizeToys.get(0).clone();
            toy.setQuantity(1);
            return  toy;
        }
        double max = 0.0;
        int winner = 0;
        for (int i = 0; i < prizeToys.size(); i++) {
            double roll = new Random().nextInt(0, 101);
            roll *= (prizeToys.get(i).getFallFrequency() / 100);
            if (roll > max) {
                max = roll;
                winner = i;
            }
        }
        prizeToys.get(winner).setQuantity(prizeToys.get(winner).getQuantity() - 1);
        Toy toy = prizeToys.get(winner).clone();
        toy.setQuantity(1);
        return  toy;
    }

    public void getPrizeToy() {
        Toy prizeToy = selectPrizeToy();
        if (prizeToy != null) {
            try {
                FileWriter writer = new FileWriter(System.getProperty("user.dir") + "\\src\\toy_store\\prize_toys.txt", true);
                writer.write(prizeToy.toString() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }
    }
}
