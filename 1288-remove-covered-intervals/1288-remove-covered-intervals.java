class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int c = 0;
        Arrays.sort(intervals,(a,b) -> {
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int rem = 0;
        int max = 0;
        for(int[] interval : intervals){
            if(interval[1] > max){
                rem++;
                max = interval[1];
            }
        }
        return rem;
    }
}