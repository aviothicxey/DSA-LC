class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int inColor = image[sr][sc];
        int[][]ans = image;
        int delRow[] = {-1, 0 , 1 , 0};
        int delCol[] = {0,1,0,-1};
        dfs(sr,sc,ans,image,newColor,delRow,delCol,inColor);
        return ans;
    }
    public void dfs(int sr , int sc , int[][]ans , int[][]image, int newColor , int[]delRow , int[]delCol , int inColor){
        ans[sr][sc] = newColor;
        int n = image.length;
        int m = image[0].length;
        for(int i = 0 ; i < 4 ; i++){
            int nrow = sr + delRow[i];
            int ncol = sc + delCol[i];
            if(nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && image[nrow][ncol] == inColor && ans[nrow][ncol] != newColor ){
                dfs(nrow,ncol,ans,image,newColor,delRow,delCol,inColor);
            }
        }
    }
}