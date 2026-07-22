class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch,i);
        }
        int count = 0;
        int max = map.get(s.charAt(0));
        for(int i=1;i<n;i++){
            char ch = s.charAt(i);
            if(max >= i){
                max = Math.max(max,map.get(ch));
            }
            else{
                max = Math.max(max,map.get(ch));
                res.add(i-count);
                count = i;
            }
        }
        res.add(n-count);
        return res;
    }
}