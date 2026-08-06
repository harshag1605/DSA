class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String[] s = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb = new StringBuilder();
        helper(digits,ans,s,sb,0);
        return ans;
    }
    public void helper(String digits, List<String> ans, String[] s, StringBuilder sb, int idx){
        if(idx == digits.length()){
            ans.add(sb.toString());
            return;
        }
        int val = digits.charAt(idx)-'0';
        String map = s[val];
        for(int i=0;i<map.length();i++){
            sb.append(map.charAt(i));
            helper(digits,ans,s,sb,idx+1);

            sb.deleteCharAt(sb.length()-1);
        }
    }
}