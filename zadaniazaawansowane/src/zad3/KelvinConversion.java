package zad3;

public class KelvinConversion implements ICelsiusConversion {

    @Override
    public double convertToCelsius(double temp) {
        return temp - 273.15;
    }

    @Override
    public double convertFromCelsius(double temp) {
        return temp + 273.15;
    }
}
