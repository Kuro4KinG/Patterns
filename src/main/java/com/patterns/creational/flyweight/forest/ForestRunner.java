import java.util.ArrayList;
import java.util.List;

public class ForestRunner {
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();

        List<Tree> forest = new ArrayList<>();

        forest.add(treeFactory.getTreeBYColor("жёлтый"));
        forest.add(treeFactory.getTreeBYColor("жёлтый"));
        forest.add(treeFactory.getTreeBYColor("жёлтый"));
        forest.add(treeFactory.getTreeBYColor("жёлтый"));
        forest.add(treeFactory.getTreeBYColor("жёлтый"));
        forest.add(treeFactory.getTreeBYColor("красный"));
        forest.add(treeFactory.getTreeBYColor("красный"));
        forest.add(treeFactory.getTreeBYColor("красный"));
        forest.add(treeFactory.getTreeBYColor("красный"));
        forest.add(treeFactory.getTreeBYColor("красный"));
        forest.add(treeFactory.getTreeBYColor("зелёный"));
        forest.add(treeFactory.getTreeBYColor("зелёный"));
        forest.add(treeFactory.getTreeBYColor("зелёный"));
        forest.add(treeFactory.getTreeBYColor("зелёный"));
        forest.add(treeFactory.getTreeBYColor("жёлтый"));
        forest.add(treeFactory.getTreeBYColor("жёлтый"));

        for (Tree tree : forest) {
            tree.grow();
        }
    }
}
