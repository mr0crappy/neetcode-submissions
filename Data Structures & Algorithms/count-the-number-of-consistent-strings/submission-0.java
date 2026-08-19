class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();

        for(char c:allowed.toCharArray())
            set.add(c);

        int ans = words.length;
        for(String s:words){
            for(char c:s.toCharArray()){
                if(!set.contains(c)){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}