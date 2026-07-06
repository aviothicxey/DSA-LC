class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int can1 = 0;
        int can2 = 0;
        int cnt1= 0;
        int cnt2 =0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == can1){
                cnt1++;
            }else if(nums[i] == can2){
                cnt2++;
            }else if(cnt1 == 0){
                can1 = nums[i];
                cnt1 += 1;
            }else if(cnt2 == 0){
                can2 = nums[i];
                cnt2 += 1;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i = 0 ; i <nums.length ; i++){
            if(nums[i] == can1){
                cnt1++;
            }
            else if(nums[i] == can2){
                cnt2++;
            }
        }
        if(cnt1 > nums.length/3) ans.add(can1);
        if(cnt2 > nums.length /3) ans.add(can2);
        return ans;
    }
}