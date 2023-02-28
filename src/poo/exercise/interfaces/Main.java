package poo.exercise.interfaces;

public class Main {
    static CarCRUD carCRUD = new CarCRUDImpl();

    public static void main(String[] args) {
        carCRUD.save(new Car());
        carCRUD.findAll();
        carCRUD.delete(new Car());
    }
}
