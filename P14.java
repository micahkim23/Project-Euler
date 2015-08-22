public class P14 {
    public static void main(String[] args) {
        int largest = 0;
        int max = 0;
        for (int i = 1000; i < 1000000; i++) {
            int a = collatzSequence(i);
            if (a > largest) {
                largest = a;
                max = i;
            }
        }
        System.out.println(max);
    }

    public static int collatzSequence(long a) {
        int num = 1;
        while (a > 1) {
            if (a%2 == 0) {
                a = a/2;
                num++;
            }
            else {
                a = 3*a + 1;
                num++;
                a = a/2;
                num++;
            }
        }
        return num;
    }
}
