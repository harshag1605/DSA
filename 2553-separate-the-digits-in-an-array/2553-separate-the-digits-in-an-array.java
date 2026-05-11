class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            while(nums[i] != 0){
                // ans.add(nums[i]%10);
                temp.add(nums[i]%10);
                nums[i]/=10;
            }
            // Collections.reverse(temp);
            for(int j=temp.size()-1;j>=0;j--){
                ans.add(temp.get(j));
            }
        }
        int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}