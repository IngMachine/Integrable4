package poo.exercise.interfaces;

import java.util.List;

public interface CarCRUD {
    void save(Car car);
    List<Car> findAll();
    void delete(Car car);
}
