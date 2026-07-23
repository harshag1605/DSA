class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(n,res, "", 0,0);
        return res;
    }

    public void helper(int n, List<String> res, String s, int open, int close){
        if(open == n && close == n){
            res.add(s);
            return;
        }
        if(open < n){
            helper(n,res,s+"(",open+1,close);
        }
        if(close < open){
            helper(n,res,s+")",open,close+1);
        }
    }
}