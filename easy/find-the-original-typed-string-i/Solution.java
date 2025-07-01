class Solution {
    public int possibleStringCount(String word) {
        int count = 1;
        boolean[] freqChars = new boolean[26];
        char prevChar = word.charAt(0);
        for (char c : word.toCharArray()) {
            if (freqChars[c - 'a']) {
                if (prevChar == c) {
                    count++;
                }

                prevChar = c;

                continue;
            }
            prevChar = c;
            freqChars[c - 'a'] = true;
        }

        return count;
    }
}