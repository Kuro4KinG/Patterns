public class Hat implements Item {
    String color;

    public Hat(String color) {
        this.color = color;
    }

    @Override
    public void getName() {
        System.out.println(color + " hat");
    }
}
