class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long right = (long) 1e14;

        long ans = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (canComplete(time, mid, totalTrips)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
    private boolean canComplete(int[] time, long givenTime, int totalTrips) {
        long trips = 0;

        for (int t : time) {
            trips += givenTime / t;
            if (trips >= totalTrips) return true;
        }

        return trips >= totalTrips;
    }
}