class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:chars.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);
        
        int res = 0;
        for(String word:words){
            Map<Character, Integer> cur = new HashMap<>();
            boolean good = true;
            for(char c:word.toCharArray()){
                cur.put(c,cur.getOrDefault(c,0)+1);
                if(cur.get(c)>map.getOrDefault(c,0)){
                    good = false;
                    break;
                }
            }
            if(good)
                res+=word.length();
        }
        return res; 
    }
}