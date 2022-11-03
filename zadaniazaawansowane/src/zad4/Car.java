package zad4;

public class Car extends CarElement{
    private Wheels wheels;
    private Engine engine;

    public Car(String type, Wheels wheels, Engine engine) {
        super(type);
        this.wheels = wheels;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                wheels.toString() +
                engine.toString() +
                ", type='" + getType() + '\'' +
                '}';
    }
}
