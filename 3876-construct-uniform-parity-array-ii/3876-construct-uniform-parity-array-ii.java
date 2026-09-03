class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int odd = 0;
        int even = 0;
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(nums1[i] % 2 == 0){
                even++;
                minEven = Math.min(minEven,nums1[i]);
            }
            else{
                odd++;
                minOdd = Math.min(minOdd,nums1[i]);
            }
        }

        if(even == n || odd == n){
            return true;
        }
        if(minEven < minOdd){
            return false;
        }
        else{
            return true;
        }
    }
}