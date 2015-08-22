import java.util.*;
public class P15 {
    public static void main(String[] args) {
        ArrayList<Long> binomial = new ArrayList<Long>();
        binomial.add((long)1);
        binomial.add((long)1);
        for (int index = 0; index < 39; index++) {
            ArrayList store = (ArrayList)binomial.clone();
            for (int i = 1; i < store.size() - 1; i++) {
                binomial.remove(1);
            }
            for (int i = 1; i < store.size(); i++) {
                long a = (long)store.get(i-1);
                long b = (long)store.get(i);
                binomial.add(i, (long)(a + b));
            }
            if (binomial.size() % 2 == 1) {
                System.out.println(binomial);
            }
        }
        long big = 0;
        for (int i = 0; i < binomial.size(); i++) {
            if (binomial.get(i) > big) {
                big = binomial.get(i);
            }
        }
        System.out.println(big);
    }
}