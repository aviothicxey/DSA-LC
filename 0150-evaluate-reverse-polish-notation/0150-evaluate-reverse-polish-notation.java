class Solution {
    public int evalRPN(String[] token) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while(i < token.length){
            if(isToken(token[i])){
                int a = st.pop();
                int b = st.pop();
                if(token[i].equals("+")){
                    st.push(b + a);
                }
                else if (token[i].equals("-")){
                    st.push(b-a);
                }
                else if (token[i].equals("*")){
                    st.push(a * b);
                }
                else {
                    st.push(b/a);
                }
                i++;
            }else{
                st.push(Integer.parseInt(token[i]));
                i++;
            }
        }
        return st.pop();
    }
    public boolean isToken(String token){
        if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
            return true;
        }
        return false;
    }
}