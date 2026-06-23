import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

      
        if (n == 0) return 0;

        
        int longest = 1; 

        
        Set<Integer> st = new HashSet<>();

        // set remove duplicates
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        /* Loop through each element in the set to find 
           the starting point of consecutive sequences */
        for (int it : st) {
            // If there is no number before 'it', it’s the start of a sequence
            if (!st.contains(it - 1)) {
                int cnt = 1; 
                int x = it; 

                // Keep checking for the next consecutive number
                while (st.contains(x + 1)) {
                    x = x + 1; 
                    cnt = cnt + 1; 
                }
                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}

  