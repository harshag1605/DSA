class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            while (!st.isEmpty() && st.peek() <= num) {
                st.pop();
            }

            map.put(num, st.isEmpty() ? -1 : st.peek());

            st.push(num);
        }

        // Build answer for nums1 using the map
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}