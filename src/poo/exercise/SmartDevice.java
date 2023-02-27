package poo.exercise;

public abstract class SmartDevice {
    protected String resolution;
    protected String capacityBattery;
    protected int version;
    protected boolean hasGPS;

    protected boolean shutdown;

    public SmartDevice(){

    }

    public SmartDevice(String resolution, String capacityBattery, int version, boolean hasGPS) {
        this.resolution = resolution;
        this.capacityBattery = capacityBattery;
        this.version = version;
        this.hasGPS = hasGPS;
    }

    public void isOff(boolean isOff){
        this.shutdown = isOff;
    }
}
