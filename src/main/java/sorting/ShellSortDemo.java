package sorting;

import java.util.Random;

/**
 * Created by eduardocucharro on 03/04/17.
 */
public class ShellSortDemo {

    public static void main(String[] args) {
        int[] a = generate();

        System.out.println();
        printArray(a);

        //TODO

//        int i = 0;

//        while(i < a.length) {
//
//            int j = knuthSequence(i);
//
//            System.out.println();
//
//            int current = a[j];
//
//            while(knuthSequence(j) <= a.length && current < a[knuthSequence(j)]) {
//                a[j] = a[knuthSequence(j)];
//                j = knuthSequence(j);
//            }
//
//            a[j] = current;
//
//            System.out.println();
//
//            printArray(a);
//
//            i++;
//        }
    }

    public static int[] generate() {
        int[] a = new int[10];
        Random r = new Random();

        for(int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(200);
        }

        return a;
    }

    public static void printArray(int[] n) {

        for(int x : n) {
            System.out.print(x + " ");
        }
    }

    public static int knuthSequence(int i) {
        return 3*i+1;
    }
}
