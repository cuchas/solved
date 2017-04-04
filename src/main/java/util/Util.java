package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class Util {

    public static int convertBinaryToDecimal(Byte[] bytes) {

        int number = 0;

        for(int i = 0; i < bytes.length; i++) {
            number += bytes[i] * Math.pow(2, ((bytes.length - i) - 1));
        }

        return number;
    }

    public static void printArray(int[] array) {

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static int[] getRandomArray() {
        Random r = new Random(100);

        int i1 = 10;
        int[] a = new int[i1];

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(i1);
        }

        return a;
    }

    public static Byte[] convertToBinary(int number) {
        List<Byte> list = new ArrayList();

        int result = number;

        while(result > 0) {
            int remainder = result % 2;
            result = result / 2;

            byte b = Byte.parseByte(String.valueOf(remainder));

            list.add(b);
        }

        Byte[] objects = new Byte[list.size()];
        Byte[] reversed = new Byte[list.size()];

        list.toArray(objects);

        for(int i = objects.length; i > 0; i--) {
            reversed[objects.length - i] = objects[i-1];
        }

        return reversed;
    }
}
