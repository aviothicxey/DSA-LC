class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int currnum = nums[i];
            map.put(currnum , map.getOrDefault(currnum , 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(a) - map.get(b));
        for(int key : map.keySet()){
            pq.offer(key);
            if(pq.size() > k){
                pq.poll();
            }
        }
        for(int i = 0 ; i < k ;i++){
            arr[i] = pq.poll();
        }
        return arr;
    }
}