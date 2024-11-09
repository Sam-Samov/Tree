package by.sam.tree.entity;

public class Leaf {
    private LeafColor leafColor = LeafColor.GREEN;
    private boolean isFallen = Boolean.FALSE;
    private static int counter = 0;
    private int number;

    public Leaf() {
        ++counter;
        number = counter;
    }
    public LeafColor getLeafColor() {
        return leafColor;
    }
    public void setLeafColor(LeafColor leafColor) {
        this.leafColor = leafColor;
    }
    public boolean getFallen() {
        return isFallen;
    }
    public void setFallen(boolean isFallen) {
        this.isFallen = isFallen;
    }

    public void frost() {
        System.out.println("лист номер " + number + " покрылся инеем");
    }

    public void fall() {
        System.out.println("лист номер " + number + " опал");
    }

    public void comeYellow() {
        leafColor = LeafColor.YELLOW;
        System.out.println("лист номер " + number + " пожелтел");
    }

    public void comeGreen() {
        leafColor = LeafColor.GREEN;
        System.out.println("лист номер " + number + " зацвёл");
    }


    @Override
    public String toString() {
        return "Leaf{" +
                "leafColor=" + leafColor +
                ", isFallen=" + isFallen +
                ", number=" + number +
                '}';
    }
}