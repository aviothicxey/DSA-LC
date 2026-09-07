class Solution {
    public int candy(int[] ratings) {
        int[]candies = new int[ratings.length];
        for(int i = 0 ; i < candies.length ;i++){
            candies[i] =1;
        }
        for(int i = 1 ; i < ratings.length ;i++){
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1]+1;
            }else{
                continue;
            }
        }

        for(int i = ratings.length -1 ; i >= 1 ;i--){
            if(ratings[i-1]>ratings[i]){
                candies[i-1] = Math.max(candies[i-1] , candies[i]+1);
            }else{
                continue;
            }
        }
        int sum = 0;
        for(int i : candies){
            sum += i;
        }
        return sum;
    }
}