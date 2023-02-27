package poo.exercise;

public class SmartWatch extends SmartDevice{
    boolean hasCamera;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String resolution, String capacityBattery, int version, boolean hasGPS, boolean hasCamera) {
        super(resolution, capacityBattery, version, hasGPS);
        this.hasCamera = hasCamera;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "hasCamera=" + hasCamera +
                ", resolution='" + resolution + '\'' +
                ", capacityBattery='" + capacityBattery + '\'' +
                ", version=" + version +
                ", hasGPS=" + hasGPS +
                ", shutdown=" + shutdown +
                '}';
    }
}
