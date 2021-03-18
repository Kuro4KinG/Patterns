public class Shirt implements Item{
    String color;

    public Shirt(String color) {
        this.color = color;
    }

    @Override
    public void getName() {
        System.out.println(color + " shirt");
    }
}
