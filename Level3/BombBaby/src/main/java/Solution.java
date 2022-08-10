import java.math.BigInteger;

//IMPORTANT INFO
//M-BOMB START = 1, F-BOMB START = 1, GENERATIONS ARE M-BOMB += F-BOMB OR F-BOMB += M-BOMB
//FIND LEAST AMOUNT OF GENERATIONS TO REACH GIVEN X AND Y VALUES - X BEING M-BOMBS Y BEING F-BOMBS
public class Solution {
    public static String solution(String x, String y) {
        BigInteger M = new BigInteger(x);
        BigInteger F = new BigInteger(y);
        BigInteger res = BigInteger.valueOf(0);
        while (M.compareTo(BigInteger.ONE) >= 0 && F.compareTo(BigInteger.ONE) >= 0) {
            if (M.compareTo(BigInteger.ONE) > 0 && F.compareTo(BigInteger.ONE) > 0 && (M.mod(F).equals(BigInteger.ZERO) || F.mod(M).equals(BigInteger.ZERO))) return "impossible";
            if (M.compareTo(F) > 0 && F.equals(BigInteger.ONE)) {
                BigInteger multiplier = (M.divide(F)).subtract(BigInteger.ONE);
                M = M.subtract(F.multiply(multiplier));
                res = res.add(multiplier);
            } else if (F.compareTo(M) > 0 && M.equals(BigInteger.ONE)) {
                BigInteger multiplier = (F.divide(M)).subtract(BigInteger.ONE);
                F = F.subtract(M.multiply(multiplier));
                res = res.add(multiplier);
            } else if (M.compareTo(F) > 0) {
                BigInteger multiplier = (M.divide(F));
                M = M.subtract(F.multiply(multiplier));
                res = res.add(multiplier);
            } else if (F.compareTo(M) > 0) {
                BigInteger multiplier = (F.divide(M));
                F = F.subtract(M.multiply(multiplier));
                res = res.add(multiplier);
            } else {
                break;
            }
        }
        return String.valueOf(res);
    }
}
