class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                c++;
                sum = Math.max(sum,c);
            }
            else{
                c = 0;
            }
        }
        return sum;
    }
}