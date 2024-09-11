public class BetterSolution {
    public int minBitFlips(int start, int goal) {
        // XOR between start and goal will give us the differing bits
        int xor = start ^ goal;
        
        // Count the number of 1s in the XOR result, which gives the bit flips needed
        return Integer.bitCount(xor);
    }
}
