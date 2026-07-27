class Solution {
    long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans = (power(5, even) * power(4, odd)) % MOD;
        return (int) ans;
    }
    public long power(long x , long y){
        if(y == 0)return 1;
        long half = power(x , y/2);
        long result = (half * half) % MOD;

        if(y % 2 == 1){
            result = (result * x) % MOD; 
        }
        return result;
    }
}