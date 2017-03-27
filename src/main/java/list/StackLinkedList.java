package list;

/**
 * Created by eduardocucharro on 27/03/17.
 */
public class StackLinkedList<T> {
    Node<T> head;

    public void push(T data) {
        Node<T> node = new Node<T>(data);

        if(head == null) {
            head = node;
            return;
        }

        node.setNext(head);
        head = node;
    }

    public Node<T> peek() {
        return head;
    }

    public Node<T> pop() {
        if(head == null) return null;

        Node<T> current = head;
        head = current.getNext();

        return current;
    }
}
