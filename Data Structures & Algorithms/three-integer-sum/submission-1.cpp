class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        sort(nums.begin(), nums.end());
        for(int i = 0; i<nums.size()-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int a = nums[i];
            int start = i+1;
            int end = nums.size()-1;
            while(start<end){
                int b = nums[start];
                int c = nums[end];
                if(a+b+c == 0){
                    ans.push_back({a,b,c});
                    start = start+1;
                    end = end-1;
                    while (start < end && nums[start] == nums[start - 1])
    start++;

while (start < end && nums[end] == nums[end + 1])
    end--;
                }
                else if(a+b+c >0){
                    end = end-1;
                }
                else{
                    start = start +1;
                }
            }
        }
        return ans;

    }
};
