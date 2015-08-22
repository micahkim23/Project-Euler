public class P9 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int d = 0;
        for (int count = 1; count < 333; count++) {
            for (int i = count + 1; i < 1000 - count - i; i++) {
                int c = 1000 - count - i;
                System.out.println(count + " " + i + " " + c);
                if (count*count + i*i == c*c) {
                    a = count;
                    b = i;
                    d = c;
                    break;
                }
            }

        }
        System.out.println(a*b*d);
    }
}
