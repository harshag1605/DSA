class Solution {
    public long maximumValue(int n, int s, int m) {
        long num = s;
        if(n == 1) return num;
        if(n == 2) return num+m;
        long sub = (n-1)/2;
        long add = n-1-sub;
        num += (add*m) - sub;
        if((n-1)%2 == 1){
            return num;
        }
        else{
            return num+1;
        }
    }
}