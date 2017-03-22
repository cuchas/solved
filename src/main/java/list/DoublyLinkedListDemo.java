package list;

/**
 * Created by eduardocucharro on 22/03/17.
 */
public class DoublyLinkedListDemo {

    public static void main(String[] a) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.insert(10);
        list.insert(20);
        list.insert(4);
        list.insert(11);

        System.out.println(list);
    }
}
