import java.util.ArrayList;
import java.util.List;

public class Blogger implements Observed {
    private List<Observer> subscribers;
    private String message;
    private final String name;

    public Blogger(String name) {
        this.subscribers = new ArrayList();
        this.name = name;
    }

    @Override
    public void registerSub(Observer sub) {
        this.subscribers.add(sub);
    }

    @Override
    public void removeSub(Observer sub) {
        int i = subscribers.indexOf(sub);
        if (i >= 0) {
            this.subscribers.remove(i);
        }
    }

    @Override
    public void notifySubs() {
        for (Observer sub : subscribers) {
            sub.sendMessage(message);
        }
    }

    public void createNewPost(String message) {
        this.message = message;
        notifySubs();
    }

    public String toString() {
        return this.name;
    }
}
