package CarsMaker.Kia;

import CarsMaker.CarFactory;
import CarsMaker.Engine;
import CarsMaker.Navigator;
import CarsMaker.Wheels;

public class KiaFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new KiaEngine();
    }

    @Override
    public Wheels createWheels() {
        return new KiaWheels();
    }

    @Override
    public Navigator createNavigator() {
        return new KiaNavigator();
    }
}
