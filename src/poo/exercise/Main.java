package poo.exercise;

public class Main {
    public static void main(String[] args) {
        // class and object

        SmartPhone smartPhone = new SmartPhone("150x150","2 hours",1, false, 150.0);
        smartPhone.isOff(false);
        SmartWatch smartWatch = new SmartWatch();

        System.out.println(smartPhone);

        smartWatch.resolution = "100 x 100";
        smartWatch.capacityBattery = "1 hour";
        smartWatch.version = 2;
        smartWatch.hasGPS = true;
        smartWatch.hasCamera = true;
        smartWatch.isOff(true);

        System.out.println(smartWatch);
    }
}
