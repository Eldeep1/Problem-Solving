class FasterSolution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        int i =0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j]>nums[i]) {
                max=Math.max(max, nums[j]-nums[i]);
            }
            else{
                i=j;
            }   
        }
        return max==0?-1:max;
    }
}