class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> x;
        for(int y=0; y<nums.size(); y++){
            if(x.find(nums[y])!=x.end())
                return true;
            else
                x.insert(nums[y]);
        }
        return false;
    }
};