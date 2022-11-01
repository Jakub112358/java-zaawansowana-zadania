package zad1;

//Napisz klasę Circle, która będzie zawierać infomrację taką jak:
// - promień Ukryj dostęp do pola klasy. Upublicznij mechanizm obliczania:
// - pola koła
// - obwodu okręgu
public class Circle {
    private final double radius;

    public Circle(Number radius) {
        if (RadiusValidator.isValid(radius)) {
            this.radius = radius.doubleValue();
        } else {
            System.out.println("incorrect radius");
            this.radius = 0.0;
        }
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
