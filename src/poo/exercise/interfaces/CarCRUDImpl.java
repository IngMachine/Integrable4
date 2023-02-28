package poo.exercise.interfaces;

import java.util.List;

public class CarCRUDImpl implements CarCRUD{
    @Override
    public void save(Car car) {
        System.out.println("save from CarCRUDImpl");
    }

    @Override
    public List<Car> findAll() {
        System.out.println("findAll from carCRUDImpl");
        return null;
    }

    @Override
    public void delete(Car car) {
        System.out.println("delete from carCRUDImpl");
    }
}
