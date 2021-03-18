public class Socks implements Item {
    String color;

    public Socks(String color) {
        this.color = color;
    }

    @Override
    public void getName() {
        System.out.println(color + " socks");
    }
}
