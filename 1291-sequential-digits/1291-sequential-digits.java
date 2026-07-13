class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String s = "123456789";
        for(int i=0;i<9;i++){
            for(int j=i+1;j<9;j++){
                String st = s.substring(i,j+1);
                int num = Integer.parseInt(st);
                if(num >= low && num <= high){
                    list.add(num);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}