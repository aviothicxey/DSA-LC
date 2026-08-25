class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }

        for(int i = 1; i <= nums.length +1 ; i++){
            int n = i * k;
            if(set.contains(n)){
                continue;
            }
            else{
                return n;
            }
        }
        return -1;
    }
}