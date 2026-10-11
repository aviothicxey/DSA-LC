class Solution {
    public boolean isPalindrome(int x) {
        String p = ""+x;
        int left = 0;
        int right = p.length()-1;
        while(left <= right){
            if(p.charAt(left)!= p.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
}