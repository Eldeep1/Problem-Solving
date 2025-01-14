import java.math.BigInteger;

public class Solution {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] c = new int[A.length];
        BigInteger x = BigInteger.valueOf(1).shiftLeft(A[0]);
        BigInteger y = BigInteger.valueOf(1).shiftLeft(B[0]);
        if (x.equals(y)) {
            c[0] = 1;
        } else {
            c[0] = 0;
        }
        for (int i = 1; i < c.length - 1; i++) {
            BigInteger tmpX = BigInteger.valueOf(1).shiftLeft(A[i]);
            BigInteger tmpY = BigInteger.valueOf(1).shiftLeft(B[i]);
            x = x.or(tmpX);
            y = y.or(tmpY);
            c[i] = onesCountInNum(x.and(y));
        }
        c[c.length - 1] = c.length;
        return c;
    }

    private int onesCountInNum(BigInteger num) {
        int count = 0;
        while (!num.equals(BigInteger.ZERO)) {
            if (num.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                count++;
            }
            num = num.divide(BigInteger.TWO);
        }
        return count;
    }
}
