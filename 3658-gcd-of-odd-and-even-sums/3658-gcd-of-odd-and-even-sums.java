class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 0;
        int even = 0;
        for(int i=1;i<=n*2;i++){
            if(i%2 == 0) even += i;
            else odd += i;
        }
        return gcd(odd,even);
    }
    public int gcd(int odd, int even){
        while(odd != 0){
            int temp = odd;
            odd = even%odd;
            even = temp;
        }
        return even;
    }
}