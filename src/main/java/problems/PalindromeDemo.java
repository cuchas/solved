package problems;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class PalindromeDemo {

    public static void main(String[] args) {
        checkPalindrome();
    }

    public static void checkPalindrome() {
        String[] words = new String[] {"jambalada", "ovo", "ohdidi", "ama"};

        for(String s : words) {
            System.out.println(String.format("%s %s palindrome", s, isPalindrome(s) ? "is" : "is not"));
        }
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toUpperCase().toCharArray();

        int mod = chars.length % 2;

        int half;

        if(mod == 0)
            half = chars.length / 2;
        else
            half = (chars.length / 2) + 1;

        for(int i = 0; i < half; i++) {

            int inverse = chars.length - 1 - i;

            if(!(chars[i] == chars[inverse])) return false;
        }

        return true;
    }
}
