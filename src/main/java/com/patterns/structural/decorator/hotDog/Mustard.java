public class Mustard extends Decorator {
    HotDog hotDog;

    public Mustard(HotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() + ", Mustard";
    }

    @Override
    public double cost() {
        return hotDog.cost() + 1.5;
    }
}
