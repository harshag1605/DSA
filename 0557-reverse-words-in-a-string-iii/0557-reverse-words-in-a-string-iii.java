class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String ch = arr[i];
            int j=ch.length()-1;
            while(j>=0){
                sb.append(ch.charAt(j));
                j--;
            }
            if(i < arr.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}