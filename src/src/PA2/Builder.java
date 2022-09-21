package PA2;

import java.util.ArrayList;

public class Builder {

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

        z.parent = y;

        if (y == null) {
            t.root = z;
            t.tree.add(t.root);
        }else if (z.key < y.key) {
            y.left = z;
            t.tree.add(y.left);
        }else {
            y.right = z;
            t.tree.add(y.right);
        }
    }
}
