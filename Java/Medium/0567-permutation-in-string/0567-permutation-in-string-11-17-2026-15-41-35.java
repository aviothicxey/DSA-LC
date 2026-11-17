class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[]freq = new int[26];
        for(int i =0 ; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }
        int winSize = s1.length();
        for(int i =0 ; i < s2.length(); i++){
            int winidx = 0;
            int idx = i;
            int[]freq2 = new int[26];
            while(winidx < winSize && idx < s2.length()){
            freq2[s2.charAt(idx) - 'a']++;
            winidx++;
            idx++;
            }
            if(Arrays.equals(freq , freq2)){
                return true;
            }
        }
        return false;
        
    }
}