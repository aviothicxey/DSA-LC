class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        int l = 0;
        int r = m*n-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            int val = mat[mid/m][mid%m];
            if(val==target) return true;
            if(val > target) r=mid-1;
            else l=mid+1;
        }
        return false;
    }
}