class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int ans = Integer.MAX_VALUE;
        for (ArrayList<Integer> list : map.values()) {
            for (int i = 0; i <= list.size() - 3; i++) {
                int a = list.get(i);
                int c = list.get(i + 2);

                ans = Math.min(ans, 2 * (c - a));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}