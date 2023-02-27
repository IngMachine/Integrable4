package poo.exercise;

public class SmartPhone extends SmartDevice {
    double storage;
    public SmartPhone(double storage) {
        this.storage = storage;
    }
    public SmartPhone(String resolution, String capacityBattery, int version, boolean hasGPS, double storage) {
        super(resolution, capacityBattery, version, hasGPS);
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "storage=" + storage +
                ", resolution='" + resolution + '\'' +
                ", capacityBattery='" + capacityBattery + '\'' +
                ", version=" + version +
                ", hasGPS=" + hasGPS +
                ", shutdown=" + shutdown +
                '}';
    }
}
