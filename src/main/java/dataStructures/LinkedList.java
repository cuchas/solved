package dataStructures;

/**
 * Created by eduardocucharro on 20/03/17.
 */
//Ordenado de tras pra frente, já que o head é sempre o último inserido
public class LinkedList<T> {
    Node<T> head;


    public void insertAtHead(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(head);

        head = newNode;
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
