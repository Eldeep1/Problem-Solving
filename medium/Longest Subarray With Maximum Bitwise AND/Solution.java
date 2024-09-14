public class Solution {
    public int longestSubarray(int[] nums) {
     
        int counter=1;
        int tmp=0;
        int highest=0;

        for (int i = 0; i < nums.length; i++) {
            if (highest==nums[i]) {
                tmp++;
            }
            else if (nums[i]>highest) {
                highest=nums[i];
                tmp=1;
                if (i==nums.length-1) {
                    return 1;
                }
            }
            else{
                if (tmp>counter) {
                    counter=tmp;
                }
                    tmp=0;

            }
            
        }    
        if (tmp>counter) {
            return tmp;
        }
        return counter;
    }    
}