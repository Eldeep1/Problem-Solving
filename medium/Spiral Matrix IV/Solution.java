
import data_structures.ListNode;


public class Solution {

    private int[][] result;
    private ListNode head;
    private int height;
    private int width;


    public int[][] spiralMatrix(int m, int n, ListNode head) {
        this.result = new int[m][n];
        this.height = m;
        this.width = n;
        this.head = head;

        initiateMatrix();

        moving();

        return result;
    }

    private void initiateMatrix() {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = -1;
            }
        }
    }

    private void moving() {
        int top = 0, bottom = height - 1;
        int left = 0, right = width - 1;

        while (top <= bottom && left <= right) {
            // Move right
            for (int i = left; i <= right && head != null; i++) {
                result[top][i] = head.val;
                head = head.next;
            }
            top++;

            // Move down
            for (int i = top; i <= bottom && head != null; i++) {
                result[i][right] = head.val;
                head = head.next;
            }
            right--;

            // Move left
            for (int i = right; i >= left && head != null; i--) {
                result[bottom][i] = head.val;
                head = head.next;
            }
            bottom--;

            // Move up
            for (int i = bottom; i >= top && head != null; i--) {
                result[i][left] = head.val;
                head = head.next;
            }
            left++;
        }
    }
}
