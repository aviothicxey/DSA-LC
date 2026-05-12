class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)return 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int n : set){
            if(!set.contains(n-1)){
                int curr = n;
                int cnt = 1;
                while(set.contains(curr+1)){
                    curr++;
                    cnt++;
                }
                longest = Math.max(cnt , longest);
            }
            
        }
        return longest;
    }
}