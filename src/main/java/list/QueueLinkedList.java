package list;

/**
 * Created by eduardocucharro on 27/03/17.
 */
public class QueueLinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void enqueue(T data) {
        Node<T> node = new Node<T>(data);

        if(tail == null) {
            tail = node;
            head = node;
            return;
        }

        tail.setNext(node);
        tail = node;
    }

    public T peek() {
        if(head == null) return null;

       return head.getData();
    }

    public T dequeue() {

        if(head == null) return null;

        Node<T> current = head;

        head = current.getNext();

        if(head == null) tail = null;

        return current.getData();
    }
}
