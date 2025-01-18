
import java.util.*;

class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] directions = {
            {0, 1},  // Right
            {0, -1}, // Left
            {1, 0},  // Down
            {-1, 0}  // Up
        };

        int[][] costs = new int[m][n];
        for (int[] row : costs) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        costs[0][0] = 0;

        Deque<int[]> deque = new ArrayDeque<>();
        deque.offerFirst(new int[]{0, 0, 0}); // {cost, x, y}

        while (!deque.isEmpty()) {
            int[] curr = deque.pollFirst();
            int cost = curr[0], x = curr[1], y = curr[2];

            if (cost > costs[x][y]) continue;

            for (int d = 0; d < 4; d++) {
                int nx = x + directions[d][0];
                int ny = y + directions[d][1];

                int newCost = cost + (d + 1 != grid[x][y] ? 1 : 0);

                if (nx >= 0 && nx < m && ny >= 0 && ny < n && newCost < costs[nx][ny]) {
                    costs[nx][ny] = newCost;
                    if (d + 1 == grid[x][y]) {
                        deque.offerFirst(new int[]{newCost, nx, ny}); // 0-cost move
                    } else {
                        deque.offerLast(new int[]{newCost, nx, ny}); // 1-cost move
                    }
                }
            }
        }

        return costs[m - 1][n - 1];
    }
}