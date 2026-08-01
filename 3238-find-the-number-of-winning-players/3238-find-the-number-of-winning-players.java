class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int m = pick.length;
        int[][] freq = new int[n][11];
        for(int i=0;i<m;i++){
            int j = pick[i][0];
            int k = pick[i][1];
            freq[j][k]++;
        }
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int x=0;x<11;x++){
                if(freq[i][x] > i){ 
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}