class Solution {
    public int maximum69Number (int num) {
        //string se array me convert kiya hai
        char digits[] = String.valueOf(num).toCharArray(); 
        for(int i=0;i<digits.length;i++){
            if(digits[i] == '6'){
                digits[i] = '9';
                break;
            }
        }
        // array ko string me convert krne k baad integer me convert kiya hai
        return Integer.parseInt(new String(digits)); 
    }
}