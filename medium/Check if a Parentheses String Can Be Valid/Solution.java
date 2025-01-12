class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 == 1) {
            return false; // Odd length strings cannot be valid
        }

        // Left-to-right pass
        int openBalance = 0;
        int unlocked = 0;
        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '0') {
                unlocked++;
            } else if (s.charAt(i) == '(') {
                openBalance++;
            } else { 
                openBalance--;
            }
            if (openBalance < 0) {

                if (unlocked > 0) {
                    unlocked--;
                    openBalance++;
                } else {
                    return false; 
                }
            }
        }

        // Right-to-left pass
        int closeBalance = 0;
        unlocked = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0') {
                unlocked++;
            } else if (s.charAt(i) == ')') {
                closeBalance++;
            } else { 
                closeBalance--;
            }
            if (closeBalance < 0) {
                
                if (unlocked > 0) {
                    unlocked--;
                    closeBalance++;
                } else {
                    return false; 
                }
            }
        }

        return true; 
    }
}
