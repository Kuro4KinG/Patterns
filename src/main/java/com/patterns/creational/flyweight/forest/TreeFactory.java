import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private final Map<String, Tree> forest = new HashMap<>();

    public Tree getTreeBYColor(String color) {
        Tree tree = forest.get(color);
        if (tree == null) {
            switch (color) {
                case "жёлтый" -> {
                    System.out.println("Создаём жёлтое дерево");
                    tree = new YellowTree();
                }
                case "зелёный" -> {
                    System.out.println("Создаём зелёное дерево");
                    tree = new GreenTree();
                }
                case "красный" -> {
                    System.out.println("Создаём красное дерево");
                    tree = new RedTree();
                }
            }
            forest.put(color, tree);
        }
        return tree;
    }
}
