class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max = 0;
        int c = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
                c++;
            }
            else if(ch == ')'){
                st.pop();
                c--;
            }
            max = Math.max(max,c);
        }
        return max;
    }
}