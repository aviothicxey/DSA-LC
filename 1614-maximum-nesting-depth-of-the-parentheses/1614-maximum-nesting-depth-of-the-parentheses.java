class Solution {
    public int maxDepth(String s) {
        int md = 0 ;
        int cd = 0 ; 
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(ch == '('){
                cd++;
                md = Math.max(md ,cd);
            }
            else if(ch == ')'){
                cd--;
            }
        }
        return md;
    }
}