package zad2;

// Stwórz klasę MobileDevice, która będzie klasą bazową z polami:
// - rozmiar wyświetlacza
// - pamięć ram
// - cpu
// - system operacyjny
// - typ urządzenia
// Stwórz dodatkowo dwie klasy dziedziczące po klasie MobileDevice:
// - MobilePhone z polami: LTE support
// - Tablet -> pencil support
// Stwórz metodę w klasie bazowej:
// - showDeviceInfo, która wyświetli szczegóły urzadzenia
// - metoda powinna zostać nadpisana w klasach pochodnych (wyświetlenie dodatkowych szczegółów)
public class MobileDevice {
    private double screenSize;
    private int ram;
    private int cpuClockSpeed;
    private String operatingSystem;
    private MobileDeviceTypes deviceType;

    public MobileDevice(double screenSize, int ram, int cpuClockSpeed, String operatingSystem, MobileDeviceTypes deviceType) {
        this.screenSize = screenSize;
        this.ram = ram;
        this.cpuClockSpeed = cpuClockSpeed;
        this.operatingSystem = operatingSystem;
        this.deviceType = deviceType;
    }

    public String showDeviceInfo() {
        return "screenSize=" + screenSize +
                ", ram=" + ram +
                ", cpuClockSpeed=" + cpuClockSpeed +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", deviceType=" + deviceType;
    }
}
