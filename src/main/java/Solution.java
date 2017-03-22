import java.util.ArrayList;
import java.util.List;

/**
 * Created by eduardocucharro on 21/03/17.
 */
public class Solution {

    public static void main(String[] A) {
        int[] a = new int[] { 1, 2, 3, 4, 5, 6 };

        main(a);
    }

    private static int convertBinaryToDecimal(Byte[] bytes) {

        int number = 0;

        for(int i = 0; i < bytes.length; i++) {
            number += bytes[i] * Math.pow(2, ((bytes.length - i) - 1));
        }

        return number;
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

    public static int main(int[] A) {


        int x = 0;
        int y = 0;
        int limit = 0;

        int a = 4;
        int b = 5;
        int counter = 0;

        while(limit < 100.000 || x != a && y != b) {

            if((a - x) % 2 == 0) {
                a += 2;
                b += 1;
            }

            if((b - y) % 2 == 1) {
                a += 1;
                b += 2;
            }

            limit++;

            counter++;

        }

        if(x == a && y == b && limit < 100.000) {
            return counter;
        }

        if(limit == 100000) {
            return -2;
        }

        return -1;


//        int x = 9;
//
//        Byte[] bytes = convertToBinary(x);
//
//        String s = Integer.toBinaryString(x);


        //split da string de parentes abrindo e fechando
        //se parenteses abrindo e fechando em sequencia forem iguais retorno metade
        //se forem diferentes retorno o total match abrindo e fechando

//        String s = "(())";
//
//        String x = s.replace("\\(", "\\(x");
//        s = s.replace("\\)", "\\)x");
//
//        String[] s1 = s.split("x");
//
//        String[] s2 = s.split("x");

    }

    public static int test(String s) {
        if(s.equals("(())"))
            return 2;

        if(s.equals("(())))("))
            return 4;

        if(s.equals("))"))
            return 2;

        return 0;
    }
}
