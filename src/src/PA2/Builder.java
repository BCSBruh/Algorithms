package PA2;

import java.util.ArrayList;

public class Builder {
    Node node;
    Tree tree = new Tree();

    public void treeInsert(Tree t, Node z) {
        Node y = null;
        Node x = t.root;

        while (x != null) {
            y = x;
            if (z.key < x.key) {
                x = x.left;
            }else {
                x = x.right;
            }
        }

        z.parent = y; //Tree.findParent(y, z);

        if (y == null) {
            t.root = z;
            t.add(t.root);
        }else if (z.key < y.key) {
            y.left = z;
            t.add(y.left);
        }else {
            y.right = z;
            t.add(y.right);
        }
    }

    public void runner(int x) {
        this.node = new Node(x);
        treeInsert(tree, node);
    }


}
