public class Bacon extends Decorator {

    HotDog hotDog;

    public Bacon(HotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() + ", Bacon";
    }

    @Override
    public double cost() {
        return hotDog.cost() + 3.5;
    }
}
