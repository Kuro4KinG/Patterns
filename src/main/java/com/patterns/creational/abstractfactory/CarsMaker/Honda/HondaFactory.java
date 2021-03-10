package CarsMaker.Honda;

import CarsMaker.CarFactory;
import CarsMaker.Engine;
import CarsMaker.Navigator;
import CarsMaker.Wheels;

public class HondaFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new HondaEngine();
    }

    @Override
    public Wheels createWheels() {
        return new HondaWheels();
    }

    @Override
    public Navigator createNavigator() {
        return new HondaNavigator();
    }
}
