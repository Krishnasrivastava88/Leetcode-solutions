class Solution {
    public int minOperations(int[] nums) {
        int n= nums.length;
        int count=0;
        for(int i=1;i<n;i++){
            while(nums[i-1]>=nums[i]){
                nums[i]=nums[i]+1;
                count++;
            }
        }
        return count;
        
    }
}