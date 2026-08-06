class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String[] s = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String st = "";
        helper(digits,ans,s,st,0);
        return ans;
    }
    public void helper(String digits, List<String> ans, String[] s, String st, int idx){
        if(idx == digits.length()){
            ans.add(st);
            return;
        }
        int val = digits.charAt(idx)-'0';
        String map = s[val];
        for(int i=0;i<map.length();i++){
            helper(digits,ans,s,st+map.charAt(i),idx+1);
        }
    }
}