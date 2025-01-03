package medium.Number_of_Ways_to_Split_Array;

public class Solution {
    public int waysToSplitArray(int[] nums) {
        int validSplits=0;
        int n =nums.length;
        long[] leftSum=new long[n];
       
        long[] rightSum=new long[n];
   
        leftSum[0]=nums[0];
        rightSum[n-1]=nums[n-1];
        
        for (int i = 1; i < n-1; i++) {
           leftSum[i]=leftSum[i-1]+nums[i];
           rightSum[n-i-1]=rightSum[n-i]+nums[n-i-1];
        }
   
        for (int i = 0; i < n-1; i++) {
           if (leftSum[i]>=rightSum[i+1]) {
               validSplits++;
           }
        }
        return validSplits;
       }
}
