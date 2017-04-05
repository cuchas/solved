package problems;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class TapeEquilibrium {
    public int solution(int[] A) {

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
