package problems;

/**
 * Created by eduardocucharro on 06/04/17.
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        //Encontrar os numeros de A - B que sao divisiveis por K
        //retornar a quantidade deles
        //O(1)

        int result = 0;

        for(int i = A; i <= B;i++) {
            int mod = i%K;
            if(mod == 0)
                result++;
        }

        return result;
    }
}
