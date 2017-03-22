package list;

/**
 * Created by eduardocucharro on 20/03/17.
 */
//Lista duplamente ligada
public class DoublyLinkedList<T> {

    DoublyNode<T> head;

    public void insert(T data) {
        DoublyNode<T> newNode = new DoublyNode<T>(data);

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.setNext(head);

        head.setPrevious(newNode);

        head = newNode;
    }

    @Override
    public String toString() {

        DoublyNode<T> current = head;
        String print = "{";

        while(current != null) {
            print += current + ",";
            current = current.getNext();
        }

        print += "}";

        return print;
    }
}
