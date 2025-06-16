class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        for (int i = nums.length-1; i >0; i--) {
            int rightNum=nums[i];
            for (int j = 0; j < i; j++) {
                int leftNum=nums[j];
                max=Math.max(max, rightNum-leftNum);
            }
            
        }
        return max==0?-1:max;
    }
}