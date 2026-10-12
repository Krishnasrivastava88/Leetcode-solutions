class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int length = 0;
        int n = s.length();
        int max = 0;
        while(right<n){
            char cur = s.charAt(right);
            for(int i=left;i<right;i++){
                char exist = s.charAt(i);
                if(cur == exist){
                    left = i+1;
                    break;
                }
            }
                length = right - left + 1;
                max = Math.max(max, length);
                right++;
                }
        return max;
    }
}
