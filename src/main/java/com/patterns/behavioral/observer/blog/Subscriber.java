public class Subscriber implements Observer, DisplayMessage {

    String name;
    Observed blogger;
    String message;

    public Subscriber(String name, Observed blogger) {
        this.name = name;
        this.blogger = blogger;
        blogger.registerSub(this);
    }

    @Override
    public void sendMessage(String message) {
        this.message = message;
        displayMessage();
    }

    @Override
    public void displayMessage() {
        System.out.println("Subscriber " + name + " received a message: \"" + message + "\" from blogger " + blogger);
    }

}
