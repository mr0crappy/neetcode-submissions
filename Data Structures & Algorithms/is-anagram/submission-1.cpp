class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length()!=t.length())
            return false;
        unordered_map<char, int> basket;
        for(char c:s)
            basket[c]+=1;
        for(char c:t)
            basket[c]-=1;
        for(auto& x:basket){
            if(x.second!=0)
                return false;
        }
        return true;
    }
};
