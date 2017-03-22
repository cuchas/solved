package list;

/**
 * Created by eduardocucharro on 20/03/17.
 */
public class DoublyEndedListDemo {
    public static void main(String[] args) {
        DoublyEndedList<Integer> doublyEndedList = new DoublyEndedList<Integer>();

        doublyEndedList.insertAtTail(10);
        doublyEndedList.insertAtTail(12);
        doublyEndedList.insertAtTail(8);
        doublyEndedList.insertAtTail(9);

        System.out.println(doublyEndedList.toString());
    }
}
