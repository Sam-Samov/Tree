package by.sam.tree;

import by.sam.tree.entity.Tree;

public class TreeService {

    public void printTree(Tree tree) {
        System.out.println(tree);
    }

    public void frostLeafs(Tree tree) {
        tree.frostLeafs();
    }

    public void fallLeafs(Tree tree) {
        tree.fallLeafs();
    }

    public void yellowLeafs(Tree tree) {
        tree.yellowLeafs();
    }

    public void bloom(Tree tree) {
        tree.bloom();
    }
}
