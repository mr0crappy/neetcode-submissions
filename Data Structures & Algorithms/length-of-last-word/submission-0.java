class Solution {
    public int lengthOfLastWord(String s) {
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j<s.length()){
            if(s.charAt(j)==' '){
               if(i>0){
                sum = i;
                i=0;
               }
            }
            else{i++;
            }
            j++;
        }
        return i>0?i:sum;
    }
}