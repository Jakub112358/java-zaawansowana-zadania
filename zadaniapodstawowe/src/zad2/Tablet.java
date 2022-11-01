package zad2;

public class Tablet extends MobileDevice {
    private boolean pencilSupport;

    public Tablet(double screenSize, int ram, int cpuClockSpeed, String operatingSystem, MobileDeviceTypes deviceType, boolean pencilSupport) {
        super(screenSize, ram, cpuClockSpeed, operatingSystem, deviceType);
        this.pencilSupport = pencilSupport;
    }

    @Override
    public String showDeviceInfo() {
        return super.showDeviceInfo() + ", pencilSupport=" + pencilSupport;
    }


}
