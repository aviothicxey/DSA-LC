class Solution {
    public boolean checkDivisibility(int x) {
        int sum = 0;
        int dsum=0;
        int dpro =1;
        int n = x;
        while(n!=0){
            int d = n % 10;
            dsum += d;
            dpro *= d;
            n=n/10;
        }

        sum = dsum + dpro;

        if(x % sum == 0){
            return true;
        }else{
            return false;
        }

    }
}