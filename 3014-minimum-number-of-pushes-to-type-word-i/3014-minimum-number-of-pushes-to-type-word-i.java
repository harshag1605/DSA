class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n<=8)return n;
        int count = 0;
        int press = 1;
        while(n > 0){
            if(n<=8){
                count += press * n;
                n /= 8;
                break;
            }
            count += press * 8;
            press++;
            n -= 8;
        }
        return count;
    }
}