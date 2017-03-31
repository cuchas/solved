package tree;

/**
 * Created by eduardocucharro on 30/03/17.
 */
public class TreeNode {
    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private boolean deleted;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void insert(Integer data) {
        if(data >= this.data) {
            if(rightChild == null) {
                rightChild = new TreeNode(data);
            } else {
                rightChild.insert(data);
            }
            return;
        } else {
            if(leftChild == null) {
                leftChild = new TreeNode(data);
            } else {
                leftChild.insert(data);
            }
        }
    }

    public Integer smallest() {
        if(this.leftChild == null)
            return this.data;

        return this.leftChild.smallest();
    }

    public Integer largest() {
        if(this.rightChild == null)
            return this.data;

        return this.rightChild.largest();
    }

    public TreeNode find(Integer data) {
        if(this.data == data && !deleted) {
            System.out.println(this.data);
            return this;
        }

        System.out.println(this.data);

        if(data < this.data && leftChild != null)
            return leftChild.find(data);

        if(rightChild != null) rightChild.find(data);

        return null;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public int leafNodes() {
        if(rightChild == null && leftChild == null) {
            return 1;
        }

        if(leftChild != null) return 1 + leftChild.leafNodes();

        if(rightChild != null) return 1 + rightChild.leafNodes();

        return 0;
    }

    public void traverse(TreeNode node) {

        if (node.getLeftChild() != null){
            traverse(node.getLeftChild());
        }

        System.out.println(node.data);

        if (node.getRightChild() != null){
            traverse (node.getRightChild());
        }
    }
}
