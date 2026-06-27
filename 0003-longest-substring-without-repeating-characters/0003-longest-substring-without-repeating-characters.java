class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();

        int n = s.length();
        int l = 0;
        int r = 0;
        int maxi = 0 ;
        while(r<n){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                maxi = Math.max(maxi, r-l+1);
                r++;
            }
            else{
                
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxi;
    }
}