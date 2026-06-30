class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0, left = 0;

        int distinctCount = 0;
        Map<Character,Integer>freq=new HashMap<>();
        int maxi=0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
            maxi = Math.max(maxi, freq.get(ch));

            while ((right - left + 1) - maxi > k) {
                int f=freq.get(s.charAt(left));
                f--;
                if(f==0) freq.remove(s.charAt(left));
                else freq.put(s.charAt(left),f);
                left++;
            }
                maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}