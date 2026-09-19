class Solution {
    public int heightChecker(int[] heights) {
        int temp[]=new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            temp[i] = heights[i];
        }
        Arrays.sort(heights);
        int n=heights.length;
        int a=0;
        int count=0;
        while(a<n){
            if(temp[a]!=heights[a]){
                count++;
            }
            a++;
        }
        return count;
    }
}