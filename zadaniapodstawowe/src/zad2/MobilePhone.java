package zad2;

public class MobilePhone extends MobileDevice {
    private boolean lteSupport;

    public MobilePhone(double screenSize, int ram, int cpuClockSpeed, String operatingSystem, MobileDeviceTypes deviceType, boolean lteSupport) {
        super(screenSize, ram, cpuClockSpeed, operatingSystem, deviceType);
        this.lteSupport = lteSupport;
    }

    @Override
    public String showDeviceInfo() {
        return super.showDeviceInfo() + ", lteSupport=" + lteSupport;
    }

}
