class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> map = new HashMap<>();

        for(String s:words){
            for(char c:s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }
        for(int cnt:map.values()){
            if(cnt%words.length !=0)
                return false;
        }
        return true;
    }
}