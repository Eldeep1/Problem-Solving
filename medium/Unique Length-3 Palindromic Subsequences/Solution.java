public class Solution {
    public int countPalindromicSubsequence(String s) {
        int count=0;
        boolean[] validateString= new boolean[26];
        for (int i = 0; i < s.length()-2; i++) {
            if(validateString[convertCharToNumber(s.charAt(i))]){
                continue;
            }
            validateString[convertCharToNumber(s.charAt(i))]=true;
            int tmpCount=0;
            boolean[] tmpValidateString= new boolean[26];
            
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(j)==s.charAt(i)) {
                    count+=tmpCount;
                    if (tmpValidateString[convertCharToNumber(s.charAt(j))]) {
                        tmpCount=0;
                    }
                    else{
                        tmpCount=1;
                        tmpValidateString[convertCharToNumber(s.charAt(j))]=true;
                    }
                }
                else{
                    if (!tmpValidateString[convertCharToNumber(s.charAt(j))]) {
                        tmpCount++;
                        tmpValidateString[convertCharToNumber(s.charAt(j))]=true;
                    }
                }
            }
        }

        return count;
        
    }

    private int convertCharToNumber(char c){
        return (c)-97;
    }
}
