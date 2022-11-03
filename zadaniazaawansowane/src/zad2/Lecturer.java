package zad2;
// Klasa Lecturer
// Zaimplementuj klasę Lecturer. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
// * dwa pola: specjalizacja oraz wynagrodzenie
// * konstruktor z dwoma parametrami: specjalizacja, wynagrodzenie
// * metody typu getter dla zdeklarowanych pól
// * metody typu setter dla zdeklarowanych pól
// * metodę showDetails wyświetlającą szczegółowe informację o wykładowcy

public class Lecturer extends Person {
    private String specialization;
    private int salary;

    public Lecturer(String specialization, int salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public Lecturer(String name, String address, String specialization, int salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public void showDetails() {
        System.out.println("Lecturer{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}');
    }
}
