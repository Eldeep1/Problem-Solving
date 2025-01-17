class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int res=derived[0];
        for (int i = 1; i < derived.length; i++) {
            res^=derived[i];
        }
        return res==0;
    }
}