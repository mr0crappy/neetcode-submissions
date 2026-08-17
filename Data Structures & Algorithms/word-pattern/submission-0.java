class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        HashMap<Character, String> cs = new HashMap<>();
        HashMap<String, Character> sc = new HashMap<>();
        if(pattern.length()!=words.length)
            return false;
        for(int i = 0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String w = words[i];

            if(cs.containsKey(c) && !cs.get(c).equals(w))
                return false;
            if(sc.containsKey(w) && !sc.get(w).equals(c))
                return false;
            
            cs.put(c,w);
            sc.put(w,c);
        }
        return true;

    }
}