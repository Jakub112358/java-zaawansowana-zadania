package zad4;

public class Engine extends CarElement{
    private int power;
    private double size;

    public Engine(String type, int power, double size) {
        super(type);
        this.power = power;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", size=" + size +
                ", type='" + getType() + '\'' +
                '}';
    }
}
