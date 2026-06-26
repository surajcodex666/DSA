class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i =0; i<n; i++){
            
            sum = sum + nums[i]; //we can also do for(int i=1 --> n)num[i] = num[i] + nums[i-1]
            nums[i] = sum;

        }
        return nums;
    }
}