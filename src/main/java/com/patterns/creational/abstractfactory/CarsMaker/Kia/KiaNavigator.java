package Kia;

import Interfaces.Navigator;

public class KiaNavigator implements Navigator {
    @Override
    public void navigate() {
        System.out.println("Kia navigator is making a route...");
    }
}
