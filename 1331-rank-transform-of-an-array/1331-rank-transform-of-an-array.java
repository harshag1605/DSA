class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        if(n==0)return arr;
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = arr[i];
        }
        Arrays.sort(arr);
        map.put(arr[0],map.getOrDefault(arr[0],1));
        int idx = 2;
        for(int i=1;i<n;i++){
            if(arr[i] != arr[i-1]){
                map.put(arr[i],map.getOrDefault(arr[i],idx));
                idx++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = map.get(nums[i]);
        }
        return arr;
    }
}