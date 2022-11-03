package zad4;

public class Wheels extends CarElement{
    private int size;

    public Wheels(String type, int size) {
        super(type);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "size=" + size +
                ", type='" + getType() + '\'' +
                '}';
    }
}
