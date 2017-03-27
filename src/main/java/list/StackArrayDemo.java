package list;

/**
 * Created by eduardocucharro on 24/03/17.
 */
public class StackArrayDemo {

    public static void main(String[] args) {
        StackArray stack = new StackArray(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.peek());
    }
}
