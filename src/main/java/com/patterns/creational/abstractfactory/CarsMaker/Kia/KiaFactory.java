package Kia;

import Interfaces.CarFactory;
import Interfaces.Engine;
import Interfaces.Navigator;
import Interfaces.Wheels;

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
