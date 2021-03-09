public class HotDogOrder {
    public static void main(String[] args) {
        HotDog hotDog1 = new ChickenHotDog();
        System.out.println(hotDog1.getDescription() + " " + hotDog1.cost());

        hotDog1 = new Bacon(hotDog1);
        System.out.println(hotDog1.getDescription() + " " + hotDog1.cost());

        hotDog1 = new Mustard(hotDog1);
        System.out.println(hotDog1.getDescription() + " " + hotDog1.cost());

        HotDog hotDog2 = new CornDog();
        hotDog2 = new Onion(new Bacon(hotDog2));
        System.out.println(hotDog2.getDescription() + " " + hotDog2.cost());
    }
}
