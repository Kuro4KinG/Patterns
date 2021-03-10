package Kia;

import Interfaces.Wheels;

public class KiaWheels implements Wheels {
    @Override
    public void spin() {
        System.out.println("Kia wheels are spinning...");
    }
}
