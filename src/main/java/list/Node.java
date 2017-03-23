package list;

/**
 * Created by eduardocucharro on 20/03/17.
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null) return false;

        Node<T> n = (Node<T>)obj;

        return n.getData() == getData();
    }

    @Override
    public String toString() {
        return String.format("Data is %s", data);
    }

    public <T> void setData(T data) {
        this.data = data;
    }
}
