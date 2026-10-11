class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = Math.abs(arr[1] - arr[0]);
        int i = 0 ;
        int j = 1;
        while(j != arr.length){
            if(Math.abs(arr[j] - arr[i]) != diff){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}