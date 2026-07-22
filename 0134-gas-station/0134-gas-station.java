class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int sumg = 0;
        int sumc = 0;
        for(int i=0;i<n;i++){
            sumg += gas[i];
            sumc += cost[i];
        }
        if(sumg < sumc) return -1;

        int cf = 0;
        int st = 0;
        for(int i=0;i<n;i++){
            cf += gas[i]-cost[i];
            if(cf < 0){
                st = i+1;
                cf = 0;
            }
        }
        return st;
    }
}