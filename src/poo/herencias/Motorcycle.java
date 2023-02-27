package poo.herencias;

import poo.clases.Motor;
import poo.clases.Vehicle;

/**
 * Class derived or class child or subclass
 */
public class Motorcycle extends Vehicle {
    boolean trunk;

    public Motorcycle(){
        super();
    }

    public Motorcycle(String manufacturer, String model, double cc, int year, String color, boolean sport, int speed, Motor motor, boolean trunk) {
        super(manufacturer, model, cc, year, color, sport, speed, motor);
        this.trunk = trunk;
    }
}
