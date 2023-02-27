package poo.clases;

import poo.herencias.Car;
import poo.herencias.Motorcycle;
import poo.herencias.Truck;

public class Main {
    public static void main(String[] args) {
        // Class variable = new Class();

        // 1- Class and Object
        // Create a new object using the constructor
        Vehicle toyotaPrius = new Car();
        toyotaPrius.manufacturer = "Toyota";
        System.out.println(toyotaPrius.manufacturer);

        // Create a new object using the constructor with parameters
        Motor motorGTI = new Motor("GTI",190,459,6);
        Vehicle fordFiesta = new Car("Ford", "Fiesta", 2.1, 2010,"Black", false,0, motorGTI, 4);
        System.out.println(fordFiesta.manufacturer);
        System.out.println(fordFiesta.year);
        System.out.println(fordFiesta.speed);
        fordFiesta.accelerate(50);
        System.out.println(fordFiesta.speed);

        // 2- Heritage
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.manufacturer = "Toyota";
        System.out.println(motorcycle.manufacturer);

        // 3- Polymorphism
        Vehicle vehicle;
        vehicle = new Motorcycle();
        vehicle.accelerate(50);

        vehicle = new Car();
        vehicle.accelerate(50);

        vehicle = new Truck();
        vehicle.accelerate(50);

        // 4- class abstract: no can instanced, only instance the class child
    }
}
