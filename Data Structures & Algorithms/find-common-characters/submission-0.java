class Solution {
    public List<String> commonChars(String[] words) {
        int cnt[] = new int[26];
        Arrays.fill(cnt, Integer.MAX_VALUE);
        for(String s:words){
            int curcnt[] = new int[26];
            for(char c:s.toCharArray()){
                curcnt[c-'a']++;
            }

            for (int i = 0; i < 26; i++) {
                cnt[i] = Math.min(cnt[i], curcnt[i]);
            }
            
        }


        List<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                res.add(String.valueOf((char) (i + 'a')));
            }
        }

        return res;
    }
}