public class KiaMaker implements CarMaker {
    @Override
    public Car createCar() {
        return new Kia();
    }
}
