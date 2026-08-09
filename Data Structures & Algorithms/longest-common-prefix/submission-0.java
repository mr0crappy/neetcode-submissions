class Solution {
    public String longestCommonPrefix(String[] strs) {
        String x = strs[0];
        for(String str:strs){
            while(!str.startsWith(x)){
                x = x.substring(0, x.length()-1);

                if(x.length()==0)
                    return "";
            }
        }
        return x;
    }
}