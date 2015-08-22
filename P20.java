import java.math.*;
public class P20 {
    public static void main(String[] args) {
        BigInteger product = BigInteger.ONE;
        for (int i = 2; i < 101; i++) {
            String a = Integer.toString(i);
            product = product.multiply(new BigInteger(a));
        }
        System.out.println(product);
        BigInteger sum = BigInteger.ZERO;
        BigInteger ten = BigInteger.TEN;
        for (int i = 0; i < 157; i++) {
            sum = sum.add(product.mod(ten));
            product = product.divide(ten);
        }
        sum = sum.add(product.mod(ten));
        System.out.println(sum);
    }
}