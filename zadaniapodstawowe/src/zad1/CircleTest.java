package zad1;

public class CircleTest {
    public static void main(String[] args) {
        int radiusInt = 1;
        double radiusDouble = -10;
        long radiusLong = 100L;
        Circle circleInt = new Circle(radiusInt);
        Circle circleDouble = new Circle(radiusDouble);
        Circle circleLong = new Circle(radiusLong);

        //System.out.println(circleInt.radius); //doesn't work because radius is private

        System.out.println("area for r = (int) 1: " + circleInt.getArea());
        System.out.println("circumference for r = (double) -10: " +circleDouble.getCircumference());
        System.out.println("circumference for r = (long) 100: " +circleLong.getCircumference());

    }
}
