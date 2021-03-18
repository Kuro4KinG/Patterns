import java.util.ArrayList;
import java.util.List;

public class Bag implements Item {
    private List<Item> items = new ArrayList<>();
    String color;

    public Bag(String color) {
        this.color = color;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.add(item);

    }

    @Override
    public void getName() {
        System.out.println(color + " bag contains:");
        for (Item item :
                items) {
            item.getName();
        }
    }
}
