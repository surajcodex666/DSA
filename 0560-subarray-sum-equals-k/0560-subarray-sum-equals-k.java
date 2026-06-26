class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;

        // Map to store frequency of prefix sums
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        // Base case: prefix sum 0 has occurred once
        prefixSumCount.put(0, 1);

        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // Add current element to prefix sum
            prefixSum += arr[i];

            // Calculate the prefix sum that needs to be removed
            int removeElement = prefixSum - k;

            // If this prefix sum has been seen before,
            // add its count to the result
            if (prefixSumCount.containsKey(removeElement)) {
                count += prefixSumCount.get(removeElement); //gets the value assosciated with the key
            }

            // Update the frequency of the current prefix sum
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1); //if found the prefixsum's value + 1 or 0 + 1
        }

        // Return the total count of subarrays
        return count;
    }
}
