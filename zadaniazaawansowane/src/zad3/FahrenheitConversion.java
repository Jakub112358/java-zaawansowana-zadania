package zad3;

public class FahrenheitConversion implements ICelsiusConversion{

    @Override
    public double convertToCelsius(double temp) {
        return (5.0/9.0)*(temp-32);
    }

    @Override
    public double convertFromCelsius(double temp) {
        return 32 + 9.0/5.0*temp;
    }
}
