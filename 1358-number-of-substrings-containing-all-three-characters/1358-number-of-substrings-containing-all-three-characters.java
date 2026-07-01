class Solution {
    public int numberOfSubstrings(String s) {

        int n = s.length();
        int[] freq = {-1, -1, -1};
        int l = 0;
        int cnt = 0;
        for(int r = 0; r < n; r++){
            freq[s.charAt(r) - 'a'] = r;
            if(freq[0] != -1 && freq[1] != -1 && freq[2] != -1){
                cnt = cnt + ( 1 + Math.min(freq[0], Math.min(freq[1],freq[2])));
            }
        }
        return cnt;
        
    }
}