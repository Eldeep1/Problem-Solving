
public class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length()==k) {
            return true;
        }
        if (s.length()<k) {
            return false;
        }
        int[] charFreq=new int[26];
        int count=0;
        for (char c : s.toCharArray()) {
            if (charFreq[c-97]%2==0) {
                count++;
            }
            charFreq[c-97]++;
        }
        return count<=k;
    }    
}
