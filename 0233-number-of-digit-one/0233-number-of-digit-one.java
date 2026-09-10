class Solution {
    public int countDigitOne(int n) {
        long factor = 1;
        long count = 0;

        while (factor <= n) {
            long low = n % factor;
            long cur = (n / factor) % 10;
            long high = n / (factor * 10);

            if (cur == 0) {
                count += high * factor;
            } 
            else if (cur == 1) {
                count += high * factor + low + 1;
            } 
            else {
                count += (high + 1) * factor;
            }
            factor *= 10;
        }
        return (int) count;
    }
}