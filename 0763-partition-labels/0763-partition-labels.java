class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch,i);
        }
        int start = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            max = Math.max(max, map.get(ch));
            if(i==max){
                res.add(i-start+1);
                start = i+1;
            }
        }
        return res;
    }
}