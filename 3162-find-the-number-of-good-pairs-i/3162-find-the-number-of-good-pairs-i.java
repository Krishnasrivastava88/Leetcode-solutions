class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n= nums1.length;
        int count=0;
        int m= nums2.length;
        for( int i=0;i<n;i++){
            for( int j=0;j<m;j++){
                int x= nums2[j]*k;
                if(nums1[i]%x==0){
                    count++;
                }
            }
        }
        return count;
        
    }
}