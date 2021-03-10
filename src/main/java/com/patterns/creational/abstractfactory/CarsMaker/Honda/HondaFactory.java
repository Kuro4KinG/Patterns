package Honda;

import Interfaces.CarFactory;
import Interfaces.Engine;
import Interfaces.Navigator;
import Interfaces.Wheels;

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
