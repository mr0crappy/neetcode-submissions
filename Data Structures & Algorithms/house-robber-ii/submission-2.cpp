class Solution {
public:
    int sep(vector<int>& nums){
        vector<int> dp(nums.size());
        if(nums.size() == 1)
            return nums[0];
        dp[0] = nums[0];
        dp[1] = max(nums[0], nums[1]);
        for(int i = 2; i<nums.size(); i++){
            dp[i] = max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[nums.size()-1];
    } 
    int rob(vector<int>& nums) {
        if(nums.size() == 1)
            return nums[0];
        int n = nums.size();
        vector<int> first(nums.begin(), nums.end()-1);
        vector<int> second(nums.begin()+1, nums.end());
        return max(sep(first), sep(second));
    }
};
