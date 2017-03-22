package list;

/**
 * Created by eduardocucharro on 22/03/17.
 */
public class DoublyNode<T> {
    T data;
    DoublyNode<T> next;
    DoublyNode<T> previous;

    public DoublyNode(T data) {
        this.data = data;
    }

    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    public void setPrevious(DoublyNode<T> previous) {
        this.previous = previous;
    }

    public DoublyNode<T> getNext() {
        return next;
    }

    public DoublyNode<T> getPrevious() {
        return previous;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Data is " + data;
    }
}
