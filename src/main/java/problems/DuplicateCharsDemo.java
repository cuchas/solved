package problems;

import static search.BinarySearch.binarySearch;
import static sorting.InsertionSortDemo.insertionSort;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class DuplicateCharsDemo {

    public static void main(String[] args) {
        String[] array = new String[]{"Anaconda", "Great", "Ohdidi", };

        for (String s : array) {
            System.out.println(String.format("%s %s", s, String.valueOf(hasDuplicateChars(s))));
        }
    }

    public static boolean hasDuplicateChars(String s) {
        char[] chars = s.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == chars[i]) return true;
            }
        }

        return false;
    }

    //Teacher version - very interesting and efficient
//    public static boolean hasDuplicateChars(String s) {
//        // Standard ASCII (if you want to include extended ASCII, you may use a 256 length array
//        boolean[] charSet = new boolean[128]; // additional memory
//        for (int i=0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (charSet[c]) return true;
//            charSet[c] = true;
//        }
//        return false;
//    }

    public static boolean hasDuplicateCharsASCII(String s) {
        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (i + 97);
            System.out.print(alphabet[i] + " ");
        }

        char[] sChars = s.toLowerCase().toCharArray();
        int[] numberChars = new int[sChars.length];

        for(int i = 0; i < sChars.length; i++) {

            for(int j = 0; j < alphabet.length; j++) {

                if(alphabet[j] == sChars[i]) {
                    numberChars[i] = j;
                }
            }
        }

        insertionSort(numberChars);

        for(int i = 0; i < numberChars.length -1; i++) {

            //Search without

            int x = i + 1;

            int[] lessSearched = new int[numberChars.length - x];

            for(int j = 0; j < lessSearched.length; j++) {
                lessSearched[j] = numberChars[j + x];
            }

            int n = binarySearch(numberChars[i], lessSearched);

            if(n >= 0) {
                return true;
            }
        }

        return false;
    }
}
