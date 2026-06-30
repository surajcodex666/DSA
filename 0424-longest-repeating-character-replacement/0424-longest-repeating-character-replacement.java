class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0, left = 0;

        int distinctCount = 0;
        int[] freq = new int[26];
        int maxi=0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            maxi = Math.max(maxi, freq[ch-'A']);

            while ((right - left + 1) - maxi > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
                maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}