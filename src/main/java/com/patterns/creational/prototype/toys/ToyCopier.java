public class ToyCopier {
    public static void main(String[] args) {
        Toy toy = new Toy("Car", "Red");
        System.out.println(toy);

        ToyFactory toyFactory = new ToyFactory(toy);
        Toy newToy = toyFactory.copyToy();
        System.out.println(newToy);

        toyFactory.setToy(new Toy("Bee", "Yellow"));
        System.out.println(toyFactory.toy);
        Toy toy2=toyFactory.copyToy();
        System.out.println(toy2);
    }
}