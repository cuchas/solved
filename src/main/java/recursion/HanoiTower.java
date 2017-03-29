package recursion;

import static java.lang.System.out;

/**
 * Created by eduardocucharro on 28/03/17.
 */
public class HanoiTower {

    static int accum = 0;

    public static void main(String[] args) {
        HanoiTower t = new HanoiTower();

        t.move(6, 'A', 'C', 'B');

        System.out.println(String.format("%d disks need %d moves", 6, accum));
    }

    public static void move(int numberofDisks, char from, char to, char inter) {

        accum += 1;

        if(numberofDisks == 1) {
            out.println(String.format("moving disk 1 from %s to %s", from, to));
        } else {

            move(numberofDisks-1, from, inter, to);

            out.println(String.format("moving disk %d from %s to %s", numberofDisks, from, to));

            move(numberofDisks-1, inter, to, from);
        }
    }
}
