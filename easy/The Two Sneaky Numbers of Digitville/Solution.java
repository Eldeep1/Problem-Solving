
public class Solution {

    public int[] getSneakyNumbers(int[] nums) {
     int [] output = new int[2];
     int current=0;
    //  [0,1,1,0]

     for (int i = 0; i < nums.length-1; i++) {
        for (int j = i+1; j < nums.length; j++) {
            if (nums[i]==nums[j]) {
                output[current]=nums[i];
                current++;
                if (current==2) {
                    return output;
                }
                break;
            }
        }
     }
     return output;
    }
}