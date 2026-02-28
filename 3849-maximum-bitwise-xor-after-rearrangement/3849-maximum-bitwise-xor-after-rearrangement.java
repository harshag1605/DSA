class Solution {
    public String maximumXor(String s, String t) {
        StringBuilder sb = new StringBuilder(t);
        int c1 = 0;
        int c0 = 0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == '1')c1++;
            else c0++;
        }
        String res = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1' && c0 > 0){
                res += '0';
                c0--;
            }
            else if(s.charAt(i) == '0' && c1 > 0){
                res += '1';
                c1--;
            }
            else{
                if(c1 > 0) res += '1';
                else res += '0';
            }
        }
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(res.charAt(i) == s.charAt(i)){
                ans += '0';
            }
            else ans += '1';
        }
        return ans;
    }
}