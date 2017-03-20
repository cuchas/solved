package dataStructures;

/**
 * Created by eduardocucharro on 20/03/17.
 */
//LinkedList com acesso pelo head ou pela tail
public class DoublyEndedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public void insertAtHead(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(head);

        head = newNode;
    }

    public void insertAtTail(T data) {

        Node<T> n = new Node<T>(data);

        if(head == null) {
            head = n;
        }

        if(tail != null)
            tail.setNext(n);

        tail = n;
    }

    @Override
    public String toString() {
        String result = "{";

        Node current = head;

        while(current != null) {
            result += current.toString() + ",";
            current = current.getNext();
        }

        return result + "}";
    }

    public int length() {
        int length = 0;

        Node current = head;

        while(current != null) {
            length++;
            current = current.getNext();
        }

        return length;
    }

    public Node<T> find(int data) {
        Node current = head;

        while(current != null) {
            if(current.getData().equals(data)) return current;

            current = current.getNext();
        }

        return null;
    }

    public void deleteFromHead() {
        head = this.head.getNext();
    }
}
