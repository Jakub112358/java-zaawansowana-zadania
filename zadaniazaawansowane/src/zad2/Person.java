package zad2;

//Zadanie 2
// Klasa Person
// Zaimplementuj klasę abstrakcyjną Person. Klasa powinna zawierać:
// * dwa pola typu String: name, address
// * konstruktor bezparametrowy ustawiający wartość pól name i address na pusty String
// * konstruktor z dwoma parametrami: String name, String address
// * metody typu getter odpowiedzialne za zwracanie wartości zmiennej: name, address
// * metody typu setter odpowiedzialne za ustawianie wartości pól name, address
// * metoda abstrakcyjna showDetails


// Klasa Student
// Zaimplementuj klasę Student. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
// * trzy pola: typ studiów, rok studiów, koszt studiów
// * konstruktor z trzema parametrami: typ studiów, rok studiów, koszt studiów
// * metody typu getter dla zdeklarowanych pól
// * metody typu setter dla zdeklarowanych pól
// * metoda showDetails wyświetlająca szczegółowe informacje o studencie


// Klasa Lecturer
// Zaimplementuj klasę Lecturer. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
// * dwa pola: specjalizacja oraz wynagrodzenie
// * konstruktor z dwoma parametrami: specjalizacja, wynagrodzenie
// * metody typu getter dla zdeklarowanych pól
// * metody typu setter dla zdeklarowanych pól
// * metodę showDetails wyświetlającą szczegółowe informację o wykładowcy
// Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.
public abstract class Person {
    protected String name;
    protected String address;

    public Person() {
        this.name = "";
        this.address = "";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract void showDetails();
}
