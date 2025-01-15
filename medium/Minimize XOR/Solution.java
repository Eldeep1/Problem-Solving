public class Solution {
    public int minimizeXor(int num1, int num2) {
        int count = onesCountInNum(num2);

        int result = 0;

        for (int i = 31; i >= 0; i--) {

            int bit = (num1 >> i) & 1;
            

            if (count > 0 && bit == 1) {
                result |= (1 << i);
                count--;
            }

            else if (bit == 0) {
                result |= (0 << i);
            }
        }

        for (int i = 0; i < 32 && count > 0; i++) {
            if (((result >> i) & 1) == 0) {
                result |= (1 << i);
                count--;
            }
        }

        return result;
    }

    private int onesCountInNum(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }
}
