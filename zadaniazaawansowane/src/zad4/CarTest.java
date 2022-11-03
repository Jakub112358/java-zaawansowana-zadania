package zad4;
// Stwórz klasę Car, która będzie zawierać pola takie jak:
// - typ
// - silnik
// - koła
// Stwórz klasę Engine, zawierające takie informacje jak typ, pojemność, moc.
// Stwórz klasę Wheels, zawierającą takie informację jak rozmiar, typ.
public class CarTest {
    public static void main(String[] args) {

        Car car = new Car("bus",new Wheels("alloy",17),new Engine("diesel",120, 1.9));
        System.out.println(car);

        CarElement[] carElements = {new Wheels("steel",15),new Engine("diesel",150, 2.0) };

        for (CarElement carElement : carElements) {
            System.out.println("type of element: " + carElement.getType());
        }

    }
}
