class Solution {
    public int maxProduct(int[] arr) {
        int maxp= arr[0];
        int minp = arr[0];
        int ans= arr[0];
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i]<0){
                int tmp = maxp;
                maxp=minp;
                minp = tmp;
            }
            maxp=Math.max(arr[i],maxp*arr[i]);
            minp=Math.min(arr[i],minp*arr[i]);
            ans=Math.max(ans,maxp);
        }
        return ans;
    }
}