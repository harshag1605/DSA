class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n = reward2.length;
        int sum = 0;
        for(int i=0;i<n;i++) sum += reward2[i];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b-a));
        for(int i=0;i<n;i++){
            pq.add(reward1[i]-reward2[i]);
        }
        for(int i=0;i<k;i++){
            int x = pq.poll();
            sum += x;
        }
        return sum;
    }
}