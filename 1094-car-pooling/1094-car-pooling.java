class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = trips.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(trips[i][2] > max){
                max = trips[i][2];
            }
        }
        int[] arr = new int[max+1];
        for(int i=0;i<n;i++){
            int x = trips[i][1];
            int y = trips[i][2];
            int z = trips[i][0];
            for(int j=x;j<y;j++){
                arr[j] += z;
                if(arr[j] > capacity) return false;
            }
        }
        return true;
    }
}