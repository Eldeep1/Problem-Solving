class Solution {
    public int countServers(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[] rowFreq = new int[m];
        int[] columnFreq = new int[n];
        
        // Count servers in each row and column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowFreq[i]++;
                    columnFreq[j]++;
                }
            }
        }

        // Count the servers that can communicate (those in rows or columns with more than one server)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && (rowFreq[i] > 1 || columnFreq[j] > 1)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
