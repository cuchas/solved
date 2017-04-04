package problems;

import java.util.*;
import java.io.*;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class MaxPairWiseProductDemo {

    public static void main(String[] args) {

        //stressTest();

        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(getMaxPairwiseProductFast(numbers));
    }

    static long getMaxPairwiseProduct(int[] numbers) {

        long result = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                long res = ((long)numbers[i]) * numbers[j];
                if (res > result) {
                    result = res;
                }
            }
        }
        return result;
    }

    static long getMaxPairwiseProductFast(int[] numbers) {
        int n = numbers.length;

        int max_index1 = -1;

        for(int i = 0; i < n; i++) {
            if((max_index1 == -1) || (numbers[i] > numbers[max_index1]))
                max_index1 = i;
        }

        int max_index2 = -1;
        for(int j = 0; j < n; j++) {
            if((j != max_index1) && ((max_index2 == -1) || numbers[j] > numbers[max_index2])) {
                max_index2 = j;
            }
        }

        long res = ((long)numbers[max_index1]) * numbers[max_index2];

        return res;
    }

    static void stressTest() {
        while(true) {
            Random r = new Random();
            int n = r.nextInt(5);

            while(n < 2) {
                n = r.nextInt(5);
            }

            System.out.println(n);

            int[] a = new int[n];

            for(int i = 0; i < n; i++) {
                int x = r.nextInt(9);
                a[i] = x;
                System.out.print(x);
                System.out.print(" ");
            }

            System.out.println();

            long slow = getMaxPairwiseProduct(a);
            long fast = getMaxPairwiseProductFast(a);

            if(slow != fast) {
                System.out.println(String.format("Wrong answer: %d %d", slow, fast));
                break;
            } else {
                System.out.println("OK");
            }
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
