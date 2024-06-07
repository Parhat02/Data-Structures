package main.tree;

public class MyTree {
    TNode root;

    public MyTree() {
    }

    void insert(int value){
        TNode newNode = new TNode(value);
        if (root==null){
            root=newNode;
            return;
        }
        TNode current = root;
        while (true){
            if (value<= current.value){
                if (current.leftChild == null){
                    // if left is null, inset there
                    current.leftChild = newNode;
                    break;
                }
                // if left is not null, branch left subtree
                current = current.leftChild;
            }else {
                if (current.rightChild == null){
                    // if right is null, inset there
                    current.rightChild = newNode;
                    break;
                }
                // if right is not null, branch left subtree
                current = current.rightChild;
            }
        }

    }
}
