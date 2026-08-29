class Solution {
    public int[] findErrorNums(int[] nums) {
        int x = 0;
        int y = 0;

        for(int i =1; i<=nums.length; i++){
            x+= nums[i-1]-i;
            y+= nums[i-1]*nums[i-1]-i*i;
        }

        int missing = (y-x*x)/(2*x);
        int dup = missing +x;
        return new int[]{dup, missing};
    }
}