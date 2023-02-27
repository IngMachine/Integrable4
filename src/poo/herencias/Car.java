package poo.herencias;

import poo.clases.Motor;
import poo.clases.Vehicle;

public class Car extends Vehicle {
    int numberDoors;

    public Car() {
    }

    public Car(String manufacturer, String model, double cc, int year, String color, boolean sport, int speed, Motor motor, int numberDoors) {
        super(manufacturer, model, cc, year, color, sport, speed, motor);
        this.numberDoors = numberDoors;
    }
}
