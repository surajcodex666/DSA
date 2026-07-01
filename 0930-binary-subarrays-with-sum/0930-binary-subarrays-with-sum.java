class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
        
    }

    private int atMost(int []nums, int k){
        
        int n = nums.length;
        int l = 0;
        int r = 0;
        int sum = 0;
        int cnt = 0; 

        if(k < 0){
            return 0;
        }

        while(r < n){
            sum += nums[r];

            while(sum > k){
                sum -= nums[l];
                l++;
            }
            cnt = cnt + ( r - l + 1);
            r++;
        }
        return cnt;
    }
}