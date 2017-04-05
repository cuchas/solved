package problems;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        //rotacionar os itens pelo numero de posicoes
        //quando item for maior ou = tamanho precisa volta pro começo
        //no começo pode ter outros itens
        //os numeros podem ser negativos

        //se k  maior que o tamanho do array < 1+3 = 4 (4-2) 2

        int[] result = new int[A.length];

        for(int i = 0; i < A.length; i++) {

            if(A.length < K) {
                return A;
            }

            int j = i + K;

            if(j > A.length -1) {
                j =  j - A.length;
                result[j] = A[i];

            } else {
                result[j] = A[i];
            }
        }

        return result;

//        return new int[] { 9, 7, 6, 3, 8 };
    }
}
