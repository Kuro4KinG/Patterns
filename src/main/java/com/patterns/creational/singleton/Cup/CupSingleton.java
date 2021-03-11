public class CupSingleton {
    private boolean empty;
    private static CupSingleton instance;

    private CupSingleton() {
        empty = true;
    }

    public static CupSingleton getInstance() {
        if (instance == null)
            instance = new CupSingleton();
        return instance;
    }

    public void fill() {
        if (empty == true) {
            empty = false;
            System.out.println("Cup is full. Drink!");
        } else System.out.println("Stop! Cup is full!!!");

    }

    public void drink() {
        if (empty == false) {
            empty = true;
            System.out.println("Cup is empty. Fill it!");
        } else System.out.println("There is nothing to drink!!!");

    }

    public boolean isEmpty() {
        return empty;
    }
}
