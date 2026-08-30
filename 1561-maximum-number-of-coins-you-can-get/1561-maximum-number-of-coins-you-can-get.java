class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int c = piles.length/3;
        int j=piles.length-2;
        while(c != 0){
            sum += piles[j];
            j -= 2;
            c--;
        }
        return sum;
    }
}