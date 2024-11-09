package by.sam.tree.entity;

import java.util.Arrays;

public class Branch {
    private Leaf[] leafs;
    private static int counter = 0;
    private int number;

    public Leaf[] getLeafs() {
        return leafs;
    }

    public static int getCounter() {
        return counter;
    }

    public int getNumber() {
        return number;
    }

    public Branch() {
        ++counter;
        number = counter;
        int amountLeafs = 5 + (int) (Math.random() * 20);
        Leaf[] leafs = new Leaf[amountLeafs];
        for (int i = 0; i < amountLeafs; i++) {
            leafs[i] = new Leaf();
        }
        this.leafs = leafs;
    }

    public void frostLeafs() {
        System.out.println("ветка номер " + number + " покрылась инеем");
        for (int i = 0; i < leafs.length; i++) {
            leafs[i].frost();
        }
    }

    public void fallLeafs() {
        System.out.println("ветка номер " + number + " сбросила листья");
        for (int i = 0; i < leafs.length; i++) {
            leafs[i].fall();
        }
    }

    public void yellowLeafs() {
        System.out.println("ветка номер " + number + " пожелтела");
        for (int i = 0; i < leafs.length; i++) {
            leafs[i].comeYellow();
        }
    }

    public void greenLeafs() {
        System.out.println("ветка номер " + number + " пожелтела");
        for (int i = 0; i < leafs.length; i++) {
            leafs[i].comeGreen();
        }
    }

    @Override
    public String toString() {
        return "\nBranch{" +
                ", number=" + number +
                " leafs=" + Arrays.toString(leafs) +
                '}';
    }
}
