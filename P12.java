public class P12 {
    public static void main(String[] args) {
        int hold = 0;
        int store = 7;
        for (int i = 28; i < 100000000; i += store) {
            if (divisor(i) > 500) {
                hold = i;
                break;
            }
            store++;
        }
        System.out.println(hold);
    }
    public static int divisor (int a) {
        //for numbers greater than 1
        int store = 0;
        for (int i = 1; i < Math.sqrt(a); i++) {
            if (a%i == 0) {
                store += 2;
            }
        }
        return store;
    }
}
