package by.sam.tree;
 /*Создать объект класса Дерево, используя классы Лист, Ветка.
    Методы: 1)зацвести 2)опасть листьям 3)покрыться инеем 4)пожелтеть листьями.*/

import by.sam.tree.entity.Tree;

public class Main {
    public static void main(String[] args) {
        TreeService treeService = new TreeService();
        Tree tree1 = new Tree();

        treeService.printTree(tree1);
    }
}
