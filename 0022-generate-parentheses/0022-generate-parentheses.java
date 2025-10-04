class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String s = "";
        parentheses(res,s,0,0,n);
        return res;

    }
    public static void parentheses(List<String> res,String s,int left,int right,int n){
        if(left == n && right == n){
            res.add(s);
            return;
        }
        // include left
        // agr left wala n se km h to strt left se pick krne se krnege 
        if(left < n){
            parentheses(res,s+"(",left+1,right,n);
        }

        // include right
        //agr right mere left se km h to right bracket lgna hoga
        if(right<left){
            parentheses(res,s+")",left,right+1,n);
        }

    }
}