import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {

    }
    public static int solution(String x) {
        BigInteger num = new BigInteger(x);
        int res = 0;
        while (!num.equals(BigInteger.ONE)) {
            if (num.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                num = num.divide(BigInteger.valueOf(2));
                res += 1;
            } else if (num.equals(BigInteger.valueOf(3))) {
                num = num.subtract(BigInteger.valueOf(1));
                res += 1;
            } else if ((((num.subtract(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2))).mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) && ((num.subtract(BigInteger.valueOf(1))).divide(BigInteger.valueOf(4))).mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                num = num.subtract(BigInteger.valueOf(1));
                res += 1;
            } else if ((((num.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2))).mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) && ((num.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(4))).mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                num = num.add(BigInteger.valueOf(1));
                res += 1;
            } else if (((num.subtract(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2))).mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                num = num.subtract(BigInteger.valueOf(1));
                res += 1;
            } else if (((num.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2))).mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                num = num.add(BigInteger.valueOf(1));
                res += 1;
            } else {
                num = num.subtract(BigInteger.valueOf(1));
                res += 1;
            }
            System.out.println(num);
        }
        return res;
    }
}
