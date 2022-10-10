class Solution {
    public int maxSubArray(int[] nums) {
        int currentmax=nums[0];
        int maxsofar=nums[0];int max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            currentmax=Math.max(nums[i],currentmax+nums[i]);
            maxsofar=Math.max(maxsofar,currentmax);
            
        }
        return maxsofar;
    }
}