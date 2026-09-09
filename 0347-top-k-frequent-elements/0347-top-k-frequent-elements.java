class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> cnt = new HashMap<>();
        List<Integer>[]freq = new List[nums.length + 1];

        for(int i = 0 ; i < freq.length;i++){
            freq[i] = new ArrayList<>();
        }
        for(int n : nums){
            cnt.put(n,cnt.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : cnt.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int ind =0;
        for(int i = freq.length -1 ; i>0 && ind < k ; i--){
            for (int n : freq[i]) {
                res[ind++] = n;
                if (ind == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
