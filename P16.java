import java.math.*;
public class P16 {
    public static void main(String[] args) {
        BigInteger power = new BigInteger("2");
        power = power.pow(1000);
        BigInteger ten = BigInteger.TEN;
        BigInteger sum = BigInteger.ZERO;
        System.out.println(power);
        for (int i = 0; i < 301; i++) {
            sum = sum.add(power.mod(ten));
            power = power.divide(ten);
        }
        sum = sum.add(power.mod(ten));
        System.out.println(sum);
    }
}