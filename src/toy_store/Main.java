package toy_store;

public class Main {
    public static void main(String[] args) {
        ToyDinosaur myToyDino = new ToyDinosaur("T-Rex", 20, 20.0, "Tyrannosaurus Rex", true);
        ToyCar myToyCar = new ToyCar("Sports Car", 10, 25.0, "Hot Wheels", "Ferrari");
        Barbie myBarbie = new Barbie("Classic Barbie", 5, 15.0, "blonde");

        Store my_store = new Store();
        my_store.addToy(myToyCar);
        my_store.addToy(myToyDino);
        my_store.addToy(myBarbie);

        System.out.println(my_store.getToys());
        my_store.addPrizeToy(0, 5);
        my_store.addPrizeToy(1, 5);
        my_store.addPrizeToy(2, 5);

        System.out.println(my_store.getToys());

        my_store.getPrizeToy();
        System.out.println(my_store.getPrizeToys());

    }
}
