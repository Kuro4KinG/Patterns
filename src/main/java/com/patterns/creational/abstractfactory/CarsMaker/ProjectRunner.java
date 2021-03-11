package CarsMaker;

import CarsMaker.Kia.KiaFactory;

public class ProjectRunner {
    public static void main(String[] args) {
        CarFactory carFactory = new KiaFactory();

        Engine engine = carFactory.createEngine();
        Wheels wheels = carFactory.createWheels();
        Navigator navigator = carFactory.createNavigator();

        engine.run();
        wheels.spin();
        navigator.navigate();
    }
}
