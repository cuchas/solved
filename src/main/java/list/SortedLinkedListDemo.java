package list;

/**
 * Created by eduardocucharro on 22/03/17.
 */
public class SortedLinkedListDemo {

    public static void main(String[] a) {

        SortedLinkedList list = new SortedLinkedList();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtHead(1);
        list.insertAtHead(100);

        System.out.println(list);
    }
}
