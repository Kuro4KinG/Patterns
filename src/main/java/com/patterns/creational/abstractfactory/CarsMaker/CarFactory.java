package CarsMaker;

public interface CarFactory {
    Engine createEngine();

    Wheels createWheels();

    Navigator createNavigator();
}
