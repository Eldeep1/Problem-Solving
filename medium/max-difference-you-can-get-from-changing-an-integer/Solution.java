
class Solution {

    public int maxDiff(int num) {

        String numString = String.valueOf(num);
        int count = 0;
        int num1;
        int num2;
        char[] nums = numString.toCharArray();
        char latestDigit = numString.charAt(0);

        if (latestDigit == '9') {
            for (int i = 1; i < numString.length(); i++) {
                if (numString.charAt(i) == latestDigit) {
                    count++;
                } else {
                    break;
                }
            }
            num1 = changeOccurenceOfChar(nums, count + 1, '9');
            num2 = changeOccurenceOfChar(nums, 0, '1');
        } else if (latestDigit == '1') {
            for (int i = 1; i < numString.length(); i++) {
                if (numString.charAt(i) == latestDigit || numString.charAt(i) == '0') {
                    count++;
                } else {
                    break;
                }
            }

            num1 = changeOccurenceOfChar(nums, 0, '9');
            num2 = changeOccurenceOfChar(nums, count + 1, '0');
        } else {
            num1 = changeOccurenceOfChar(nums, 0, '9');
            num2 = changeOccurenceOfChar(nums, 0, '1');

        }

        return num1 - num2;
    }

    private int changeOccurenceOfChar(char[] nums, int count, char newChar) {
        if (count == nums.length) {
            count--;
        }
        char toChange = nums[count];
        if (toChange == '1' && newChar == '0') {
            return Integer.parseInt(new String(nums));
        }
        char[] newNums = new char[nums.length];
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == toChange) {
                newNums[i] = newChar;
            } else {
                newNums[i] = nums[i];
            }
        }
        return Integer.parseInt(new String(newNums));
    }
}
