class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        int n= nums.length;
        for(int i=0;i<n;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
    
            if (Math.abs(target - sum) < Math.abs(target - closest)) {
                closest = sum;
            }
            if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    return sum;
                }
            }



        }
        return closest;
    
    }
}