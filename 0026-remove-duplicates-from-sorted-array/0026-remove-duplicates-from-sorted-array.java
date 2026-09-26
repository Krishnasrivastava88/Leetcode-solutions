class Solution {
    public int removeDuplicates(int[] nums) {
        int prev=nums[0];
        int a=1;
        for(int i=1;i<nums.length;i++){
            if(prev!=nums[i]){
                nums[a++]=nums[i];
                prev=nums[i];
                
            }
        }
        return a;
        

    }
}
//0  and 0