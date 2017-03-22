package list;

/**
 * Created by eduardocucharro on 20/03/17.
 */
//LinkedList ordenada
public class SortedLinkedList {

    private Integer data;
    private Node<Integer> head;

    public void insertAtHead(Integer data) {

        Node<Integer> current = head;

        Node<Integer> newNode = new Node<Integer>(data);

        if(head == null) {
            head = newNode;
            return;
        }

        while(current != null) {

            if(current.getData() > data) {

                newNode.setNext(current);
                head = newNode;
                return;

            } else if(current.getNext() == null) {

                current.setNext(newNode);
                return;

            } else {
                current = current.getNext();
            }
        }
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

    public Node<Integer> find(int data) {
        Node current = head;

        while(current != null) {
            if(current.getData().equals(data)) return current;

            current = current.getNext();
        }

        return null;
    }
}
