public class P10 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long sum = 2;
        int max = 2000000;
        boolean[] A = new boolean[max];
        for (int i = 2; i < Math.sqrt(max); i++) {
            if (A[i] != true) {
                for (int j = i*i; j < max; j += i) {
                    A[j] = true;
                }
            }
        }
        for (int i = 3; i < max; i+=2) {
            if (A[i] == false) {
                sum += i;
            }
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        long total = end - startTime;
        System.out.println(total);
    }
}
