class Solution {
    public int countPrimes(int n) {
        if(n<= 1)return 0;
        int cnt =0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);

        for(int i = 2 ; i*i <n;i++){
            if(isPrime[i] == true){
                for(int j = i * i ; j < n ;j += i){
                    if(isPrime[j] == true){
                        isPrime[j] = false;
                    }
                }
            }
        }
        for(int i = 2 ; i < n ;i++){
            if(isPrime[i]==true)cnt++;
        }
        return cnt;
    }
}