package Honda;

import Interfaces.Navigator;

public class HondaNavigator implements Navigator {
    @Override
    public void navigate() {
        System.out.println("Honda navigator is making a route...");
    }
}
