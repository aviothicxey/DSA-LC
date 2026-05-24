class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i <= n ;i++){
            int curr;
            if( i == n) curr = 0;
            else curr = heights[i];
            while(!st.isEmpty() && curr < heights[st.peek()]){
                int height = heights[st.pop()];
                int width;
                if(st.isEmpty()) width = i;
                else{
                    width = i - st.peek() -1;
                }
                
                int area = height * width;
                maxArea = Math.max(maxArea ,area);
            }
            st.push(i);
        }
        return maxArea;
    }
}