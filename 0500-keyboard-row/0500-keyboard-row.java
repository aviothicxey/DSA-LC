class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiopQWERTYUIOP";
        String row2= "asdfghjklASDFGHJKL";
        String row3="zxcvbnmZXCVBNM";
        ArrayList<String>ans= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(check(row1,words[i])||check(row2,words[i])||check(row3,words[i])){
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);


        
        
    }
    public boolean check(String row,String word){
        for(char ch:word.toCharArray())
        {
            if(row.indexOf(ch)==-1){
                return false;
            }
            
        }
        return true;
    }
}