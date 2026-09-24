class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int ans = -1;
        for(int i = 0 ; i <n ;i++){
            if(i == sumOfDigits(nums[i])){
                ans=i;
                break;
            }
        }
        return ans;
    }
    public int sumOfDigits(int num){
        if(num == 0)return 0;
        int res=0;
        while(num!=0){
        int digit = num % 10;
        res = digit + res;
        num=num/10;
        }
        return res;

    }
}