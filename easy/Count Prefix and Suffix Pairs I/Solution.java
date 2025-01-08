public class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for (int i = 0; i < words.length-1; i++) {

            for (int j = i+1; j < words.length; j++) {
                if (words[i].length()<=words[j].length() && isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                    }
                
            }
        }
        return count;
    }
    private boolean isPrefixAndSuffix(String small, String big){
        if (small.equals(big)) {
            return true;
        }
        for (int i = 0; i < small.length(); i++) {
            if (small.charAt(i)!=big.charAt(i)||small.charAt(small.length()-i-1)!=big.charAt(big.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
