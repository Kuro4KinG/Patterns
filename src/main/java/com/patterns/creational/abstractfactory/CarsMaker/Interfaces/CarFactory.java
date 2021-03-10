package Interfaces;

public interface CarFactory {
    Engine createEngine();

    Wheels createWheels();

    Navigator createNavigator();
}
