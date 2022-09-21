package PA2;

import java.util.ArrayList;

public class Tree {
    Node node, root;

    ArrayList<Node> tree = new ArrayList<Node>();

    Tree(Node x) {
        this.node = x;
        tree.add(node);
        root = tree.get(0);
    }
}
