public class HondaMaker implements CarMaker {
    @Override
    public Car createCar() {
        return new Honda();
    }
}
