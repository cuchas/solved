package tree;

/**
 * Created by eduardocucharro on 30/03/17.
 */
public class BinarySearchTreeDemo {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] a = new int[] { 52, 12, 20, 6, 5, 60, 55, 63, 40, 66 };

        for(int x : a) {
            tree.insert(x);
        }

//        tree.find(5);
//        System.out.println(tree.leafNodes());

        tree.traverse();
    }
}
