public class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long totalTop = 0; // Total points in the top row

        // Calculate the total points in the top row
        for (int i = 0; i < n; i++) {
            totalTop += grid[0][i];
        }

        long result = Long.MAX_VALUE;
        long bottomCollected = 0; // Points collected in the bottom row by Robot 1

        // Simulate Robot 1's strategy
        for (int i = 0; i < n; i++) {
            // Robot 1 moves to column i
            totalTop -= grid[0][i]; // Points remaining in the top row after column i
            long robot2Points = Math.max(totalTop, bottomCollected); // Robot 2's maximum points
            result = Math.min(result, robot2Points); // Minimize Robot 2's maximum points
            bottomCollected += grid[1][i]; // Add current column's points to bottomCollected
        }

        return result;
    }
}
