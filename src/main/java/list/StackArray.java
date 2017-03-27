package list;

/**
 * Created by eduardocucharro on 24/03/17.
 */
public class StackArray {
    int[] itens;
    int top = -1;

    public StackArray(int length) {
        itens = new int[length];
    }

    public void push(int item) {
        top += 1;
        itens[top] = item;
    }

    public int pop() {
        int item = itens[top];
        top += -1;

        return item;
    }

    public int peek() {
        if(top < 0) return top;
        return itens[top];
    }
}
