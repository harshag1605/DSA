class Solution {
    public int binaryGap(int n) {
        String binary = "";
        int max = 0;
        while(n != 0){
            int rem = n%2;
            binary += rem;
            n /= 2;
        }
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i) == '0')continue;
            for(int j=i+1;j<binary.length();j++){
                if(binary.charAt(i) == '1' && binary.charAt(j) == '1'){
                    max = Math.max(max,j-i);
                    break;
                }
            }
        }
        return max;
    }
}