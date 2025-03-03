import java.util.ArrayList;

public class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int pivotOccurrence=0;
        ArrayList smallerNums=new ArrayList<>();
        ArrayList bigerNums=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>pivot) {
                bigerNums.add(nums[i]);
            }
            else if (nums[i]<pivot) {
                smallerNums.add(nums[i]);
            }
            else{
                pivotOccurrence++;
            }
        }
        int[] result = new int[nums.length];

        for (int i = 0; i < pivotOccurrence; i++) {
            smallerNums.add(pivot);
        }
        for (int i = 0; i < bigerNums.size(); i++) {
            smallerNums.add(bigerNums.get(i));
        }

        for (int i = 0; i < result.length; i++) {
            result[i]=(int) smallerNums.get(i);
        }
        return result;
    }
}
