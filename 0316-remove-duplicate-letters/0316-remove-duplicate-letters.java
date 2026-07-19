class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int idx = (int)ch-'a';
            freq[idx]++;
        }
        boolean[] flag = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            freq[ch-'a']--;
            if(flag[ch-'a']) continue;
            while(!st.isEmpty() && st.peek() > ch && freq[st.peek()-'a'] > 0){
                flag[st.pop()-'a'] = false;
            }
            st.push(ch);
            flag[ch-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}