package recursion;

/**
 * Created by eduardocucharro on 29/03/17.
 */
public class SquaresSums {
    //Write a recursive method to calculate the sum of squares of the first n
    // natural numbers. n is to be given as an input.

    public static void main(String[] args) {
        //input 2
        //out 5
        //1ˆ2 + 2ˆ2 = 5

        System.out.println(sumSquares(3));
    }

    //n = natural squares
    public static double sumSquares(int numbers) {
        if(numbers == 1) {
            return 1;
        }

        System.out.println("level");

        return (numbers * numbers) + sumSquares(numbers -1);
    }
}
