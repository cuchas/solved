package tree;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class HashtableDemo {

    public static void main(String[] args) {
        Hashtabl ht = new Hashtabl();
        ht.put("4", 40);
        ht.put("6", 60);
        ht.put("7", 70);
        ht.put("8", 80);
        ht.put("9", 90);
        ht.put("5", 50);
        ht.put("2", 20);
        ht.put("1", 10);
        System.out.println(ht.keyExists("2"));
        System.out.println(ht.keyExists("4"));
        System.out.println(ht.get(2));
    }
}
