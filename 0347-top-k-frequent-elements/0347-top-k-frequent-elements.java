class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int x = k;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int a = e.getValue();
            l.add(a);
        }
        Collections.sort(l);
        int j = l.size()-1;
        // HashSet<Integer> res = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        while(k>0 && j>=0){
            while(j>0 && l.get(j) == l.get(j-1)) j--;
            for(Map.Entry<Integer,Integer> e : map.entrySet()){
                if(l.get(j) == e.getValue()){
                    int b = e.getKey();
                    res.add(b);
                    k--;
                }
            }
            j--;
        }
        int[] arr = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = res.get(i);
        }
        return arr;
    }
}