package list;

/**
 * Created by eduardocucharro on 27/03/17.
 */
public class StackLinkedListDemo {

    public static void main(String[] args) {
        StackLinkedList<Integer> stack = new StackLinkedList<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack peek " + stack.peek());
        System.out.println("Stack pop " + stack.pop());

        stack.pop();

        System.out.println("Last Stack pop " + stack.pop());

        System.out.println("Should be null pop " + stack.pop());

    }
}
