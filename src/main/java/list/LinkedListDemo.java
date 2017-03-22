package list;

/**
 * Created by eduardocucharro on 20/03/17.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.insertAtHead(10);
        linkedList.insertAtHead(12);
        linkedList.insertAtHead(8);
        linkedList.insertAtHead(9);

        linkedList.deleteFromHead();

        System.out.println(linkedList.toString());

        System.out.println("Length = " + linkedList.length());

        System.out.println(String.format("Search for %d found %s", 8, linkedList.find(8)));
        System.out.println(String.format("Search for %d found %s", 15, linkedList.find(15)));
    }
}
