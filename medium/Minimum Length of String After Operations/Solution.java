class Solution {
    public int minimumLength(String s) {
        int minLength=s.length();
        int [] charFreq= new int[26];
        for (int i = 0; i < s.length(); i++) {
            charFreq[s.charAt(i)-'a']++;
            if (charFreq[s.charAt(i)-'a']>1&&charFreq[s.charAt(i)-'a']%2==1) {
                charFreq[s.charAt(i)-'a']-=2;
                minLength-=2;
            }
        } 
        return minLength;
    }
}