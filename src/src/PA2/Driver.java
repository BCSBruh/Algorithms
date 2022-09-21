package PA2;

public class Driver {
    public static void main(String[] args) {
        int[] arr1 = {6, 2, 8, 5};

        Builder build = new Builder();
        for (int i = 0; i < arr1.length; i++) {
            build.runner(arr1[i]);
        }

        Tree.inorderTreeWalk(Tree.root);
    }
}
