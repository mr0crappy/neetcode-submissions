class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ans;
        unordered_map<string, int> mp;
        for(int i = 0; i<strs.size(); i++){
            string key = getHash(strs[i]);
            if(mp.find(key)==mp.end()){
                mp[key] = ans.size();
                ans.push_back({});
            }
            ans[mp[key]].push_back(strs[i]);
        }
        return ans;
    }
    string getHash(string& s){
        string hash;
        vector<int> freq(26,0);

        for(char ch:s){
            freq[ch-'a']++;
        }
        for(int i = 0; i<26; i++){
            hash.append(to_string(freq[i]));
            hash.append("$");
        }
        return hash;
    }
};
