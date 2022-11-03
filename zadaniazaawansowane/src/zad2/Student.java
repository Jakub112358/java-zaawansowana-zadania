package zad2;
// Klasa Student
// Zaimplementuj klasę Student. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
// * trzy pola: typ studiów, rok studiów, koszt studiów
// * konstruktor z trzema parametrami: typ studiów, rok studiów, koszt studiów
// * metody typu getter dla zdeklarowanych pól
// * metody typu setter dla zdeklarowanych pól
// * metoda showDetails wyświetlająca szczegółowe informacje o studencie
public class Student extends Person {
    private String fieldOfStudy;
    private int yearOfStudy;
    private int costOfStudy;

    public Student(String fieldOfStudy, int yearOfStudy, int costOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.costOfStudy = costOfStudy;
    }

    public Student(String name, String address, String fieldOfStudy, int yearOfStudy, int costOfStudy) {
        super(name, address);
        this.fieldOfStudy = fieldOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.costOfStudy = costOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getCostOfStudy() {
        return costOfStudy;
    }

    public void setCostOfStudy(int costOfStudy) {
        this.costOfStudy = costOfStudy;
    }


    @Override
    public void showDetails() {
        System.out.println("Student{" +
                "fieldOfStudy='" + fieldOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", costOfStudy=" + costOfStudy +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}');
    }
}
