class Solution {
    public boolean judgeCircle(String moves) {
        int h = 0;
        int v = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'R')h++;
            else if(ch == 'L')h--;
            else if(ch == 'U')v--;
            else v++;
        }
        return (v == 0 && h == 0);
    }
}