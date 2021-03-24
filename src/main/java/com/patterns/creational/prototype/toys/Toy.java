public class Toy implements Copyable {
    private String name;
    private String color;

    public Toy(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        return new Toy(name, color);
    }
}
