class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cl = 0;
        int cr = 0;
        int cs = 0;
        for(char i : moves.toCharArray()){
            if(i == 'L')cl++;
            else if(i == 'R')cr++;
            else cs++;
        }
        if(cr == cl)return cs;
        else if(cr > cl){
            return cr+cs-cl;
        }
        else return cl+cs-cr;
    }
}