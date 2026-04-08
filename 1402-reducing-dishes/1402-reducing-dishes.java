class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum = 0;
            int idx = 1;
            for(int j=i;j<n;j++){
                sum += (idx) * satisfaction[j];
                idx++;
            }
            max = Math.max(sum,max);
        }
        return max>=0 ? max:0;
    }
}