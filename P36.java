public class P36 {
    public static void main (String[] args) {
        long sum = 0;
        for (int i = 1; i < 1000000; i++) {
            String base10 = Integer.toString(i);
            String reverse = "";
            int length = base10.length();
            for (int j = length - 1; j >= 0; j--) {
                reverse += base10.charAt(j);
            }
            String base2 = Integer.toBinaryString(i);
            String reverse2 = "";
            int length2 = base2.length();
            for (int j = length2 - 1; j >= 0; j--) {
                reverse2 += base2.charAt(j);
            }
            if (base10.equals(reverse) && base2.equals(reverse2)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
  
}
