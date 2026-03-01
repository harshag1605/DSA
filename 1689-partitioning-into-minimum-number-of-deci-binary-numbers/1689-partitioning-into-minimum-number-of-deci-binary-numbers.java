class Solution {
    public int minPartitions(String n) {
        int minNum = 0;

        for(char c : n.toCharArray()){
            minNum = Math.max(minNum, c-'0');
        }
        return minNum;
    }
}