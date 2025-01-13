public class BetterQualitySolution {
    public int minimumLength(String s) {
        int minLength=0;
        int [] charFreq= new int[26];
        for (char c : s.toCharArray()) {
            charFreq[c-'a']++;
        }
        for (int i : charFreq) {
            if (i==0) {
                continue;
            }
            if (i%2==1 ) {
                minLength++;
            }
            else  {
                minLength+=2;
            }
        }
        return minLength;
    }
}
