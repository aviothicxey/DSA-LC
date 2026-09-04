class Solution {
    public int firstStableIndex(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {

            int maxi = max(nums, 0, i);
            int min = min(nums, i, nums.length - 1);

            if (maxi - min <= k) {
                return i;
            }
        }

        return -1;
    }

    int max(int[] nums, int start, int end) {
        int maxi = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        return maxi;
    }

    int min(int[] nums, int start, int end) {
        int mini = Integer.MAX_VALUE;

        for (int i = start; i <= end; i++) {
            mini = Math.min(mini, nums[i]);
        }

        return mini;
    }
}