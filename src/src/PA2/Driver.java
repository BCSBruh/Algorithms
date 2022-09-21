package PA2;

public class Driver {
    public static void main(String[] args) {
        int[] arr1 = {0,3,4,5,7,2,1};

        Builder bst = new Builder();
        Node root;
        Tree t = new Tree(null);

        for(int i = 0; i < arr1.length; i++) {
            root = new Node(arr1[i]);
            bst.treeInsert(t, root);
        }

        System.out.println("done");
    }
}
