class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        for(char ch : word.toCharArray()){
            int x = 'a'-ch;
            if(x > 0){
                int y = ch-'A';
                upper[y] = true;
            }
            else{
                int z = ch-'a';
                lower[z] = true;
            }
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(upper[i] == true && lower[i] == true)count++;
        }
        return count;
    }
}