package Honda;

import Interfaces.Engine;

public class HondaEngine implements Engine {
    @Override
    public void run() {
        System.out.println("Honda engine is running...");
    }
}
