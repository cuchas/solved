package problems;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {

        if(X == Y) return 0;

        int Z = X + D;

        int r = Y%Z;

        if(r > 0)
            return Y/Z + 1;

        return Y/Z;
    }
}
