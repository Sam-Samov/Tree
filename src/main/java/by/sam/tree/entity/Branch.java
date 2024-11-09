package by.sam.tree.entity;

public class Branch {
    private Leaf[] leafs;
    private boolean isFallen = Boolean.FALSE;
    private static int counter = 0;
    private int number;

    public Branch() {
        ++counter;
        number = counter;
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
}
