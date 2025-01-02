package medium.Count_Vowel_Strings_in_Ranges;

public class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        int [] prefixSum= new int[words.length+1];


        for (int i = 0; i < words.length; i++) {
            if (isVowelString(words[i])) {
                prefixSum[i+1]=++prefixSum[i];
            }
            else{
                prefixSum[i+1]=prefixSum[i];
            }
        }
        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r=queries[i][1];
            ans[i]=prefixSum[r+1]-prefixSum[l];
        }
        return ans;
    }
    private boolean isVowelString(String word) {
        String vowels = "aeiou";
        return vowels.indexOf(word.charAt(0)) != -1 && vowels.indexOf(word.charAt(word.length() - 1)) != -1;
    }
}