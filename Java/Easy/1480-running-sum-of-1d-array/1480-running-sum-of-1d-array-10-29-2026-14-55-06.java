class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] out = new int[n];

        out[0] = nums[0];
        for(int i =1 ; i < n ;i++){
            out[i] = nums[i] + out[i-1];
        }
        return out;
    }
}