class Solution {
    public int maxScore(String s) {
        int cl = 0;
        int cr = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1')cr++;
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == '0')cl++;
            else cr--;
            sum = cl+cr;
            max = Math.max(sum,max);
        }
        return max;
    }
}