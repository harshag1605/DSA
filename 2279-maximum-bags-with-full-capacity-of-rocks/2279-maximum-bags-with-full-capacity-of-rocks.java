class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int need[] = new int[n];
        for(int i=0;i<n;i++){
            need[i] = capacity[i]-rocks[i];
        }

        Arrays.sort(need);
        int full = 0;
        for(int i=0;i<n;i++){
            if(need[i] == 0){
                full++;
            }
            else if(additionalRocks >= need[i]){
                additionalRocks -= need[i];
                full++;
            }
            else{
                break;
            }
        }
        return full;
    }
}