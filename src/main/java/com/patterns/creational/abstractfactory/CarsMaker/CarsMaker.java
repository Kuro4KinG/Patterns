import Honda.HondaFactory;
import Interfaces.CarFactory;
import Interfaces.Engine;
import Interfaces.Navigator;
import Interfaces.Wheels;

public class CarsMaker {
    public static void main(String[] args) {
        CarFactory carFactory = new HondaFactory();
        // carFactory = new KiaFactory();
        Engine engine = carFactory.createEngine();
        Wheels wheels = carFactory.createWheels();
        Navigator navigator = carFactory.createNavigator();

        engine.run();
        wheels.spin();
        navigator.navigate();
    }
}
