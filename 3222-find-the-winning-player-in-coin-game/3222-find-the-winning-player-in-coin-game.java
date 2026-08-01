class Solution {
    public String winningPlayer(int x, int y) {
        int a = y/4;
        int ans = Math.min(a,x);
        if(ans%2 == 1){
            return "Alice";
        }
        else{
            return "Bob";
        }
    }
}