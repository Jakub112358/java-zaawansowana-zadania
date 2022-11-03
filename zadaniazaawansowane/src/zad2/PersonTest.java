package zad2;
// Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.
public class PersonTest {
    public static void main(String[] args) {
        Person studentAsPerson = new Student("Bob","Jamaica","physics",1,1000);
        Student studentAsStudent = new Student("Math",2,0);
        Person lecturerAsPerson = new Lecturer("java",10_000);
        Lecturer lecturerAsLecturer = new Lecturer("Tom","some adress","poetry",1000);

        lecturerAsPerson.setName("Tom");
        lecturerAsPerson.setAddress("homeless");
       // lecturerAsPerson.setSpecialization("medieval poetry"); doesn't work because reference type Person doesnt have setSpecialization method
        lecturerAsLecturer.setSpecialization("medieval poetry");

        studentAsPerson.showDetails();
        studentAsStudent.showDetails();
        lecturerAsPerson.showDetails();
        lecturerAsLecturer.showDetails();

    }
}
