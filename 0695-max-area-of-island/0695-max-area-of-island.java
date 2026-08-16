class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0 ;
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];

        for(int i = 0 ;i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j]== 1 && vis[i][j] != 1){
                    maxArea = Math.max(maxArea,dfs(i , j , vis , grid,n,m));
                }
            }
        }
        return maxArea;
        
    }
    int dfs(int row , int col , int[][]vis , int[][]grid , int n , int m ){
        vis[row][col] = 1;

        int[]drow = {-1,0,1,0};
        int[]dcol= {0,1,0,-1};
        
        int area = 1;

        for(int i = 0 ; i < 4 ; i++){
            int nrow = row + drow[i];
            int ncol = col + dcol[i];

            if(nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && grid[nrow][ncol] == 1 && vis[nrow][ncol] != 1 ){
                area += dfs(nrow , ncol , vis , grid , n , m );
            }
        }
        return area;
    }
}
