
public class Solution {
    public int maxScore(String s) {
        int max =0;
        short zeoresCount=0;
        short onesCount=0;
        for (char c : s.toCharArray()) {
            if (c=='1') {
                onesCount++;
            }
        }


        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)=='0') {
                zeoresCount++;
            }
            else{
                onesCount--;
            }
            max=Math.max(zeoresCount+onesCount, max);
        }
        return max;
    } 
    
}
