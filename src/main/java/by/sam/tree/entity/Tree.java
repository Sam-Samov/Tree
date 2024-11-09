package by.sam.tree.entity;

import java.util.Arrays;

public class Tree {
    private Branch[] branches;

    public Tree() {
        int amountBranches = 5 + (int) (Math.random() * 40);
        Branch[] branches = new Branch[amountBranches];
        for (int i = 0; i < amountBranches; i++) {
            branches[i] = new Branch();
        }
    }

    public Branch[] getBranches() {
        return branches;
    }

    public void frostLeafs() {
        System.out.println("дерево покрылось инеем");
        for (int i = 0; i < branches.length; i++) {
            branches[i].frostLeafs();
        }
    }

    public void fallLeafs() {
        System.out.println("дерево сбросило листья");
        for (int i = 0; i < branches.length; i++) {
            branches[i].fallLeafs();
        }
    }

    public void yellowLeafs() {
        System.out.println("дерево пожелтело");
        for (int i = 0; i < branches.length; i++) {
            branches[i].yellowLeafs();
        }
    }

    public void bloom() {
        System.out.println("дерево зацвело");
        for (int i = 0; i < branches.length; i++) {
            branches[i].greenLeafs();
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "branches=" + Arrays.toString(branches) +
                '}';
    }
}
