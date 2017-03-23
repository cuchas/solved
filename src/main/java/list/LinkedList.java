package list;

/**
 * Created by eduardocucharro on 20/03/17.
 */
//Ordenado de tras pra frente, já que o head é sempre o último inserido
public class LinkedList<T> {
    private Node<T> head;


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

    public Node<T> get(int index) {
        int counter = 0;

        Node<T> current = head;

        while(current != null) {
            if(counter == index) {
                return current;
            }

            current = current.getNext();

            counter++;
        }

        return null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void deleteFromHead() {
        head = this.head.getNext();
    }

    public void reverse() {
        Node<T> current = head;
        Node<T> before = null;

        while (current != null) {
            Node next = current.getNext();
            current.setNext(before);
            before = current;
            current = next;
        }
        head = before;
    }

    public void removeDuplicateData() {

        if(head == null) return;

        Node<T> searched = head;
        Node<T> current = head.getNext();
        Node<T> before = head;

        while(searched != null) {

            if(current == null) {
                if(searched.getNext() == null) return;

                searched = searched.getNext();
                current = searched.getNext();
                before = searched;
            }
            else if(current.equals(searched)) {
                before.setNext(current.getNext());
                current = before.getNext();

            } else {
                before = current;
                current = current.getNext();
            }
        }
    }

    public void deleteNode(Node<T> n) {
        if (n != null && n.getNext() != null) {
            n.setData(n.getNext().getData()); // copy the data over to n
            n.setNext(n.getNext().getNext()); // next node of n is deleted now
        }

    }

    public boolean isCyclic(LinkedList ll) {
        if (ll == null || ll.getHead() == null || ll.getHead().getNext() == null)
            return false;
        Node slower = ll.getHead();
        Node faster = ll.getHead().getNext();
        while (true) { // keep going
            if (faster == null || faster.getNext() == null)
                return false;
            if (faster.equals(slower) || faster.getNext().equals(slower))
                return true;
            slower = slower.getNext();
            faster = faster.getNext().getNext();
        }
    }
}
