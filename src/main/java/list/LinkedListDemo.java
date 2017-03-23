package list;

/**
 * Created by eduardocucharro on 20/03/17.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);

//        linkedList.deleteFromHead();

        System.out.println(list.toString());

//        Node<Integer> current = linkedList.getHead();
//
//        //insert last 2 nodes
//        int nodesToInsert = 2;
//        int inserted = 0;
//
//        //put N last items of the list N elements to the beginning of the list
//        while(current != null && inserted < nodesToInsert) {
//
//            if(current.getNext() != null && current.getNext().getNext() == null) {
//                linkedList.insertAtHead(current.getNext().getData());
//                current.setNext(null);
//                inserted++;
//                current = linkedList.getHead();
//
//            } else {
//                current = current.getNext();
//            }
//        }
//
//        System.out.println(linkedList);

        list.reverse();

        System.out.println(list);

        System.out.println("Length = " + list.length());

        System.out.println(String.format("Search for %d found %s", 8, list.find(8)));
        System.out.println(String.format("Search for %d found %s", 15, list.find(15)));

        Node<Integer> node = list.get(3);

        System.out.println(String.format("node at %d is %s", 3, node));

        LinkedList<Integer> duplicateList = new LinkedList<Integer>();
        duplicateList.insertAtHead(1);
        duplicateList.insertAtHead(2);
        duplicateList.insertAtHead(2);
        duplicateList.insertAtHead(4);
        duplicateList.insertAtHead(4);
        duplicateList.insertAtHead(3);

        duplicateList.removeDuplicateData();

        System.out.println(duplicateList);

        LinkedList<String> charList = new LinkedList<String>();
        charList.insertAtHead("z");
        charList.insertAtHead("y");
        charList.insertAtHead("x");
        charList.insertAtHead("w");
        charList.insertAtHead("v");
        charList.insertAtHead("u");

        System.out.println(charList);
    }
}
