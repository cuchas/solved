package tree;

/**
 * Created by eduardocucharro on 30/03/17.
 */
public class BinarySearchTreeDemo {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] a = new int[]{ 52, 12, 20, 6, 5, 60, 55, 63, 40, 66};
        Integer[] b = new Integer[]{ 5, 6, 12, 20, 40, 52, 55, 60, 63, 66, 11 };

        tree.insertOrdered(b);

//        for (int x : a) {
//            tree.insert(x);
//
//        }

        System.out.println(String.format("search for %d, found %d", 5, tree.find(5).getData()));

        System.out.println("This are the leaf nodes");
        tree.leafNodes();

        System.out.println("This is the full tree InOrder");
        tree.traverse();

        System.out.println(String.format("The tree height is %d", tree.height()));
    }
}
