package easy.apply_operations_to_an_array;

public class Solution {

    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int pointer = 0;

        for (int i = 0; i < len ; i++) {
            if(i==len-1 && nums[len-1] != 0) {
                    result[pointer] = nums[len-1];
                    break;
                }
            

            if (nums[i] == 0) {
                continue;
            }
            if (nums[i] == nums[i + 1]) {
                result[pointer] = nums[i] * 2;
                i++;
            }

            else {
                result[pointer] = nums[i];
            }
            pointer++;
        }


        return result;
    }
}
