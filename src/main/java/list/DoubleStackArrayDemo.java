package list;

import static java.lang.System.out;

/**
 * Created by eduardocucharro on 27/03/17.
 */
public class DoubleStackArrayDemo {

    public static void main(String[] args) {
        DoubleStackArray stack = new DoubleStackArray();

        stack.push(10, true);
        stack.push(20, true);
        stack.push(30, true);

        out.println("Peek stack one " + stack.peek(true));

        stack.pop(true);
        stack.pop(true);

        out.println("Peek stack one after pops" + stack.peek(true));

        stack.push(40, false);
        stack.push(50, false);
        stack.push(60, false);

        out.println("Peek stack two " + stack.peek(false));

        stack.pop(false);
        stack.pop(false);

        out.println("Peek stack two after one pop" + stack.peek(false));

        out.println(Double.parseDouble("2#*2"));
    }
}
