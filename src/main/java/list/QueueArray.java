package list;

/**
 * Created by eduardocucharro on 24/03/17.
 */
public class QueueArray {
    int head = -1;
    int tail = -1;
    int[] array;

    public QueueArray() {
        array = new int[5];
    }

    public void enqueue(int item) throws Exception {

        if(tail + 1 == array.length) throw new Exception("Queue limit");

        tail++;

        array[tail] = item;

        if(head < 0) head = tail;
    }

    public int dequeue() {
        if(head < 0) return head;

        int item = array[head];

        if(head + 1 == array.length) {
            head = -1;
            tail = -1;

            return item;
        }

        head++;

        return item;
    }

    public int peek() {
        if(head < 0) return head;

        return array[head];
    }
}
