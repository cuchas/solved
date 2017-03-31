package tree;

/**
 * Created by eduardocucharro on 30/03/17.
 */
public class BinarySearchTree {

    private TreeNode root;

    public void insert(Integer data) {
        if(root == null) {
            this.root = new TreeNode(data);
        } else root.insert(data);
    }

    public TreeNode find(Integer data) {
        if(root != null)
            return root.find(data);
        return null;
    }

    public Integer smallest() {
        if(root != null) return root.smallest();
        return null;
    }

    public Integer largest() {
        if(root != null) return root.largest();
        return null;
    }

    public void traverse() {
        if(root == null) return;

        root.traverse(root);
    }

    public Integer leafNodes() {
        if(root == null) return 0;
        return root.leafNodes();
    }

    public Integer height() {
        //TODO find the tree height
        return 0;
    }

    public void insertOrdered(Integer[] collection) {
        //TODO insert making tree with least height possible
    }

    //soft delete
    public void delete(Integer data) {
        TreeNode node = find(data);

        if(node == null) return;

        node.setDeleted(true);
    }

//    public void delete(Integer data) {
//        //Iterative way
//        TreeNode current = this.root;
//        TreeNode parent = this.root;
//        boolean isLeft = false;
//
//        if(current == null) return;
//
//        while(current != null && current.getData() != data) {
//            parent = current;
//
//            if(data < current.getData()) {
//                current = current.getLeftChild();
//                isLeft = true;
//            } else {
//                current = current.getRightChild();
//                isLeft = false;
//            }
//        }
//
//        //not found
//        if(current == null) return;
//
//        //leaf
//        if(current.getLeftChild() == null && current.getRightChild() == null) {
//
//            if(current == root) {
//                root = null;
//            } else {
//                if(isLeft) parent.setLeftChild(null);
//                else parent.setRightChild(null);
//            }
//            //not have child on right side
//        } else if(current.getRightChild() == null) {
//            if(current == root) {
//                root = current.getLeftChild();
//            } else if(isLeft) {
//                parent.setLeftChild(current.getLeftChild());
//            } else {
//                parent.setRightChild(current.getLeftChild());
//            }
//        } else if(current.getLeftChild() == null) {
//            if(current == root) {
//                root = current.getRightChild();
//            } else if(isLeft) {
//                parent.setLeftChild(current.getRightChild());
//            } else {
//                parent.setRightChild(current.getRightChild());
//            }
//        }
//    }
}
