class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    p += 4;

                    if (i > 0 && grid[i - 1][j] == 1) { // chk up
                        p -= 2;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) { // chk left
                        p -= 2;
                    }
                }
            }
        }
        return p;
    }
}