public class Tie implements Item{
    String color;

    public Tie(String color) {
        this.color = color;
    }

    @Override
    public void getName() {
        System.out.println(color + " tie");
    }
}
