class Solution {
public:
    int trap(vector<int>& height) {
        int l =0, r = height.size()-1;

        int ans = 0;
        vector<int> prefix(height.size());
        vector<int> suffix(height.size());
        prefix[0] = height[0];
        for(int i = 1; i<height.size(); i++){
            prefix[i] = max(prefix[i-1], height[i]);
        }
        suffix[height.size()-1] = height[height.size()-1]; 
        for(int i = height.size()-2; i>=0; i--){
            suffix[i] = max(suffix[i+1], height[i]);
        }
        for(int i = 0; i<height.size(); i++){
            ans += min(prefix[i], suffix[i])- height[i];
        }
        return ans;
    }
};
