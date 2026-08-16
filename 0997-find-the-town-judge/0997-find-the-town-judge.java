class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n+1];
        for(int[]t : trust){
            int a = t[0];
            int b = t[1];
            score[a]--;
            score[b]++;
        }
        for(int p = 1 ; p <= n ; p++){
            if(score[p] == n-1)return p;
        }
        return -1;
    }
}