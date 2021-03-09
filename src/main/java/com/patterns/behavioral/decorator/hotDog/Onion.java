public class Onion extends Decorator {
    HotDog hotDog;

    public Onion(HotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() + ", Onion";
    }

    @Override
    public double cost() {
        return hotDog.cost() + 0.5;
    }
}
