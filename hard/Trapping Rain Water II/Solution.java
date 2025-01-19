class Solution {
    public int trapRainWater(int[][] heightMap) {
    if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) {
        return 0;
    }

    int rows = heightMap.length;
    int cols = heightMap[0].length;
    boolean[][] visited = new boolean[rows][cols];
    PriorityQueue<Cell> heap = new PriorityQueue<>((a, b) -> a.height - b.height);

    // Add all boundary cells to the heap
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                heap.offer(new Cell(i, j, heightMap[i][j]));
                visited[i][j] = true;
            }
        }
    }

    int waterTrapped = 0;
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // Right, Left, Down, Up

    // Process cells in the min-heap
    while (!heap.isEmpty()) {
        Cell cell = heap.poll();

        for (int[] dir : directions) {
            int newRow = cell.row + dir[0];
            int newCol = cell.col + dir[1];

            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && !visited[newRow][newCol]) {
                // Calculate water trapped
                waterTrapped += Math.max(0, cell.height - heightMap[newRow][newCol]);

                // Add the neighbor to the heap with updated height
                heap.offer(new Cell(newRow, newCol, Math.max(cell.height, heightMap[newRow][newCol])));
                visited[newRow][newCol] = true;
            }
        }
    }

    return waterTrapped;
}

// Helper class to represent a cell in the matrix
private static class Cell {
    int row, col, height;

    public Cell(int row, int col, int height) {
        this.row = row;
        this.col = col;
        this.height = height;
    }
}

}