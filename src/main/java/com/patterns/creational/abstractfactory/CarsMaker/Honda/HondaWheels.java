package Honda;

import Interfaces.Wheels;

public class HondaWheels implements Wheels {
    @Override
    public void spin() {
        System.out.println("Honda wheels are spinning...");
    }
}
