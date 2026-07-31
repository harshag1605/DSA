class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int n = map.size();
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> Integer.compare(b.getValue(),a.getValue()));

        int press = 1;
        int idx = 0;
        int ans = 0;

        for(Map.Entry<Character,Integer> e : list){
            ans += press * e.getValue();
            idx++;
            if(idx%8 == 0) press++;
        }
        return ans;
    }
}