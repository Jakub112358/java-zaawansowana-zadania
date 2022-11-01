package zad2;

public class MobileDeviceTest {
    public static void main(String[] args) {


        Tablet tablet = new Tablet(9, 1024, 1000, "android", MobileDeviceTypes.TABLET, true);
        MobilePhone mobilePhone = new MobilePhone(7, 2048, 1400, "android", MobileDeviceTypes.MOBILEPHONE, false);
        MobileDevice smartWatch = new MobileDevice(1, 1024, 800, "tizen os", MobileDeviceTypes.SMARTWATCH);

        MobileDevice[] mobileDevices = new MobileDevice[]{tablet,mobilePhone,smartWatch};

        for (MobileDevice mobileDevice : mobileDevices) {
            System.out.println(mobileDevice.showDeviceInfo());
        }


    }
}
