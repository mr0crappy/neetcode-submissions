class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = -1;
        
        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                ans = Math.max(ans, i-map.get(s.charAt(i))-1);
            }
            else{
                map.put(s.charAt(i), i);
            }
        }
        return ans;
    }
}