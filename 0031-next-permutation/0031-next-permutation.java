class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for (int i = n-2; i >= 0; i--){ //find the dip
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if( index == -1){ //edge case
            reverse(nums, 0 , n-1);
            return;
        }
        for(int i = n-1; i>= index; i--){ //find the next greatest and swap
            if(nums[i] > nums[index]){
                swap(nums, i, index);
                break;
            }
        }
        reverse(nums, index + 1, n - 1); //reverse the rest of the array
        
        
    }

    private void reverse(int[] arr, int start , int end){
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    private void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

