class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                int max = c.length()-1;

        for(int i = 0; i<c.length()/2; i++){
            if(c.charAt(i)!=c.charAt(max))
                return false;
            max--;
        }
        return true;
    }
}
