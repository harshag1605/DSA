class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int n = chars.length;
        if(n==1) return 1;
        char idx = chars[0];
        // sb.append(idx);
        int c = 0;
        for(int i=0;i<n;i++){
            if(chars[i] == idx) c++;
            else{
                sb.append(idx);
                if(c>1){
                    sb.append(c);
                }
                idx = chars[i];
                c = 1;
            }
        }
        sb.append(idx);
        if(c > 1){
            sb.append(c);
        }
        for(int i=0;i<sb.length();i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}