package list;


import static java.lang.System.out;

/**
 * Created by eduardocucharro on 27/03/17.
 */
public class QueueArrayDemo {

    public static void main(String[] a) {
        QueueArray q = new QueueArray();

        try {

            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);

            out.println("peek " + q.peek());

            out.println("dequeue " + q.dequeue());
            out.println("dequeue " + q.dequeue());
            out.println("dequeue " + q.dequeue());
            out.println("dequeue " + q.dequeue());
            out.println("dequeue " + q.dequeue());

            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);

            out.println("dequeue " + q.dequeue());
            out.println("dequeue " + q.dequeue());
            out.println("dequeue " + q.dequeue());
            out.println("dequeue " + q.dequeue());
            out.println("dequeue " + q.dequeue());

            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);

            out.println("dequeue " + q.dequeue());
            out.println("dequeue " + q.dequeue());
            out.println("dequeue " + q.dequeue());
            out.println("dequeue " + q.dequeue());

            q.enqueue(10);

        } catch(Exception e) {
            out.println(e);
        }
    }
}
