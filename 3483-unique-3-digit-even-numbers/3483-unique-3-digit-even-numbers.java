class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for(int i : digits){
            freq[i]++;
        }
        int cnt = 0;
        

        for(int i=100;i<=999;i+=2){
            int n = i;
            int a = n%10;
            n/=10;
            int b = n%10;
            n/=10;
            int c = n%10;

            int[] need = new int[10];
            need[a]++;
            need[b]++;
            need[c]++;
            boolean flag = true;

            for(int j=0;j<10;j++){
                if(need[j] > freq[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                cnt++;
            }
        }
        return cnt;
    }
}