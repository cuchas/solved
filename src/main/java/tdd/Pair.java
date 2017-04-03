package tdd;

/**
 * Created by eduardocucharro on 10/03/17.
 */
public class Pair {
    private String from;
    private String to;

    Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Pair p = (Pair)obj;
        return from.equals(p.from) && to.equals(p.to);
    }
}
