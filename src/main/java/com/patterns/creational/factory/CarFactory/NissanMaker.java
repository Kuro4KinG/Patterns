public class NissanMaker implements CarMaker {
    @Override
    public Car createCar() {
        return new Nissan();
    }
}
