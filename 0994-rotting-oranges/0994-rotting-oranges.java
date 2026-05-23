class Pair {
    int row;
    int col;
    int time;

    Pair(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {

    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j, 0));
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        
        int[] drow = { 0, 1, 0, -1 };
        int[] dcol = { -1, 0, 1, 0 };
        int cnt = 0;
        int minutes = 0;
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int r = curr.row;
            int c = curr.col;
            int t = curr.time;  
            minutes = Math.max(minutes, t); 
            for(int i = 0 ; i < 4 ; i++ ){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];

                if(nrow >= 0 && nrow < row && ncol >=0 && ncol < col && grid[nrow][ncol] == 1)
                {
                    grid[nrow][ncol] = 2;
                    cnt++;
                    q.offer(new Pair(nrow, ncol, t + 1));
                }
            }
        }
       return cnt == fresh ? minutes : -1;
    }
}