package problems;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class TapeEquilibrium {
    public int solution(int[] A) {

        //somar todos os itens como se fossem dois a partir da posicao
        //soma de 0 até o atual -1
        //soma do atual até o final
        //O(n^2) ideal O(n)

//        return firstSolution(A);
        return secondSolution(A);
    }

    private int secondSolution(int[] A) {
        int sum = 0;
        int sum2 = 0;
        int result = 0;

        for(int i : A) {
            sum2 += i;
        }

        for(int i = 1; i < A.length; i++) {
            sum += A[i-1];
            sum2 -= A[i-1];

            int r = sum2 - sum;

            if(r < 0)
                r*= -1;

            if(r < result || result == 0)
                result = r;
        }

        return result;
    }

    private int firstSolution(int[] A) {

        //somar todos os itens como se fossem dois a partir da posicao
        //soma de 0 até o atual -1
        //soma do atual até o final
        //Precisa melhorar, quando array 2 elementos falha, somando tudo não dividindo logicamente em 2

        //O(n^2) ideal O(n)

        int result = 0;
        int i = 0;

        while(i < A.length) {

            int j = i;
            int k = i+1;

            int x = 0;
            int y = 0;
            int sub = 0;

            while(j >= 0) {
                x += A[j];
                j--;
            }

            while(k < A.length) {
                y += A[k];
                k++;
            }

            sub = y - x;

            if(y < x)
                sub *= -1;

            if(sub < result || result == 0)
                result = sub;

            i++;
        }

        return result;
    }
}
