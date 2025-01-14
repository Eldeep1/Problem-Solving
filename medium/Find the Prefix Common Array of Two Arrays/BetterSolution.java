public class BetterSolution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] c = new int[A.length];
        int[] freqCount = new int[51];
        int cnt = 0;

        for (int i = 0; i < c.length; i++) {
            freqCount[A[i]]++;
            freqCount[B[i]]++;
            if (freqCount[A[i]] == 2) {
                cnt++;
            }
            if (freqCount[B[i]] == 2 && A[i] != B[i]) {
                cnt++;
            }
            c[i] = cnt;
        }
        return c;
    }
}
