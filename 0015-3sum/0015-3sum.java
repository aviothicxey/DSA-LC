class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
         for(int i = 0 ; i < n-2 ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int lp = i+1;
            int rp= n-1;
            while(lp < rp){
                int sum = nums[i] + nums[lp] + nums[rp];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[lp],nums[rp]));
                
                while(lp < rp && nums[lp] == nums[lp + 1]){
                    lp++;
                }
                while(lp < rp && nums[rp] == nums[rp-1]){
                    rp--;
                }
                lp++;
                rp--;
                }else if(sum <0){
                    lp++;
                }else{
                    rp--;
                }

            }
         }
         return ans;
    }
}