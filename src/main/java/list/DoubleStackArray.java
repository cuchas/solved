package list;


import java.util.Arrays;

/**
 * Created by eduardocucharro on 27/03/17.
 */
public class DoubleStackArray {
    int[] array;
    int top = -1;
    int tail = -1;
    int limit = 0;

    public DoubleStackArray() {
        array = new int[100];
        limit = array.length / 2 - 1;
        tail = limit;
    }

    public void push(int data, boolean stackOne) {

        if(stackOne) {
            pushStackone(data);
            return;
        }

        if(tail > array.length) return;

        tail++;
        array[tail] = data;
    }

    private void pushStackone(int data) {
        if(top >= limit) return;
        top++;
        array[top] = data;
    }

    public int pop(boolean stackOne) {
        if(stackOne) {
            return popStackOne();
        }

        if(tail <= limit) return -1;
        tail--;

        return array[tail];
    }

    private int popStackOne() {
        if(top < 0) return top;

        top--;
        return array[top];
    }

    public int peek(boolean stackOne) {
        if(stackOne) {
            return peekStackOne();
        }

        if(tail <= limit) return -1;

        return array[tail];
    }

    private int peekStackOne() {
        if(top < 0) return -1;
        return array[top];
    }
}
