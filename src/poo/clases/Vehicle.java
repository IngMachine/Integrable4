package poo.clases;

/**
 * Class base or superclass or class father
 */
public abstract class Vehicle {
    // 1. attributes
    protected String manufacturer;
    protected String model;
    protected double cc;
    protected int year;
    protected String color;
    protected boolean sport;
    protected int speed;
    protected Motor motor;

    // 2. constructors
    public Vehicle() {
    }

    public Vehicle(String manufacturer, String model, double cc, int year, String color, boolean sport, int speed, Motor motor) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cc = cc;
        this.year = year;
        this.color = color;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehicle(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    // 3. methods (behavior)
    public void accelerate(int quantity){
        this.speed += quantity;
    }
}
