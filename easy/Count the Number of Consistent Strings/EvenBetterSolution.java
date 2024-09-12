class EvenBetterSolution {
    public int countConsistentStrings(String allowed, String[] words) {
        int allowedMask = 0;
        for (char c : allowed.toCharArray()) {
            allowedMask |= (1 << (c - 'a')); // Set the bit for the character in the mask
        }

        int ans = 0;
        for (String w : words) {
            if (check(w, allowedMask)) {
                ++ans;
            }
        }
        return ans;
    }

    private boolean check(String w, int allowedMask) {
        for (int i = 0; i < w.length(); ++i) {
            if ((allowedMask & (1 << (w.charAt(i) - 'a'))) == 0) { // Check if the bit for the character is set
                return false;
            }
        }
        return true;
    }
}
