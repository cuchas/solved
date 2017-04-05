package problems;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {

        if(X == Y) return 0;

        int Z = Y - X;

        int r = Z%D;

        if(r > 0)
            return Z/D + 1;

        return Z/D;
    }
}
