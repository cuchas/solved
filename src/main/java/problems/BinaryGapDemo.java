package problems;

import static util.Util.convertBinaryToDecimal;
import static util.Util.convertToBinary;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class BinaryGapDemo {

    public static void main(String[] args) {
        int number = 1041;

        Byte[] bytes = convertToBinary(number);

        int realNumber = convertBinaryToDecimal(bytes);

        System.out.print(realNumber + " in binary is : ");

        for(Byte b : bytes) {
            System.out.print(b);
        }

        System.out.print("and the binary gap is " + binaryGap(bytes));
    }

    public static int binaryGap(Byte[] bits) {
        int gap = 0;
        int tempGap = 0;

        for(Byte b : bits) {
            if(b == 1) {
                if(tempGap > gap) {
                    gap = tempGap;
                }

                tempGap = 0;
            } else {
                tempGap += 1;
            }
        }

        return gap;
    }
}
