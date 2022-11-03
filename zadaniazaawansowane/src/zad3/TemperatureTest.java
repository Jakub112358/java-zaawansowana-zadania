package zad3;
//Zadanie 3
// Napisz mechanizm konwertujący temperaturę w następujących formatach:

//    * C -> K
//    * K -> C
//    * F -> C
//    * C -> F
//
// Przygotuj odpowiedni interfejs, który będzie reprezentować operację konwersji.
// Zaimplementuj interfejs dla każdej z klas konwertujących i zaprezentuj funkcjonalność polimorfizmu.
public class TemperatureTest {
    public static void main(String[] args) {
        FahrenheitConversion fahrenheitConversion = new FahrenheitConversion();
        KelvinConversion kelvinConversion = new KelvinConversion();


        System.out.println("100 kelvins in Celsius scale = " + kelvinConversion.convertToCelsius(100));
        System.out.println("100 celsius degrees in Kelvins = " + kelvinConversion.convertFromCelsius(100));
        System.out.println("100 fahrenheit degrees in Celsius scale = " + fahrenheitConversion.convertToCelsius(100));
        System.out.println("100 Celsius degrees in Fahrenheit scale = " + fahrenheitConversion.convertFromCelsius(100));

    }
}
