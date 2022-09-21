package PA2;

import java.util.ArrayList;

public class Tree {
    public static ArrayList<Node> bst = new ArrayList<Node>();

    public static Node root;

    public void add(Node node) {
        bst.add(node);
    }

    public static void printBST() {
        for (int i = 0; i < bst.size(); i++) {
            int x = bst.get(i).key;

            System.out.print(x + ", ");
        }

    }

    public static void inorderTreeWalk(Node x) {
        if(x != null) {
            inorderTreeWalk(x.left);
            System.out.print(x.key);
            inorderTreeWalk(x.right);
        }
    }


}
