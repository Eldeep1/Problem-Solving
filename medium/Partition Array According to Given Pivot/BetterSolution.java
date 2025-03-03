
public class BetterSolution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int equalCount = 0;

        // First pass: Count occurrences of pivot and place smaller elements
        for (int num : nums) {
            if (num < pivot) {
                result[left++] = num;
            } else if (num == pivot) {
                equalCount++;
            }
        }

        // Fill pivot occurrences
        for (int i = 0; i < equalCount; i++) {
            result[left++] = pivot;
        }

        // Second pass: Place larger elements
        for (int num : nums) {
            if (num > pivot) {
                result[left++] = num;
            }
        }

        return result;
    }
}
