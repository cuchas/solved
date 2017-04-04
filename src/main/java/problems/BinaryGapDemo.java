package problems;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class BinaryGapDemo {

    public static void main(String[] args) {
        //Convert decimal to binary
        //Loop no array somando sempre que tiver 0 e sobrepondo só quando for maior

        System.out.println("9 gap should be 2, result was " + binaryGap(9));
        System.out.println("529 gap should be 4, result was " + binaryGap(529));
        System.out.println("20 gap should be 1, result was " + binaryGap(20));
        System.out.println("15 gap should be 0, result was " + binaryGap(15));
        System.out.println("1041 gap should be 5, result was " + binaryGap(1041));
        System.out.println("6 gap should be 0, result was " + binaryGap(6));
        System.out.println("328 gap should be 2, result was " + binaryGap(328));
    }

    public static int binaryGap(int number) {
        //char array
        //um contador para saber se encontrou binary gay
        //array de resultados de count

        String s = Integer.toBinaryString(number);
        char[] chars = s.toCharArray();
        int sum = 0;
        int sum2 = 0;
        int result = 0;

        for(char c : chars) {
            if(c == '1') {
                if(sum + 1 == 2) {
                    if(sum2 > result)
                        result = sum2;
                    sum2 = 0;
                } else {
                    sum++;
                }

            } else {
                if(sum > 0) {
                    sum2++;
                }
            }
        }

        return result;
    }
}
