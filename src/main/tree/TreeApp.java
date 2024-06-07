package main.tree;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree=new MyTree();
        int[] numbers=new int[] {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int number : numbers) {
            tree.insert(number);
        }
        VisualizeTree.printTree(tree.root, null, false);
    }
}
