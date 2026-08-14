class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int count = 1;
        int ans = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                count++;
            }
            else{
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        ans = Math.max(count, ans);
        count = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                count++;
            }
            else{
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        ans = Math.max(count, ans);
        return ans;
    }
}