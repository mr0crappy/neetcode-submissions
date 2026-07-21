class Solution {
    public boolean isAnagram(String s, String t) {
        int test[] = new int[26];
        if(s.length()!=t.length()) return false;
        for(int i = 0; i<s.length(); i++){
            test[s.charAt(i)-'a']++;
            test[t.charAt(i)-'a']--;
        }
        for(int i = 0; i<test.length; i++){
            if(test[i]!=0)
            return false;
        }
        return true;
    }
}
