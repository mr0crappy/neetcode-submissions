class Solution {

    static String getHash(String s){
        StringBuilder hash = new StringBuilder();
        int[] freq = new int[26];

        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i = 0; i<26; i++){
            hash.append(freq[i]);
            hash.append("$");
        }
        return hash.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i<strs.length; i++){
            String key = getHash(strs[i]);

            if(!map.containsKey(key)){
                map.put(key, ans.size());
                ans.add(new ArrayList<>());
            }
            ans.get(map.get(key)).add(strs[i]);
        } 
        return ans;
    }
}
